/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance;
//import Class from some package
import protecting.Parent;

/**
 *
 * @author jiri.sonnenschein
 */
public class Zoo extends Parent {
    
    //Not possible to use reference for protected parameter
    //Parent p = new Parent();
    //public String parameter = p.protect;
    
    
    public String parameter = protect;
    public String coolMethod() {
        return "Returned string from coolMethod()";
    }   
}
