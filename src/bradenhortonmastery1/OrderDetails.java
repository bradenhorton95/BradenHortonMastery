/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bradenhortonmastery1;

/**
 *
 * @author brade
 *
 */
// the mastery called for one class that had getters and setters and also one class with private variables. I chose this one.
public class OrderDetails {
    private double balanceOwed;
    private double totalSpending;
    private double priceAdjustment;
    private String description;
    private String date;
    
  public OrderDetails(){
      description = "Default";
      date  = "default";
    
}
 public OrderDetails(String desc, String da){
     description = desc;
     date = da;
 }
 // set balanceOwed
  public void setBalanceOwed(double b){
      balanceOwed = b;
  }
  // get balanceOwed
  public double getBalanceOwed(){
      return balanceOwed;
  }
  // set totalSpending
  public void setTotalSpending(double t){
      totalSpending = t;
  }
  // get totalSpending
  public double getTotalSpending(){
      return totalSpending;
  }
  // set price adjustment
   public void setPriceAdjustment(double p){
       priceAdjustment = p;
   }
   // get price adjustment 
   public double getPriceAdjustment(){
       return priceAdjustment;
   }
    
   @Override
   public String toString(){
       String dis = ("Date: " + date + "\nDescription: " + description + 
                "\nBalance Owed: $" + balanceOwed + "\nTotal spending: $" + totalSpending
                    + "\nPrice % adjustment: " + priceAdjustment);
       return dis;
   }
}
