public class testeInvestimentoComIR {
    public static void test(String[] args) {
        InvestimentoComIR investimento = new InvestimentoComIR(1000.00, 0.04);
        System.out.printf("%.2f", investimento.calcularLucro(2));
    }
}
