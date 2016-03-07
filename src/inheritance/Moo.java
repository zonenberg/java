/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance;



/**
 *
 * @author jiri.sonnenschein
 */
public class Moo extends Zoo{
    
    static final String insideMoo() {
        return "Static final Inside text";
    }
    
    public void useZoo() {
        Zoo z = new Zoo(); // Create object z from class Zoo.
        // You can call z.public,default - Methods,Parameters from Zoo
        // e.g. z.coolMethod() or z.parametr
        
        // If Moo extends Zoo you can call methods as they are members of Moo. e.g. this.coolMethod()
        
        //Accessing a member of another class using a reference of an instance of that class)
        System.out.println("A Zoo says: " + z.coolMethod());
        
        //Inheriting a member of another class (Moo extends Zoo)
        System.out.println("A Zoo says: " + this.coolMethod());
        
        //Inheriting a member of another class (Moo extends Zoo). Inherited 
        // method is implicitly called with this. even it is not written
        System.out.println("A Zoo says .this : " + coolMethod());
        
        //Print parameter        
        System.out.println("A Zoo says: " + z.parameter);        
        
        //Print parameter        
        System.out.println("A Zoo says: " + this.protect);    
        
       //Print method        
        System.out.println("A Zoo says: " + Moo.insideMoo());   
        
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
