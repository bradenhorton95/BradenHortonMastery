/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bradenhortonmastery1;

/**
 *
 * @author brade
 */
public class House extends Lodging {
    public int numberOfBedrooms;
    public House(){
        super();
        numberOfBedrooms = 0;
        
    }
    public House(String n, String p, String a, int m, int b, int num){
        super(n,p,a,m,b);
        numberOfBedrooms = num;
    }
    @Override
    public String toString(){
        
        String dis = super.toString() + ("\nNumber Of Bedrooms: " + numberOfBedrooms);
        return dis;
    }
}
