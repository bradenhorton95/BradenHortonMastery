/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bradenhortonmastery1;

/**
 *
 * @author brade
 */
public class TravelAgencyEmployee extends Person {
    public boolean isAManager;
    public String hireDate;
    public int idNumber;
    public double  salary;
    public TravelAgencyEmployee(){
        
        
        isAManager = true;
        hireDate = "Default";
        idNumber = 0000;
        salary = 00000;
    }
    public TravelAgencyEmployee(String n, String p, String a, boolean t, String h, int i, double s){
        super(n,p,a);
        isAManager = t;
        hireDate = h;
        idNumber = i;
        salary = s;
    }
   @Override
    public String toString(){
       
        String dis =  super.toString() +  ("\nIs a manager: " + isAManager + "\nHire date: " + hireDate + "\nID Number: " + idNumber + "\nSalary: $" + String.format("%.2f", salary));
        return dis; 
        
    }
    
}
