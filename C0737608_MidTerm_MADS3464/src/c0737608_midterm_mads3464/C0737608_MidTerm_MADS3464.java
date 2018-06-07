/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0737608_midterm_mads3464;

/**
 *
 * @author macstudent
 */
public class C0737608_MidTerm_MADS3464 {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "Lambton";
        String Rev ="";
        /*char[] Str = input.toCharArray();*/
    
        for(int i=input.length()-1; i>=0; i--)
            
            Rev = Rev + input.charAt(i);
            System.out.println("Reverse of a string is:" + Rev);
        
        
    }
    
}
       
   
    
        
        
    

