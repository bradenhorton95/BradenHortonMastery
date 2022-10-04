/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bradenhortonmastery1;
import java.util.*;

/**
 *
 * @author brade
 */

public class EmployeeView extends State{
    public static  ArrayList<Lodging> lodge =  new ArrayList<>(){{
    add(new House("The Lamore Hosue", "748-938-0990","34 traveler", 5, 125, 2 ) );
        add( new House("The beach house", "745-857-3774", "345 grover", 8, 234, 4));
        add( new Hotel("The Marriot", "345-345-9586","34 Cramer",4, 123, 34, 12.99, true  ));
        add( new Hotel("Value Inn", "785-845-7883","746 Harrow",2, 78, 12, 4.99, false  ));
    
    
    
    }};
         String name, phone, address;
         int occupants, basePrice, vacancies, numOfRooms;
         double parkFee;
         boolean breakfast;
    public static boolean isManager;
        

    void enter(){

           
   
        
        
        System.out.println("1. Add Lodge");
        System.out.println("2. Remove Lodge");
        System.out.println("3. List Lodges");
        System.out.println("4. Log out");
        if(Login.username.equals("Manager")){
            System.out.println("5. Manager View");
        }
        
    }
    void update(){
        
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        switch(input){
            case "1":
                System.out.println("Enter 'Hotel' or 'House'");
                Scanner i = new Scanner(System.in);
               String which = i.nextLine();
               
                System.out.println("Enter name of the lodge");
                name = i.nextLine();
                System.out.println("Enter the phone number");
                phone = i.nextLine();
                System.out.println("Enter the address");
                address = i.nextLine();
                System.out.println("Enter the max amount of occupants");
                occupants = i.nextInt();
                System.out.println("Enter base price per night");
                basePrice = i.nextInt();
                
                if(which.equals("Hotel")){
                System.out.println("Enter the amount of vacanies");
                vacancies = i.nextInt();
                System.out.println("Enter the parking fee");
                parkFee = i.nextDouble();
                System.out.println("Does this lodge have free breakfast? Enter 'true' or 'false'");
                breakfast = i.nextBoolean();
                lodge.add(new Hotel(name, phone, address, occupants, basePrice, vacancies, parkFee, breakfast));
                    System.out.println("This lodge has been added");
                    System.out.println("");
                  
                    
                } else {
                    System.out.println("Enter number of bedrooms");
                    numOfRooms = i.nextInt();
                    lodge.add(new House(name, phone, address, occupants, basePrice, numOfRooms));
                    System.out.println("This lodge has been added");
                    
                    
                     System.out.println("");
                }
                
                        break;
            case "2":
                System.out.println("");
               
                  for(int j  = 0; j < lodge.size(); j++){
                      System.out.println(j + 1);  System.out.println(lodge.get(j).toString());
                       
                    System.out.println("--------------------------------------");
                  }
                  System.out.println("");
                System.out.println("Select the lodge that you want to remove");
                Scanner u = new Scanner(System.in);
                int remove = u.nextInt();
                lodge.remove(remove - 1);
                System.out.println("This lodge has been removed from the list");
                
                break;
            case "3":
                System.out.println("");
                for(int j = 0; j < lodge.size(); j++){
                    System.out.println(j + 1);
                    System.out.println(lodge.get(j).toString());
                    System.out.println("-------------------------");
                }
               
                break;
            case "4":
                current = login;
                break;
            case "5":
                current = manager;
                break;
           
                
        }
    }
    
    
}
