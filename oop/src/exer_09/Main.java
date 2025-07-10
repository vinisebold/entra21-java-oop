package exer_09;

public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro(80);
        System.out.println(c1);

        c1.acelerar(10);
        System.out.println(c1);

        c1.reduzir(29);
        System.out.println(c1);
    }
}
