import java.util.Scanner;

public class count2DArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int rows,column;
        System.out.println("Enter the rows and columns");
        rows=input.nextInt();
        column=input.nextInt();
        int[][] array = new int[rows][column];

        System.out.println("Enter array elements");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count++;
            }
        }
        System.out.println("The number of elements in array is:" + count);
    }
}
