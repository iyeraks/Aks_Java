/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestsum;


public class LargestSum {
    
    public LargestSum() {
        
    }

    public static void main(String[] args) {
        LargestSum ls = new LargestSum();
        int sum = 0;
        int max = 0;
        
        if(args.length <= 0) {
            System.out.println("Enter sequence of numbers seperated by space");
        } else {
            
                for(int i=0; i<=args.length -1; i++)
                {
                    max = Math.max(Integer.valueOf(args[i]),max + Integer.valueOf(args[i]));
                            sum = Math.max(sum,max);
                 }
                    System.out.println("Greatest Sum = " +sum );
        }
    }
    
}
