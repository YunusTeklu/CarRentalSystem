/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;


import guiForms.Login;


/**
 *
 * @author Toshuiba
 */
public class CarRentalSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Login lg=new Login();
       lg.setLocation(300, 150);
       lg.setVisible(true);
    }
    
}
