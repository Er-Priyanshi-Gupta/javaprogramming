package JavaProgramming.PatternPrograms;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of rows");
         int n = sc.nextInt();
         for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i; j++){
                System.err.print("*");
            }
            System.err.println("");
         }
         sc.close();
    }
}
