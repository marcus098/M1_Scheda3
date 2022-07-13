import java.lang.constant.DynamicCallSiteDesc;
import java.util.Arrays;
import java.util.Scanner;

public class Esercizio3 {
    /* Fusione di array
    Scrivete un programma che legge prima la dimensione di array e lo riempie (come
il programma di prima)
• Successivamente rifà la stessa cosa per un altro array
• Fonde i due array insieme.
• Stampa il nuovo array fuso.
     */
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Quanti numeri vuoi inserire nel primo array? ");
        int[] D1 = new int[sc.nextInt()];
        D1 = insert(D1.length);
        System.out.println("Quanti numeri vuoi inserire nel secondo array? ");
        int[] D2 = new int[sc.nextInt()];
        D2 = insert(D2.length);
        fusion(D1, D2);
    }

    public static int[] insert(int n) {
        int[] D = new int[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Inserisci un numero: ");
            D[i] = sc.nextInt();
        }
        return D;
    }

    public static void fusion(int[] D1, int[] D2) {
        int[] D = new int[D1.length + D2.length];
        for (int i = 0; i < (D1.length); i++)
            D[i] = D1[i];
        for (int i = 0; i < (D2.length); i++)
            D[D1.length + i] = D2[i];
        System.out.println(Arrays.toString(D));
    }
}
