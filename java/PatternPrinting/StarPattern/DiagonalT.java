package PatternPrinting.StarPattern;

public class DiagonalT {
 
    public static void main(String[] args) {
        int n = 6;

       for (int i = 1; i <=n; i++) {
           for (int j = 1; j <=n; j++) {
               if( i==j || i + j == n + 1){
                System.out.print(" X ");
               }else{
                System.out.print("   ");
            }
           }
           System.out.println();
        }
    }
}


/*
Output:
X           X
  X       X
    X   X
      X
    X   X
  X       X
X           X
*/
