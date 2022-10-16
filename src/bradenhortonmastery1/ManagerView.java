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
import java.util.ArrayList;

/**
 *
 * @author brade
 */

public class ManagerView extends State{
     ArrayList<TravelAgencyEmployee> emp = new ArrayList<>();
    
    void enter(){
       
        System.out.println("1. Add Employee");
        System.out.println("2. Remove Employee");
        System.out.println("3. List Employees");
        System.out.println("4. Make Employee A Manager");
        System.out.println("5. Manage Lodges");
        System.out.println("6. Log out");
      
     
    }
    // in the update method, you can see that i switch scanners about half way down, for some reason this was the only way 
    // to get the scanner to stop skipping lines before i could input anything. i also learned that it skips if i type something with 
    // a space in it. I havent found the programming remedy to this yet. Ive tried switching to nextLine and it continued skipping
    void update(){
           Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        switch(input){
            case "1":
                System.out.println("Enter the name of the employee");
                Scanner i = new Scanner(System.in);
               String empName = i.nextLine();
                
                System.out.println("Enter employee's phone number");
               
                String empPhone = i.nextLine();
                System.out.println("Enter employee's address");
                String empAddress = i.nextLine();
                System.out.println("Is this employee a manager? Enter true or false");
                boolean mng = s.nextBoolean();
                s.nextLine();
                System.out.println("Enter the employee's hire date");
                String hireDate = s.nextLine();
                System.out.println("Enter the employee's ID number");
                int idNum = s.nextInt();
                System.out.println("Enter the employee's salary");
                double sal = s.nextDouble();
                emp.add(new TravelAgencyEmployee(empName, empPhone, empAddress, mng, hireDate, idNum, sal));
                System.out.println("This employee has been added");
                break;
            case "2":
                for(int j = 0; j < emp.size(); j++){
                    System.out.println( (j+1) );
                    System.out.println(emp.get(j).toString());
                }
                System.out.println("Choose the employee you want to remove");
                int remove = s.nextInt();
                emp.remove(remove - 1);
                System.out.println("This employee has been removed");
                break;
            case "3":
                   for(int j = 0; j < emp.size(); j++){
                    System.out.println( (j+1) );
                       System.out.println( emp.get(j).toString());
                }
                break;
            case "4":
                 for(int j = 0; j < emp.size(); j++){
                    System.out.println( (j+1) );
                     System.out.println(emp.get(j).toString());
                }
                 System.out.println("Choose the employee you want to make a manager");
                 int man = s.nextInt();
                 emp.get(man - 1).isAManager = true;
                 System.out.println("This employee is now a manager");
                break;
            case "5":
                current = employee;
                break;
            case "6":
                current = login;
                break;
        }
        
    }

       void load(){
          
        try{
            
            boolean man;
          
            FileReader fr = new FileReader("employees.txt");
            BufferedReader ReadFile = new BufferedReader(fr);
           String line = "";
           String[] members;
         
          while((line = ReadFile.readLine()) != null){
           
            members = line.split(",");
               int empID; double salary;
              empID = Integer.parseInt(members[5]);
              salary = Double.parseDouble(members[6]);
             if(members[3].equalsIgnoreCase("true")){
                 man = true;
             }
             else{
                 man = false;
             }
            emp.add(new TravelAgencyEmployee(members[0], members[1], members[2], man, members[4], empID, salary));
            
             
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
           
        FileWriter fw = new FileWriter("employees.txt", false);
        BufferedWriter WriteFile = new BufferedWriter(fw);
        
        for(int i = 0; i < emp.size(); i++){
            String line = emp.get(i).name + "," + emp.get(i).phone + "," + emp.get(i).address + "," + emp.get(i).isAManager + "," + emp.get(i).hireDate + "," + emp.get(i).idNumber + "," + emp.get(i).salary;
            WriteFile.append(line);
            WriteFile.newLine();
        
        }
 
        WriteFile.close();
               fw.close();
        
        } catch(Exception e){
            System.out.println("Error occured.");
        }
        
    }
           
           
        
    
    
    
}
