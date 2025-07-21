package ro_04;

public class App {
    public static void main(String[] args) {
        Conta c1 = new Conta("Vinicius", 20000);
        Conta c2 = new Conta("Gabriela", 30000);
        Conta c3 = new Conta("Jalaquias", 10000);

        System.out.println(c1);

        c1.depositarDinheiro(200);

        System.out.println(c1);
        System.out.println(c2);

        c2.transferirDinheiro(c1, 500);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c3.sacarDinheiro(1000);

        System.out.println(c3);
    }
}
