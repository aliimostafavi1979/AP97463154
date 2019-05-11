/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment.pkg2;
import java.util.Scanner;
/**
 *
 * @author RAYAN FARZAD
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int i,j,n;
        System.out.print("enter n");
        n=(new Scanner (System.in)).nextInt();
        if(n%2 !=0){
      for(i=0;i<n-1;++i)
{

for(j=0;j<n-1-i;++j)
System.out.print(" ");
for(j=0;j<2*i+1;++j)
System.out.print("*");
System.out.println();

}//in halghe ghesmate balaeye lozi yani mosalas ra chap mikonad
         
for(i=0;i<n;i++)

{

for(j=0;j<i;j++)
System.out.print(" ");
for(j=0;j<2*(n-i)-1;++j)
System.out.print("*");
            System.out.println();

        // TODO code application logic here
    }
        }
    }
    
}
