public class Multidimantion {
   public static void main(String[] args) {
//        int [][] myNumbers = { { 1,2,3,4,},{5,6,7,}};
//        myNumbers [1][2] = 6;
//        System.out.println(myNumbers [1][2]);


       //example 2d arrays

//       int[][] a = {{1,2,3,},{4,5,6,9},{7},};
//       System.out.println("Length of row1:" + a[0].length);
//       System.out.println("Length of row2:" + a[1].length);
//       System.out.println("Length of row3:" + a[2].length);

//       int[][] a = {{1,2,3,4,},{5,6,7,}};
//       System.out.println("Length of row1:" + a[0].length);
//       System.out.println("Lengt of row:" + a[1].length);

//       loop through

       int[][] myNumbers = {{1,2,3,4,},{5,6,7,}};
       for (int i =0;i < myNumbers.length;++i) {
           for ( int j= 0;j < myNumbers[i].length;++j) {
               System.out.println(myNumbers[i][j]);

           }

       }


    }
}
