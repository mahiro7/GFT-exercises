import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int soma = 0;

        do {
            System.out.print("Digite um numero: ");
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("Numeros negativos não são permitidos!");
            } else {
                soma += num;
            }
        }
        while (soma < 157);

        System.out.println("O somatorio foi " + soma);

    }
}
