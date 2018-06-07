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
public class reverse {
    
    public static void main(String[] args) {

    String input = "Lambton";
    String RevStr=" ";
    char[] Str = input.toCharArray();
    
    for(int i=Str.length-1; i>=0; i--){
        
        RevStr = RevStr + charAt(i);  
        System.out.println(RevStr);
    }
    
    }    
    
}
