/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bradenhortonmastery1;

/**
 *
 * @author brade
 */
public class Room {
    public int numberOfBeds;
    public String phoneNumber;
    public int maxOccupants;
    // default constructor
    public  Room(){
        
        numberOfBeds = 0;
        phoneNumber = "000 000 0000";
        maxOccupants = 0;
        
    }
    // custom constructor
    public Room(int n, String p, int m){
        numberOfBeds = n;
        phoneNumber = p;
        maxOccupants = m;
    }
    public void display(){

        System.out.println("Number of beds: " + numberOfBeds);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Max Occupants: " + maxOccupants);
    }
}
