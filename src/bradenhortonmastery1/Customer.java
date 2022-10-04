/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bradenhortonmastery1;

/**
 *
 * @author brade
 */
public class Customer extends Person {
    public String loginName;
    public String password;
    public Customer(){
        super();
 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        loginName = "Default";
        password = "Default";
    }
    public Customer(String n, String p, String a,String l, String pa){
        super( n,p, a);
        loginName = l; password = pa;
    }
    @Override
    public String toString(){
        
      String dis = super.toString() + ("\nLogin name: " + loginName + "\nPassword: "  + password);
      return dis;
    }
}
