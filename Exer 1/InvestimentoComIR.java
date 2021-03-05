/**
 * Classe filha InvestimentoComIR
 * Adiciona um desconto com base nos meses passados no parâmetro de calcularLucro
 *
 * @author mahiro
 */

public class InvestimentoComIR extends Investimento {
    public InvestimentoComIR(double valor, double juros) {
        super(valor, juros);
    }

    double desconto;

    public double calcularLucro(int meses) {
        if (meses < 6) {
            desconto = 0.225;
        } else if ((meses >= 6) && (meses < 12)) {
            desconto = 0.2;
        } else if ((meses >= 12) && (meses < 24)) {
            desconto = 0.175;
        } else {
            desconto = 0.15;
        }

        double retorno;
        double y = Math.pow((jurosMensais+1), meses);
        retorno = (valorInicial * y) - valorInicial;
        retorno = retorno - (retorno * desconto);

        return retorno;
    }
}
