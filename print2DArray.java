import java.util.Scanner;

public class print2DArray {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
        }

        System.out.println("Entered Array is: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    }

