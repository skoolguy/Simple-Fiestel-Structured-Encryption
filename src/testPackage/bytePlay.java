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
    }
    
    
    
    public String enFiestel(String left,String right,String key){
        System.out.println("EXECUTING ENFIESTEL");
        String cipher="";
        String temp,rounded;
        String s = key;
        String s1;
        
        System.out.println("Fiestel starting :");
        System.out.println("\tleft : "+left);
        System.out.println("\tright : "+right);
        
        for(int i=0;i<16;i++){
            System.out.println("\n\nRunning stage No "+i);
            
            
            //round--start
            rounded = keyxor(right,s);
            
            s1 = s.substring(s.length()-1);
            s1+=s.substring(0,s.length()-1);
            s=s1;
            //round--end
            
            left = xor(left,rounded);
            temp = left;
            left = right;
            right = temp;
            
        }   
        
        cipher = right+left;
        System.out.println("Final cipher = "+cipher);
        return cipher;
    }
    
    public String deFiestel(String left,String right,String key){
        System.out.println("/////\nEXECUTING DEFIESTEL");
        String s = key;
        String s1,s2;
        String text="";
        String temp,rounded;
        System.out.println("Key generation");
        for(int i=0;i<15;i++){
            
            s1 = s.substring(s.length()-1);
            s1+=s.substring(0,s.length()-1);
            s=s1;
            
            System.out.println("After shift key : "+s);
        }
        
        System.out.println("deFiestel starting :");
        System.out.println("\tleft : "+left);
        System.out.println("\tright : "+right);
        
        for(int i=0;i<16;i++){
            System.out.println("Running stage No "+i);
            
            //round--start
            rounded = keyxor(right,s);
            s1 = s.substring(1);
            s1+=s.substring(0,1);
            s=s1;
          
            System.out.println("After shift key : "+s);
            //round--end
            
            
            left = xor(left,rounded);
            temp = left;
            left = right;
            right = temp;
            System.out.println("\tleft : "+left);
            System.out.println("\tright : "+right);
        }
        
        text = right+left;
        System.out.println("Final text = "+text);
        return text;
    }
   
    public String xor(String text, String key){         // XOR the text with the key [equal size]
       System.out.println("EXECUTING XOR");
       String result="";
       byte[] textbyte = text.getBytes();
       byte[] keybyte = key.getBytes();
       int i=0;
       
       for(byte by :textbyte){
           
           int mval = (char)by;
           int kval = (char)keybyte[i];
           mval = mval^kval;
           
           result+=(char)mval;
           i++;
       }
       return result;
   }
       
    public String keyxor(String text, String key){
       System.out.println("EXECUTING KEYXOR");
       System.out.println("\tKEY IS "+key);
       String result="";
       byte[] textbyte = text.getBytes();
       byte[] keybyte = key.getBytes();
       int len = keybyte.length;
       int i=0;
       
       for(byte by :textbyte){
           
           int mval = (char)by;
           int kval = (char)keybyte[i];
           mval = mval^kval;
           
           result+=(char)mval;
           
           i=(i+1)%len;
       }
       
       return result; 
   }
   
   
    
    public static void main(String args[]){
        new bytePlay();
    }
    
}
