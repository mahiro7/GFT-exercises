public class Simulacoes {
    public static void main(String[] args) {
        InvestimentoComIR inv1 = new InvestimentoComIR(5000.00, 0.012);
        InvestimentoSemIR inv2 = new InvestimentoSemIR(3000.00, 0.007);

        System.out.printf("%.2f %n", inv1.calcularLucro(17));
        System.out.printf("%.2f", inv2.calcularLucro(10));

    }
}
