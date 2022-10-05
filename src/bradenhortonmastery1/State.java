/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bradenhortonmastery1;

/**
 *
 * @author brade
 */
public abstract class State {
    static State customer, employee, manager, login, current;
    void enter(){}
    void update(){}
    void load(){};
    void save(){};
}
