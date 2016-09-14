/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xor;

/**
 *
 * @author VAIO
 */
public class Xor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int ans = 0;
     int m = 5;
     int n = 8;
                for(int i = m; i<=n; i++)
        {
                 ans = (ans^i);
           }
                 System.out.println(+ans);
        
    }
    
}
