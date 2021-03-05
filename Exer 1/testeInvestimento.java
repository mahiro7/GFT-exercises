public class testeInvestimento {
    public static void main(String[] args) {
        Investimento investimento = new Investimento(1000.00, 0.04);
        System.out.printf("%.2f", investimento.calcularLucro(2));
    }
}
