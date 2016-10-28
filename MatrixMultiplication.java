package edu.technopolis.homework;

import java.util.Scanner;
/**
 * Matrix multiplication home task.
 * <br/>
 * Matrix dimension and elements are passed as CLI arguments.
 */
public class MatrixMultiplication {
    static double A[][];
    static double B[][];
    static double R[][];
    static int sizeAr[]=new int[4];

    public static double res(int i,int j){
        double res=0;

        for(int k=0;k<sizeAr[1];k++){
           res+= A[i][k]*B[k][j];

        }
          return res;
    }
    public static int main(String... args) {

         Scanner str=new Scanner(args.toString());
         for(int i=0;i<4;i++){
             sizeAr[i]=  str.nextInt();
       }
        if(sizeAr[0]!=sizeAr[3]) {
            System.out.println("((((");
            return -1;
        }
         A=new double[sizeAr[0]][sizeAr[1]];
         B=new double[sizeAr[2]][sizeAr[3]];
         R=new double[sizeAr[0]][sizeAr[3]];


                 for(int i=0;i<sizeAr[0];i++)
                     for(int j=0;j<sizeAr[1];j++){
                         A[i][j]= str.nextDouble();
            }
                 for(int i=0;i<sizeAr[2];i++)
                     for(int j=0;j<sizeAr[3];j++){
                         B[i][j]= str.nextDouble();
                }



        for(int i=0;i<sizeAr[0];i++) {
            for (int j = 0; j < sizeAr[3]; j++) {
                R[i][j] = res(i, j);
                System.out.print(R[i][j] + " ");

            }
            System.out.println();

        }
         return 0;
    }
}