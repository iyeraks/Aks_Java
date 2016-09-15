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



----------------------------------------------------------------------

Output :

A[j] = 6  |  A[j-1] = 7
----------------------------------------------------
A[j-1] = 7  |  temp =  6
A[j] = 6  |  A[j-1] = 9
----------------------------------------------------
A[j-1] = 9  |  temp =  6
A[j] = 6  |  A[j-1] = 8
----------------------------------------------------
A[j-1] = 8  |  temp =  6
A[j] = 6  |  A[j-1] = 3
----------------------------------------------------
A[j-1] = 3  |  temp =  6
A[j] = 7  |  A[j-1] = 9
----------------------------------------------------
A[j-1] = 9  |  temp =  7
A[j] = 7  |  A[j-1] = 8
----------------------------------------------------
A[j-1] = 8  |  temp =  7
A[j] = 7  |  A[j-1] = 3
----------------------------------------------------
A[j-1] = 3  |  temp =  7
A[j] = 7  |  A[j-1] = 6
----------------------------------------------------
A[j-1] = 6  |  temp =  7
A[j] = 9  |  A[j-1] = 8
----------------------------------------------------
A[j-1] = 8  |  temp =  9
A[j] = 9  |  A[j-1] = 3
----------------------------------------------------
A[j-1] = 3  |  temp =  9
A[j] = 9  |  A[j-1] = 6
----------------------------------------------------
A[j-1] = 6  |  temp =  9
A[j] = 9  |  A[j-1] = 7
----------------------------------------------------
A[j-1] = 7  |  temp =  9


9  7  6  3  8




