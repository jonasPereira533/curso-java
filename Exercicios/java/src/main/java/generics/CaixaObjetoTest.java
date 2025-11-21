package generics;

public class CaixaObjetoTest {
    public static void main(String[] args) {


        CaixaObjetc c1 = new CaixaObjetc();
        c1.setCoisa(2.1);

        double coisa = (double) c1.getCoisa();

        System.out.println(coisa);

        CaixaObjetc c2 = new CaixaObjetc();
        c1.setCoisa("jonas");

        String coisa1 = (String) c1.getCoisa();

        System.out.println(coisa1);
    }
}
