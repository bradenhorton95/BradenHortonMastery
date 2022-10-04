/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bradenhortonmastery1;

/**
 *
 * @author brade
 */
public abstract class Person {
    public String name;
    public String phone;
    public String address;
    
    public Person(){
        name = "Default"; 
        phone = "555-555-5555";
        address = "1234 Default ln";
        
    }
    public Person(String n, String p, String a){
        name = n; phone = p; address = a;
    }
    @Override
    public String toString(){
       String dis = ("Name: " + name + "\nPhone: " + phone + "\nAddress: " + address);
        return dis;
    }
}
