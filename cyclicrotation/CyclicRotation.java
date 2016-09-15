/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyclicrotation;

/**
 *
 * @author VAIO
 */
public class CyclicRotation {

  public static void main(String[] args) {
      
      int[] A = {3,8,9,7,6};
      int N = A.length;
      int K = 3;
      for(int i = 0; i<K; i++ ) {
          
            for(int j = N-1; j > 0; j--) {
                
                System.out.println("A[j] = " + A[j] + "  |  A[j-1] = " +A[j-1]);
                int temp = A[j];
                A[j] = A[j-1];
                
                System.out.println("----------------------------------------------------");
                System.out.println("A[j-1] = " + A[j-1] + "  |  temp =  " +temp);
                A[j-1] = temp;
                
            }
         }
      
      for(int j = 0; j<N;j++) {
          
          System.out.print( "  " +A[j]);
      }
         
    }
    
}
