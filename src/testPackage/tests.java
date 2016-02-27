/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPackage;

/**
 *
 * @author Ajmal
 */

public class tests {
    
    tests(){
         String s = "ajmal";
         
         String s1,s2;
         
         //s1 = s.substring(1);
         s1 = s.substring(1);
         s1+=s.substring(0,1);
         //System.out.println("s1 = "+s1 );
         System.out.println("s1 = "+s1);
    }
    
    public static void main(String args[]){
        new tests();
    }
        
}
