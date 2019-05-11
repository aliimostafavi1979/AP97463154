package assignment3;
import java.util.*;
public class Assignment3 {
public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     int n;
     int a[][];
     int i;
     int k;
     int j;
     int q;
     System.out.println("Enter n:");
     n=input.nextInt();
    a= new int[n][n];
      System.out.print("\n\n\n\n\n");
      Random ran= new Random();
    for(j=0;j<n;j++){
        for(q=0;q<n;q++){
            a[j][q]=ran.nextInt(100);
  
         System.out.print(a[j][q]+"\t");
         
    }
        System.out.print("\n");
    }
     System.out.print("\n\n\n\n\n");
    for(int p=0;p<n;p++){
   for(j=0;j<n;j++){
        for(q=0;q<n;q++){
            if(j+q==p)
                System.out.print(a[j][q]+"\t");
        }
}
}
}
}
