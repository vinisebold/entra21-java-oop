package ro_07;

public class App {
    public static void main(String[] args) {
        InteiroPositivo x = new InteiroPositivo(8);
        InteiroPositivo y = new InteiroPositivo(2);

        System.out.println("Multiplicar por y: " + x.obterNumeroMultiplicado(y));
        System.out.println("Fatorial: " + x.calcularFatorial());
        System.out.println("Quantidade divisores inteiros: " + x.obterQuantidadeDivisoresInteiros());
        System.out.println("Divisores inteiros: " + x.obterDivisoresInteiros());
        System.out.println("Sequencia de Fibonacci: " + x.calcularSerieFibonacci());
    }
}
