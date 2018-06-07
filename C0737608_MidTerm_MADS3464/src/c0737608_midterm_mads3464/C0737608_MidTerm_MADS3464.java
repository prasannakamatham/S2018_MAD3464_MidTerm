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
    String RevStr=" ";
    
    
    for(int i=input.length()-1; i>=0; i--){
        
        RevStr = RevStr + input.charAt(i);  
        System.out.println(RevStr);
    }
    
    }   
        
        // TODO code application logic here
    }
    

