// Name: Braden Horton
// Description: Mastery Assignment 2 , Polymorphism
// Date: 09-25-2022
package bradenhortonmastery1;

/**
 *
 * @author brade
 */
public class BradenHortonMastery1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        // here i create the object and replace default values with a variety of information. 
        // this is the first of five
        State.customer = new CustomerView();
        State.manager = new ManagerView();
        State.employee = new EmployeeView();
        State.login = new Login();
        State.current = State.login;
       
         State.login.load();
<<<<<<< HEAD
         State.manager.load();
=======
         State.customer.load();
>>>>>>> 11be63527ae9d36b9f62156016d51161796c1696
         State.employee.load();
         
          
        while(true){
           
<<<<<<< HEAD
<<<<<<< Updated upstream
            
=======
           State.current.load();
>>>>>>> Stashed changes
=======
          
>>>>>>> 11be63527ae9d36b9f62156016d51161796c1696
        State.current.enter();
        
        State.current.update();
       
         State.current.save();
        
        }
             
    
    }
    
}
