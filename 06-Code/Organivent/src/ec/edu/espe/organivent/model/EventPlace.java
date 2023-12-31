package ec.edu.espe.organivent.model;

import com.google.gson.reflect.TypeToken;
import ec.edu.espe.organivent.utils.HandleInput;
import ec.edu.espe.organivent.utils.ManageJson;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Frederick Tipan, Gabriel Vivanco, Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
public class EventPlace {

    private String name;
    private String adress;
    private float rentCost;
    private int capacity;
    
    public static ArrayList<EventPlace> getFromFile(){
        Type type = new TypeToken<ArrayList<EventPlace>>(){}.getType();
        ArrayList<EventPlace> eventPlaceList = ManageJson.readFile("data/event_places.json",type);
        return eventPlaceList;
    }
    
     public static void menu(){
        ArrayList<EventPlace> eventPlaceList = EventPlace.getFromFile();
        Scanner scanner = new Scanner(System.in, "ISO-8859-1");
        int option;
        do {
            System.out.println("---------- Event Place Manager ------------");
            System.out.println("-------------------------------------------");
            System.out.println("|    1.- See the current event places     |");
            System.out.println("|    2.- Add a new event place            |");
            System.out.println("|    3.- Return                           |");
            System.out.println("___________________________________________");
            System.out.println("Select an option (1-3): ");
            option = HandleInput.insertInteger();
            switch (option) {
                case 1:
                    seeEventPlaces(eventPlaceList);
                    System.out.println("\nPress any button to return");
                    scanner.nextLine();
                    break;
                case 2:
                    eventPlaceList.add(addEventPlace());
                    ManageJson.writeFile("data/event_places.json",eventPlaceList);
                    System.out.println("\nDone! Press any button to return");
                    scanner.nextLine();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (option != 3);
    
    }
    
    private static EventPlace addEventPlace(){
        
        Scanner scanner = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("Enter the place's name:");
        String name = scanner.nextLine();
        System.out.println("Enter the place's adress:");
        String adress = scanner.nextLine();
        System.out.println("Enter the place's rent cost:");
        float rentCost = HandleInput.insertFloat();
        System.out.println("Enter the place's capacity:");
        int capacity = HandleInput.insertInteger();

        return new EventPlace(name, adress, rentCost, capacity);
    }
    
    
    private static void seeEventPlaces(ArrayList<EventPlace> eventPlaceList){
        System.out.println("===================================== Event Places List ====================================");
        System.out.println("             Name             |            Adress            |  Rent Cost | Capacity (seats)");
        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
         for(EventPlace currentEventPlace : eventPlaceList) {
            System.out.println(currentEventPlace);
        }
    }
    
    public static EventPlace searchForPlace(){
        Scanner scanner = new Scanner(System.in, "ISO-8859-1");
        ArrayList<EventPlace> eventPlaceList = getFromFile();
        
        EventPlace eventPlace=null;
        String searchName;
        boolean passed=false;
        int sizeCount=0;
        
        do{
            sizeCount=0;
            System.out.println("Enter the place where the event is going to be:");
            searchName = scanner.nextLine();
            
            for(EventPlace currentEventPlace : eventPlaceList) {
                if(currentEventPlace.getName().equals(searchName)){
                    eventPlace = currentEventPlace;
                    passed=true;
                    break;
                }
                sizeCount++;
            }
            
            if(sizeCount==eventPlaceList.size()){
                System.out.println("The place: " + searchName + " was not found");
            }
        }while(passed==false);
        
        
        return eventPlace;
    }

    @Override
    public String toString() {
        return String.format("%-30s|%-30s|$ %-10.2f|%-14d", name,adress,rentCost,capacity);
    }

    public EventPlace(String name, String adress, float rentCost, int capacity) {
        this.name = name;
        this.adress = adress;
        this.rentCost = rentCost;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public float getRentCost() {
        return rentCost;
    }

    public void setRentCost(float rentCost) {
        this.rentCost = rentCost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    
}
