import java.util.Scanner;

public class Esercizio1 {
    /*Il quadrato di un numero N non è altro che la somma dei primi N numeri dispari.
• Per esempio 9 = 5+3+1 e 36 = 11+9+7+5+3+1
Scrivete un programma che preso in input un numero N restituisce il quadrato di N
utilizzando questo metodo!
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int n = sc.nextInt();
        System.out.println("Quadrato numero " + n + ": " + checkSquare(n));
        System.out.println("Quadrato numero " + n + ": " + pariDispari(n));
    }

    public static String checkSquare(int n) {
        int somma = 0;
        int cont = 1;
        String s = "";

//se somma/n  == n vuol dire che somma è il quadrato di n ed esco dal while

        while ((somma / n) != n) {
            somma += cont;
            s = (cont == 1) ? cont + s : cont + "+" + s;
            cont += 2;
        }
        return somma + " = " + s;
    }

    public static int pariDispari(int n) {
        int somma = 0, cont = 1;
        for (int i = 0; i < n; i++)
            somma += (i * 2) + 1;
        return somma;
    }

}
