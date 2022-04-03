package Week3;

import java.util.Arrays;
import java.util.Scanner;

public class week3ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        String[] nlist1 = input.nextLine().split(" ");
        int[] list1 = new int[nlist1.length];
        for (int i = 0; i < nlist1.length; i++) {
            list1[i] = Integer.parseInt(nlist1[i]);
        }
        System.out.print("Enter list2: ");
        String[] nlist2 = input.nextLine().split(" ");
        int[] list2 = new int[nlist2.length];
        for (int i = 0; i < nlist2.length; i++) {
            list2[i] = Integer.parseInt(nlist2[i]);
        }
        input.close();
        System.out.print("The merged list is ");
        for (int i = 0; i < merge(list1, list2).length; i++) {
            System.out.print(merge(list1, list2)[i] + " ");
        }
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] sum = new int[list1.length + list2.length];
        for (int i = 0; i < list1.length; i++) {
            sum[i] = list1[i];
        }
        for (int i = 0; i < list2.length; i++) {
            sum[list1.length + i] = list2[i];
        }
        Arrays.sort(sum);
        return sum;
    }
}
