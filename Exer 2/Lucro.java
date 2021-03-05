import java.util.Scanner;

/**
 * Classe lucro para exercício 2
 * utilizando InvestimentoComIR e SemIR do exer 1
 *
 * @author mahiro
 */

public class Lucro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        System.out.print("Digite o valor inicial: ");
        valor = sc.nextDouble();
        
        InvestimentoComIR invest1 = new InvestimentoComIR(valor, 0.0035);
        InvestimentoSemIR invest2 = new InvestimentoSemIR(valor, 0.003);

        for (int i = 0; i < 36; i++) {
            System.out.print("Mes: " + (i + 1));
            System.out.printf(" | Investimento sem IR: %.2f", invest1.calcularLucro(i + 1));
            System.out.printf(" | Investimento com IR: %.2f %n", invest2.calcularLucro(i + 1));
        }
    }
}
