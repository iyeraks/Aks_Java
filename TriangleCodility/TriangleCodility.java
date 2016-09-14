/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianglecodility;


public class TriangleCodility {

   
    public int main(int[]A) {
        // TODO code application logic here
         int i, j, k; 
        int ap, aq, ar; 
        
if (A== null || A.length < 3)
{
return 0;
}

for (i=0; i<A.length-2; i++)
{ 
    ap = A[i]; 	
 for (j =i+1; j< A.length-1; j++)
    {
        aq = A[j];
        for (k =j+1; k<A.length; k++)
        {
            ar = A[k];	
            if ( ap < aq+ar)
            {
                if ( aq < ap +ar)
                { 
                    if(ar < ap +aq) 	
                    return 1;
                }	
            }
        }
    }	
}
    return 0;
    }
}


