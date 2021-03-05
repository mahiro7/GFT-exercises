public class InvestimentoSemIR extends Investimento {
    public InvestimentoSemIR(double valor, double juros) {
        super(valor, juros);
    }

    public double calcularLucro(int meses) {
        if (valorInicial < 1000.00) return 0;
        
        double retorno;
        double y = Math.pow((jurosMensais+1), meses);
        retorno = (valorInicial * y) - valorInicial;

        return retorno;
    }
}
