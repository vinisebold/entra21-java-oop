package exer_08;

public class Main {
    public static void main(String[] args) {

        Contribuinte[] contribuintes = new Contribuinte[5];

        contribuintes[0] = new Contribuinte("João S", "01912134465", "RS", 2100);
        contribuintes[1] = new Contribuinte("Gabriela A", "09918932145", "SC", 52000);
        contribuintes[2] = new Contribuinte("Vinicius S", "09915187434", "SC", 50000);
        contribuintes[3] = new Contribuinte("Jackson B", "12812834495", "PR", 5600);
        contribuintes[4] = new Contribuinte("Silvio P", "01913134061", "RS", 30000);


        double maiorValorImposto = Double.MIN_VALUE;
        Contribuinte contribuinteMaiorImposto = null;
        for (int i = 0; i < contribuintes.length; i++) {
            if (contribuintes[i].calcularImpostoDeRenda() > maiorValorImposto) {
                maiorValorImposto = contribuintes[i].calcularImpostoDeRenda();
                contribuinteMaiorImposto = contribuintes[i];
            }
        }

        double menorValorImposto = Double.MAX_VALUE;
        Contribuinte contribuinteMenorImposto = null;
        for (int i = 0; i < contribuintes.length; i++) {
            if (contribuintes[i].calcularImpostoDeRenda() < menorValorImposto) {
                menorValorImposto = contribuintes[i].calcularImpostoDeRenda();
                contribuinteMenorImposto = contribuintes[i];
            }
        }

        double somaValorImposto = 0;
        for (int i = 0; i < contribuintes.length; i++) {
            somaValorImposto += contribuintes[i].calcularImpostoDeRenda();
        }

        System.out.println("a) Quem mais paga imposto: " + contribuinteMaiorImposto.nome);
        System.out.println("a) Quem menos paga imposto: " + contribuinteMenorImposto.nome);
        System.out.println("c) Qual o total de imposto pago: " + somaValorImposto);
    }
}
