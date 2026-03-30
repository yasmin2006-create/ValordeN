// Yasmin louise Fontes Guimarães
// 12661935138
import java.util.Scanner;

public class valordeN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("valor inválido. N deve ser maior que zero.");
        } else {
            int contador = 1; // inicializa a variável

            while (contador <= N) {
                System.out.println(contador);
                contador++; // incrementa
            }

            System.out.println("Contagem concluída.");
        }

        sc.close();
    }
}
