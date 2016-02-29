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
         
         
         s1 = s.substring(1);
         s1+=s.substring(0,1);
         
         System.out.println("s1 = "+s1);
    }
    
    public String bin2string(String s){  //// gets a string with binary values and gives out the char thingy
        String str = "";

        for (int i = 0; i < s.length()/8; i++) {

            int a = Integer.parseInt(s.substring(8*i,(i+1)*8),2);
            str += (char)(a);
        }
        return str;
   }
    
   public String string2bin(String s){
       byte[] bytes = s.getBytes();
         int bytesLength = bytes.length;
         StringBuilder binary = new StringBuilder();
         for (byte b : bytes)
         {
            int val = b;
            for (int i = 0; i < 8; i++)
            {
               binary.append((val & 128) == 0 ? 0 : 1);
               val <<= 1;
            }
            //binary.append(' ');
         }
         System.out.println("'" + s + "' to binary: " + binary);
         
         String res = binary.toString();
         return res;
   }
    
    public static void main(String args[]){
        new tests();
    }
        
}
