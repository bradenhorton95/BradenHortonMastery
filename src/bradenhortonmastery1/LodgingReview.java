/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bradenhortonmastery1;

/**
 *
 * @author brade
 */
public  class LodgingReview {
    public String comments;
    // i chose to make rating a string for simplicity sake since the focus here is on inheretance. less likely to throw exception
   public String rating;
    public LodgingReview(){
      
        comments = "This is the default comments";
        rating = "Default ";
    }
    public LodgingReview(String c, String r){
        comments = c;
        rating = r;
    }
    @Override
    public String toString(){
       
        String dis = ("Comments: " + comments + "\nRating: " + rating);
        return dis;
    }
}
