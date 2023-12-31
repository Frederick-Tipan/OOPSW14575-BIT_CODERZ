package ec.edu.espe.organivent.view;

import ec.edu.espe.organivent.model.Administrator;
import ec.edu.espe.organivent.utils.HandleInput;
import java.util.ArrayList;
import ec.edu.espe.organivent.utils.ManageJson;

/**
 *
 * @author Frederick Tipan, Gabriel Vivanco, Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
public class OrganiventSystem {

    public static void main(String[] args) {
        
        ArrayList<Administrator> administratorList = Administrator.getFromFile();
        
        int option;
        
        do{
            System.out.println("----- ORGANIVENT SYSTEM -----");
            System.out.println("-----------------------------");
            System.out.println("_____________________________");
            System.out.println("|    1.- Log in              |");
            System.out.println("|    2.- Register            |");
            System.out.println("|    3.- Exit                |");
            System.out.println("_____________________________");
            System.out.println("");
            System.out.println("Select an option (1-3): ");
            option = HandleInput.insertInteger();
            switch (option){
                case 1:
                    Administrator.logIn(administratorList);
                    break;
                case 2:
                    administratorList.add(Administrator.registerAdministrator(administratorList));
                    ManageJson.writeFile("data/administrators.json",administratorList);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        
        }while(option != 3);

    }
   
}
