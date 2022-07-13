import java.util.Scanner;

public class Esercizio2 {
    /*Mini Google
    Scrivete un programma che inizialmente prende in input la dimensione di un array
da inizializzare che chiameremo D
• Inizializza questo array e successivamente prende in input D numeri interi per
riempirlo
• Successivamente viene chiesto di inserire all’utente un N, il programma stamperà
a video se quel numero è presente o meno.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi inserire? ");
        int n = sc.nextInt();
        int[] D = new int[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Inserisci un numero: ");
            D[i] = sc.nextInt();
        }
        //sc.nextLine();
        System.out.println("Inserisci un numero da cercare: ");
        //System.out.println(check(sc.nextInt(), D));
        check(sc.nextInt(), D);
    }

    public static void check(int n, int[] arr) {
        boolean bool = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("Presente");
                bool = true;
                break;
            }
        }
        if (!bool)
            System.out.println("Non presente");
    }
}
