/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bradenhortonmastery1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

/**
 *
 * @author brade
 */

public class EmployeeView extends State{
    public static  ArrayList<Lodging> lodge =  new ArrayList<>();
    
    
    
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
       void load(){
        
        try{
            File file = new File("lodges.txt");
            FileReader fr = new FileReader(file);
            BufferedReader ReadFile = new BufferedReader(fr);
           String line = "";
           String[] members;
           lodge.clear();
          while((line = ReadFile.readLine()) != null){
             
            members = line.split(",");
            if(members[0].equalsIgnoreCase("Hotel")){
                int occ = Integer.parseInt(members[3]);
             int vac = Integer.parseInt(members[5]);
             double base = Double.parseDouble(members[4]);
             double park = Double.parseDouble(members[6]);
             boolean breakfast = Boolean.parseBoolean(members[7]);
                lodge.add(new Hotel(members[0], members[1], members[2], occ, base, vac, park, breakfast));
            }
            else {
                 int occ = Integer.parseInt(members[3]);
                 double base;
                base = Double.parseDouble(members[4]);
                 int room = Integer.parseInt(members[5]);
                lodge.add(new House(members[0], members[1], members[2], occ, base, room));
            }
             
           }
       
          ReadFile.close();
          fr.close();
         
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
       void save(){
        
        try {
           
        FileWriter fw = new FileWriter("lodges.txt", false);
        BufferedWriter WriteFile = new BufferedWriter(fw);
      
        for(int i = 0; i < lodge.size(); i++){
          
             String   line = lodge.get(i).name + "," + lodge.get(i).phone + "," + lodge.get(i).address + "," + lodge.get(i).maxOccupants + "," + lodge.get(i).basePricePerNight ;
         
            WriteFile.append(line);
            WriteFile.newLine();
        }
 
        WriteFile.close();
             
        
        } catch(Exception e){
            System.out.println("Error occured.");
        }
        
    }
    
    
}
