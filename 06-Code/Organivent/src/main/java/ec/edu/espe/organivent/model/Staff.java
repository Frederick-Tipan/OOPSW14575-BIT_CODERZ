package ec.edu.espe.organivent.model;

import com.google.gson.reflect.TypeToken;
import com.mongodb.client.MongoCollection;
import ec.edu.espe.organivent.utils.HandleInput;
import ec.edu.espe.organivent.utils.ManageJson;
import ec.edu.espe.organivent.utils.UseMongoDB;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Frederick Tipan, Gabriel Vivanco, Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
public class Staff {
    
    private int id;
    private String type;
    private ArrayList<Employee> employees;
    private float totalStaffCost;
    private int daysWorked;
    private int hoursWorked;
    
    
    public static ArrayList<Staff> getFromFile(){
        Type type = new TypeToken<ArrayList<Staff>>(){}.getType();
        ArrayList<Staff> staffList = ManageJson.readFile("data/staff.json",type);
        return staffList;
    }
    
    private static MongoCollection<Staff> getFromDB(){
        Class classType = Staff.class;
        String collectionName = "Staff";
        
        MongoCollection<Staff> staffInDB = UseMongoDB.getFromCollection(collectionName, classType);  
        
        return staffInDB;        
    }
    
    public static void menu(){
        Scanner scanner = new Scanner(System.in, "ISO-8859-1");
        int option;
        do {
            System.out.println("---------------- Staff Manager ----------------");
            System.out.println("-----------------------------------------------");
            System.out.println("|    1.- See the current Staff List           |");
            System.out.println("|    2.- Add a new staff group                |");
            System.out.println("|    3.- Calculate the payment of an Staff    |");
            System.out.println("|    4.- Return                               |");
            System.out.println("_______________________________________________");
            System.out.println("Select an option (1-4): ");
            option = HandleInput.insertInteger();
            switch (option) {
                case 1:
                    seeStaff();
                    System.out.println("\nPress any button to return");
                    scanner.nextLine();
                    break;
                case 2:
                    addStaff();
                    System.out.println("\nDone! Press any button to return");
                    scanner.nextLine();
                    break;
                case 3:
                    searchStaff();
                    System.out.println("\nDone! Press any button to return");
                    scanner.nextLine();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (option != 4);
    
    }
    
    private static void addStaff(){
        
        MongoCollection<Staff> staffInDB = Staff.getFromDB();
        
        ArrayList<Staff> staffList = new ArrayList<>();
        staffInDB.find().into(staffList);
        
        int asignId = staffList.size()+1;
        int daysWorked=0;
        int hoursWorked=0;

        System.out.println("Enter the staff type:");
        String staffType = HandleInput.insertNonBlankString();

        ArrayList<Employee> employees = Employee.enterEmployees();
        
        do{
            System.out.println("Enter the employee's work days");
            daysWorked = HandleInput.insertInteger();
        }while(daysWorked<1);
        
        do{
            System.out.println("Enter the employee's work hours per day");
            hoursWorked = HandleInput.insertInteger();
        }while(hoursWorked<1 || hoursWorked>24);

        float totalStaffCost = calculateTotalCost(employees,(daysWorked*hoursWorked));
        Staff generatedStaff = new Staff(asignId, staffType, employees, totalStaffCost, daysWorked, hoursWorked);
        
        staffInDB.insertOne(generatedStaff);
    }
    
    
    private static float calculateTotalCost(ArrayList<Employee> employees, int workingHours){
        float costPerHour = 0;
        float totalStaffCost = 0;
        
        for(Employee currentEmployee : employees) {
            costPerHour = ((currentEmployee.getWage()) * workingHours);
            totalStaffCost += costPerHour;
        }
        
        return totalStaffCost;
    }
   
    private static void seeStaff(){
        MongoCollection<Staff> staffInDB = Staff.getFromDB();
        ArrayList<Staff> staffList = new ArrayList<>();
        staffInDB.find().into(staffList);
        
        System.out.println("================================= Staff List =================================");
         for(Staff currentStaff : staffList) {
            System.out.println("\nId: " + currentStaff.getId() + " '" + currentStaff.getType() + "' " + ", Working Days: " + currentStaff.getDaysWorked() + ", Working Hours: " + currentStaff.getHoursWorked());
            Employee.seeEmployees(currentStaff.getEmployees());
        }
    }
    
    public static ArrayList<Staff> enterStaff(){
        ArrayList<Staff> staffInEvent = new ArrayList<>();
        
        int searchId;
        int addMore=1;
        boolean passed=false;
        int sizeCount=0;
        
        do{
            sizeCount=0;
            System.out.println("Insert the Staff group Id to add");
            searchId = HandleInput.insertInteger();
            
            for(Staff currentStaff : staffInEvent) {
                if(currentStaff.getId() == searchId){
                    System.out.println("The Id: " + searchId + " is already in this event");
                    passed=false;
                    break;
                }
                sizeCount++;
            }
            if(sizeCount==staffInEvent.size()){
                addMore = addStaffInEvent(staffInEvent,searchId);
            }
        }while(passed==false && addMore == 1);
        
        return staffInEvent;
    }
    
    public static int addStaffInEvent(ArrayList<Staff> staffInEvent, int searchId){
        
        MongoCollection<Staff> staffInDB = Staff.getFromDB();
        
        ArrayList<Staff> staffList = new ArrayList<>();
        staffInDB.find().into(staffList);
        
        int addMore=1;
        boolean passed=false;
        int sizeCount=0;
        
        do{
            sizeCount=0;
            for(Staff currentStaff : staffList) {
                if(currentStaff.getId() == searchId){
                    staffInEvent.add(currentStaff);
                    passed=true;
                    System.out.println("Want to add another Staff group? 1) Yes - 2) No");
                    addMore = HandleInput.insertInteger();
                    break;
                }
                sizeCount++;
            }
            if(sizeCount==staffList.size()){
                System.out.println("The Id: " + searchId + " was not found");
                passed=true;
            }
        }while(passed==false && addMore == 1);
        
        return addMore;
    }
    
    private static void searchStaff(){
        MongoCollection<Staff> staffInDB = Staff.getFromDB();
        ArrayList<Staff> staffList = new ArrayList<>();
        staffInDB.find().into(staffList);
        
        System.out.println("Enter the Staff Id:");
         int id = HandleInput.insertInteger();
         int sizeCount=0;
        
         for(Staff currentStaff : staffList) {
             if(id == currentStaff.getId()){
                calculateStaffPayment(currentStaff);
                break;
            }
            sizeCount++;
        }
        if(sizeCount==staffList.size()){
            System.out.println("The Id: " + id + " was not found");
        }
    }
    
    private static void calculateStaffPayment(Staff currentStaff){
        int workingHours = (currentStaff.getDaysWorked()* currentStaff.getHoursWorked());
        float individualPayment=0;
        float totalStaffCost = 0;
        
        System.out.println("===[Staff " + currentStaff.getId() + " cost details]===");
        System.out.println("For " + workingHours + " working hours");
        System.out.println("Employees:");
        for(Employee currentEmployee : currentStaff.getEmployees()) {
            individualPayment = ((currentEmployee.getWage()) * workingHours);
            System.out.println(" Id:" + currentEmployee.getId() + " " + currentEmployee.getName() + " Payment = $" + individualPayment);
            totalStaffCost += individualPayment;
        }
        System.out.println("-------------------------------------");
        System.out.println("      Total Staff cost = $" + totalStaffCost);
    }

    public Staff(int id, String type, ArrayList<Employee> employees, float totalStaffCost, int daysWorked, int hoursWorked) {
        this.id = id;
        this.type = type;
        this.employees = employees;
        this.totalStaffCost = totalStaffCost;
        this.daysWorked = daysWorked;
        this.hoursWorked = hoursWorked;
    }
    
    public Staff(){
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the employees
     */
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    /**
     * @param employees the employees to set
     */
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    /**
     * @return the totalStaffCost
     */
    public float getTotalStaffCost() {
        return totalStaffCost;
    }

    /**
     * @param totalStaffCost the totalStaffCost to set
     */
    public void setTotalStaffCost(float totalStaffCost) {
        this.totalStaffCost = totalStaffCost;
    }

    /**
     * @return the daysWorked
     */
    public int getDaysWorked() {
        return daysWorked;
    }

    /**
     * @param daysWorked the daysWorked to set
     */
    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    /**
     * @return the hoursWorked
     */
    public int getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    
    
}