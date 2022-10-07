//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter position: ");
//        int pos = scanner.nextInt();
//        int[] arr1 = new int[arr.length - 1];
//        int x = 0;
//        for (int i = 0; i < arr1.length; i++) {
//            if (i == pos) {
//                x = 1;
//            }
//            arr1[i] = arr[i + x];
//        }
//        System.out.print("Old array: ");
//        for (int i : arr) {
//            System.out.print("\t");
//            System.out.print(i);
//        }
//        System.out.print("\n");
//        System.out.print("New array: ");
//        for (int i : arr1) {
//            System.out.print("\t");
//            System.out.print(i);
//        }
//    }
//}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 3, 6, 7, 9, 1, 3, 4, 3};
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to be deleted: ");
        int number = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                deleteElement(i, arr);
                count++;
                i--;
            }
            arr[arr.length - 1] = 0;
        }
        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }
    public static void deleteElement(int num, int[] arr) {
        for (int i = num; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }
}