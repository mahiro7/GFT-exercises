public class testeInvestimentoSemIR {
    public static void main(String[] args) {
        InvestimentoSemIR investimento1 = new InvestimentoSemIR(1000.00, 0.04);
        System.out.printf("%.2f %n", investimento1.calcularLucro(2));

        InvestimentoSemIR investimento2 = new InvestimentoSemIR(900.00, 0.04);
        System.out.println(investimento2.calcularLucro(2));
    }
}
