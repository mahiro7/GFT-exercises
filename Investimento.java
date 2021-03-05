import java.lang.Math;

/**
 * Classe pai Investimento
 * com os atributos valorInicial e jurosMensais
 *
 * @author mahiro
 */

public class Investimento {
    public double valorInicial;
    public double jurosMensais;

    public Investimento(double valor, double juros) {
        valorInicial = valor;
        jurosMensais = juros;
    }

    public double calcularLucro(int meses) {
        double retorno;
        double y = Math.pow((jurosMensais+1), meses);
        retorno = (valorInicial * y) - valorInicial;

        return retorno;
    }
}
