package generics;

public class CaixaTest {
    public static void main(String[] args) {

        Caixa<String> c1 = new Caixa<>();
        c1.setCoisa("jonas!!");

        String coisas = c1.getCoisa();
        System.out.println(coisas);

        Caixa<Double> c2 = new Caixa<>();
        c2.setCoisa(2.6);

        double coisas1 = c2.getCoisa();
        System.out.println(coisas1);
    }
}
