/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removemiddleelement;

import java.util.*;

public class RemoveMiddleElement {

    public RemoveMiddleElement() {
        
    }
  
    public static void main(String[] args) {
       
        RemoveMiddleElement rme = new RemoveMiddleElement();
        
        if(args.length<2){
            System.out.println("Enter the sequence of Int more than 2");
        }
        else {
             System.out.println("Sequence passed are " + args.length);
             
             int midelem = Math.round(Float.valueOf(args.length/2));
             
              System.out.println("Middle Eleme = " + midelem);
              for (int i = midelem ; i<args.length-2 ; i++)
              {
                  args[i] = args[i+1];
              }
              args[args.length-1] = null;
              
              String []argsNew = new String[args.length-1];
              System.arraycopy(args,0,argsNew,0,args.length-1);
               System.out.println("New Sequence elements are = " +argsNew.length);
               for(int i = 0; i<=argsNew.length-1;i++)
               {
                    System.out.print(argsNew[i]+" ");
               }
        }
    }
    
}
