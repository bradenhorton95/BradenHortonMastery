/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bradenhortonmastery1;
import java.util.*;
import java.util.ArrayList;
/**
 *
 * @author brade
 */
public class CustomerView extends State {
   public  int listSize = EmployeeView.lodge.size();
    public int choice;
    public double price, base, total;
     String confirm;
    void enter(){
        System.out.println("1. View Lodges with price per night");
        System.out.println("2. View Order");
        System.out.println("3. Exit");
   
    }
    void update(){
    Scanner i = new Scanner(System.in);
    String input = i.next();
    switch(input){
        case "1":
            for(int j = 0; j < listSize; j++){
                System.out.println(j + 1);
                System.out.println(EmployeeView.lodge.get(j).name);
                System.out.println("$" + String.format("%.2f",EmployeeView.lodge.get(j).basePricePerNight));
                System.out.println("");
                
            }
            
            System.out.println("Choose your lodge or enter 99 to return to previous menu");
            int c = i.nextInt();
            if(c == 99){
              
                break;
            }
            choice = c - 1;
            System.out.println("Enter the number of days you want");
            int num = i.nextInt();
            
           base = EmployeeView.lodge.get(choice).basePricePerNight;
           total = base * num;
          
            break;
        case "2": 
           
            if(total > 0){
            System.out.println("");
            System.out.println("YOUR ORDER ");
            System.out.println("");
            System.out.println(EmployeeView.lodge.get(choice).toString());
            System.out.println("TOTAL COST");
             System.out.println("$" + String.format("%.2f",total));
             System.out.println("");
             System.out.println("");
             System.out.println("a. Confirm Order");
             System.out.println("b. Cancel Order");
             System.out.println("c. Return");
             Scanner k = new Scanner(System.in);
             confirm = k.next();
            }
            else if (total <= 0){
                System.out.println("YOUR CART IS EMPTY");
                System.out.println("");
                break;
            }
             switch(confirm){
                 case"a":
                     System.out.println("THANK YOU FOR CONFIRMING YOUR ORDER. HAVE A GREAT DAY!!");
                     System.out.println("");
                     total = 0;
                     
                     break;
                 case "b":
                     System.out.println("YOUR ORDER HAS BEEN CANCELLED");
                     System.out.println("");
                     total = 0;
                  
                        break;
                 case "c":
                     break;
             }
            break;
        case "3":
            current = login;
            break;
            
          
    }
    }
    
    
    
        
}
