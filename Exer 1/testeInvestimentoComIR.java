public class testeInvestimentoComIR {
    public static void main(String[] args) {
        InvestimentoComIR investimento = new InvestimentoComIR(1000.00, 0.0035);
        System.out.printf("%.2f", investimento.calcularLucro(2));
    }
}
