package exer_8;

public class Main {
    public static void main(String[] args) {

        Contribuinte[] contribuintes = new Contribuinte[5];

        contribuintes[0] = new Contribuinte("João S", "019.121.344-65", "RS", 2100);
        contribuintes[1] = new Contribuinte("Gabriela A", "099.189.321-45", "SC", 52000);
        contribuintes[2] = new Contribuinte("Vinicius S", "099.151.874-34", "SC", 50000);
        contribuintes[3] = new Contribuinte("Jackson B", "128.128.344-95", "PR", 5600);
        contribuintes[4] = new Contribuinte("Silvio P", "019.131.340-61", "RS", 30000);


        double maiorValorImposto = Double.MIN_VALUE;
        Contribuinte contribuinteMaiorImposto = null;
        for (int i = 0; i < contribuintes.length; i++) {
            if (contribuintes[i].calcularImpostoPagar() > maiorValorImposto) {
                maiorValorImposto = contribuintes[i].calcularImpostoPagar();
                contribuinteMaiorImposto = contribuintes[i];
            }
        }

        double menorValorImposto = Double.MAX_VALUE;
        Contribuinte contribuinteMenorImposto = null;
        for (int i = 0; i < contribuintes.length; i++) {
            if (contribuintes[i].calcularImpostoPagar() < menorValorImposto) {
                menorValorImposto = contribuintes[i].calcularImpostoPagar();
                contribuinteMenorImposto = contribuintes[i];
            }
        }

        double somaValorImposto = 0;
        for (int i = 0; i < contribuintes.length; i++) {
            somaValorImposto += contribuintes[i].calcularImpostoPagar();
        }

        System.out.println("a) Quem mais paga imposto: " + contribuinteMaiorImposto.nome);
        System.out.println("a) Quem menos paga imposto: " + contribuinteMenorImposto.nome);
        System.out.println("c) Qual o total de imposto pago: " + somaValorImposto);
    }
}
