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
public class bytePlay {
    
    public bytePlay(){
        String name = "maakkachi pokkachi";
        String key = "hahahaha";
        
        //String res = xor(name,key);
       // System.out.println("\n\nagain\n");
       // System.out.println(xor(res,key));
        
       /* byte[] bname = name.getBytes();
        
        System.out.println("Bytes = ");
        for(byte a: bname){
            int val = a;
            System.out.println(val);
        }*/
        
        
    }
    
    
    
    public String enFiestel(String text,String key){
        String cipher="";
        
        
        
        return cipher;
    }
    
    
    
    public String deFiestel(String cipher,String key){
        String text="";
        
        return text;
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
   
   
   public String xor(String text, String key){         // XOR the text with the key [equal size]
       String result="";
       byte[] textbyte = text.getBytes();
       byte[] keybyte = key.getBytes();
       int i=0;
       
       for(byte by :textbyte){
           
           int mval = (char)by;
           int kval = (char)keybyte[i];
           mval = mval^kval;
           
           result+=(char)mval;
           
           //i=(i+1)%8;
       }
       System.out.println("xored thing = " + result);
       return result;
   }
       
   
   
   
    
    public static void main(String args[]){
        new bytePlay();
    }
    
}
