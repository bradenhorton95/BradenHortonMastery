/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bradenhortonmastery1;

/**
 *
 * @author brade
 */
public class Hotel extends Lodging{
    public int vacancies;
    
    public double parkingFee;
    public boolean hasFreeBreakfast;
    
    public Hotel(){
        vacancies = 0;
        parkingFee = 0;
        hasFreeBreakfast = false;
        
    }
    public Hotel(String n, String p, String a, int m, double b, int v, double f, boolean free){
        super(n,p,a,m,b);
        vacancies = v; parkingFee = f; hasFreeBreakfast = free;
    }
    @Override
    public  String toString(){
        
        String dis =  super.toString() + ("\nVacancies : " + vacancies  + 
                "\nParking Fee: $" + String.format("%.2f", parkingFee) + "\nHas free Breakfast: " + hasFreeBreakfast );
        return dis;
    }
}
