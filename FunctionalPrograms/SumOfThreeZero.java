package FunctionalPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumOfThreeZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int N = sc.nextInt();

        int[] arr = new int[N];
        System.out.println("Enter the integers:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        findAndPrintTriplets(arr);
    }

    public static void findAndPrintTriplets(int[] arr) {
        int N = arr.length;
        Set<String> uniqueTriplets = new HashSet<>();
        ArrayList<int[]> triplets = new ArrayList<>();

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        int[] triplet = {arr[i], arr[j], arr[k]};
                        String tripletKey = generateTripletKey(triplet);
                        if (!uniqueTriplets.contains(tripletKey)) {
                            uniqueTriplets.add(tripletKey);
                            triplets.add(triplet);
                        }
                    }
                }
            }
        }

        System.out.println("Number of distinct triplets: " + triplets.size());

        System.out.println("The distinct triplets are:");
        for (int[] triplet : triplets) {
            System.out.println(triplet[0] + " " + triplet[1] + " " + triplet[2]);
        }
    }

    private static String generateTripletKey(int[] triplet) {
        java.util.Arrays.sort(triplet);
        return triplet[0] + "," + triplet[1] + "," + triplet[2];
    }
}
