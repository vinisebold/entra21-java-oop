package ro_04;

public class App {
    public static void main(String[] args) {
        Conta c1 = new Conta("Vinicius", 1000);
        Conta c2 = new Conta("Gabriela", 2000);

        System.out.println("Default");
        System.out.println(c1);
        System.out.println(c2);

        System.out.println("+200 c1");
        c1.depositarDinheiro(200);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("c1 -500, c2 + 400");
        c1.transferirDinheiro(c2, 400);

        System.out.println(c1);
        System.out.println(c2);

    }
}
