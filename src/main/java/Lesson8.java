import java.util.Arrays;
public class Lesson8 {
    public static void main(String[] args) {
//        int[] instArray = new  int[]{10,50,80,90,45};
//        instArray[0] = 10-25;
//        Integer[] integerArray = new Integer[6];
//      //  System.out.println(integerArray[0]);
//        System.out.println(Arrays.toString(instArray));

        int[][] intMatrix = new int[2][2];
        for (int i = 0; i < intMatrix.length; i++) {
            System.out.println(Arrays.toString(intMatrix[i]));
        }
        System.out.println("'''''''''''''''''''''''''''''");
         int[][][] intCube = new int[2][3][4];
         for (int i = 0; i < intCube.length; i++) {
             for (int j = 0; j < intCube[i].length; j++) {
                 System.out.println(Arrays.toString(intCube[i][j]));
                 
             }
         }


    }
    }

