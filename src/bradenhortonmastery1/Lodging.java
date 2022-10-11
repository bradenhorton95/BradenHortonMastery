/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bradenhortonmastery1;

/**
 *
 * @author brade
 */
public abstract class  Lodging {
     public String name;
     public String phone;
    public  String address;
    public int maxOccupants;
    public double basePricePerNight;
    public Lodging(){
        name = "Default";
        phone = "default phone";
        address = "default address";
        maxOccupants = 0;
        basePricePerNight = 0;
    }
    public Lodging(String n, String p, String a, int m, double b){
        name =n; phone =p; address = a; maxOccupants = m; basePricePerNight = b;
    }

    /**
     *
     */
   @Override
    public String toString(){
         String dis = ("Name: " + name + "\nPhone: " + phone + "\nAddress: " + address + "\nMax Occupants: "
        + maxOccupants + "\nBase price per night: $" + String.format("%.2f", basePricePerNight));
       return dis;
    }
}
