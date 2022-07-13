import java.util.Scanner;

public class Esercizio4 {
    /*Conta vocali e consonanti
    Scrivete un programma che data una parola stampa a schermo il numero di vocali e
consonanti presenti.
• Modificate il programma in modo che funzioni con una frase data. (usate le
funzioni).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci una frase: ");
        String s = sc.nextLine().toLowerCase();
        control(s);
    }

    public static void control(String s) {
        int contVocali = 0;
        int contSpazi = 0;
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            str = s.charAt(i) + "";
            if (s.charAt(i) != ' ' && str.matches("[a-zA-Z]")) {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
                    contVocali++;
            } else
                contSpazi++;
        }
        System.out.println("Numero Vocali: " + contVocali + "\nNumero Consonanti: " + (s.length() - contSpazi - contVocali));
    }
}
