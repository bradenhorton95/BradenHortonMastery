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
public class Login extends State {

    // i used the customer class here for the employee and manager since the person class had the loginName and password member variables
    ArrayList<Customer> users = new ArrayList<>() {
        {
            add(new Customer("Emily", "3256548855", "45 valor", "Employee", "password"));
            add(new Customer("Steven", "7899874465", "23 weaver", "Manager", "password"));

        }
    };

    public static String username;

    void enter() {

        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Continue as Guest");
        System.out.println("4. Exit");

    }

    void update() {

        Scanner s = new Scanner(System.in);
        String input = s.next();
        switch (input) {

            case "1":

                boolean found = false;

                System.out.println("");
                System.out.println("Enter username:");
                Scanner u = new Scanner(System.in);
                username = u.next();
                System.out.println("Enter password: ");
                Scanner p = new Scanner(System.in);
                String password = p.next();
                for (int i = 0; i < users.size(); i++) {

                    if (users.get(i).loginName.equals(username) && users.get(i).password.equals(password)) {
                        found = true;
                        if (users.get(i).loginName.equals("Manager") || users.get(i).loginName.equals("Employee")) {
                            System.out.println("Login Successful");
                            System.out.println("");
                            current = employee;
                        } else {
                            System.out.println("Login successful");
                            System.out.println("");
                            current = customer;
                        }

                    }

                }
                if (found == false) {
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Invalid username or password");
                    System.out.println("Make another selection");
                    System.out.println("");

                }

                break;

            case "2":
                System.out.println("");
                System.out.println("Enter your name");
                Scanner n = new Scanner(System.in);
                String name = n.nextLine();

                System.out.println("Enter your phone number");
                String phone = n.nextLine();

                System.out.println("Enter your address");
                String address = n.nextLine();
                System.out.println("Enter your username");
                String username = n.nextLine();
                System.out.println("Enter your password, must be at least 6 characters, 1 capital letter, 1 special character. ");
                System.out.println("Special character must be one of the following: !@#$%^&*()");
                Scanner t = new Scanner(System.in);
                String p1 = t.nextLine();
                boolean passUp = false;
                boolean special = false;
                
               
                    while (p1.length() < 6) {
                        System.out.println("INVALID PASSWORD FORMAT");
                        System.out.println("Password must be atleast 6 characters long");
                        System.out.println("Enter another password");
                        p1 = t.nextLine();
                    }
                    while(!(passUp && special)){
                        
                    String pv = "!@#$%^&*()";
                    
                    for (int i = 0; i < p1.length(); i++) {
                        if (Character.isUpperCase(p1.charAt(i))) {
                            passUp = true;

                        }
                       
                        for(int j = 0; j < p1.length(); j++){
                            if(p1.charAt(i) == pv.charAt(j)){
                                special = true;
                            }
                        }

                    }
                     if(!(passUp && special)){
                         System.out.println("INVALID PASSWORD FORMAT");
                        System.out.println("You must you atleast one upper case character and one special character");
                        passUp = false;
                        p1 = t.nextLine();
                       
                    }
                    
                    
                    
                    
                    }
                    System.out.println("YOU HAVE BEEN REGISTERED");
                    users.add(new Customer(name, phone, address, username, p1));
                break;
            case "3":

                current = customer;
                break;
            case "4":
                System.exit(0);
                break;

        }
    }
}
