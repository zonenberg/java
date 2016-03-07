/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

/**
 *
 * @author jiri.sonnenschein
 */
public class Moo {
    public void useZoo() {
        Zoo z = new Zoo(); // Create object z from class Zoo.
        // You can call z.public,default - Methods,Parameters from Zoo
        // e.g. z.coolMethod() or z.parametr
        
        //Print method
        System.out.println("A Zoo says: " + z.coolMethod());
        //Print parameter        
        System.out.println("A Zoo says: " + z.parameter);         
    }
    
    /**
    * @param args the command line arguments
    */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Moo useMoo = new Moo();
        useMoo.useZoo();      
    }        
    
    
}
