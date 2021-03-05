import java.util.Scanner;

public class mult {
    public static void main(String[] args) {
        int multiplicando;
        int inicio;
        int fim;

        Scanner sc = new Scanner(System.in);
        System.out.print("Multiplicando: ");
        multiplicando = sc.nextInt();

        if ((multiplicando < 0) || (multiplicando > 5000)) {
            System.out.println("Valor invalido!");
            System.exit(0);
        }


        System.out.print("Inicio do intervalo: ");
        inicio = sc.nextInt();
        System.out.print("Fim do intervalo: ");
        fim = sc.nextInt();

        if (fim < inicio) {
            System.out.println("Final maior que inicio!");
            System.exit(0);
        }

        if ((fim - inicio) >= 10) {
            System.out.println("Intervalo invalido!");
            System.exit(0);
        }

        for (int i = inicio; i <= fim; i++) {
            System.out.println(multiplicando + " x " + i + " = " + multiplicando * i);
        }
    }
}
