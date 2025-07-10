package introducao_2;

public class Main {
    public static void main(String[] args) {

        Quadrado q1 = new Quadrado();
        q1.altura = 5;
        q1.largura = 6;

        System.out.println(q1.calcularArea());
    }
}
