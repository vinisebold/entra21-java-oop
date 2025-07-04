package exer_7;

public class Main {
    public static void main(String[] args) {

        Aeronave[] aeronaves = new Aeronave[4];

        aeronaves[0] = new Aeronave("F-4 Phantom II", 4, 2370, 150);
        aeronaves[1] = new Aeronave("C-105 Amazonas", 50, 550, 50);
        aeronaves[2] = new Aeronave("Tu-144", 140, 2430, 250);
        aeronaves[3] = new Aeronave("X-43A", 0, 12250, 150);


        System.out.println("Maior número de passageiros: " + aeronaves[verificarMaiorPassageiro(aeronaves)].modelo);
        System.out.println("Maior tempo no ar: " + aeronaves[verificarMaiorTempoAr(aeronaves)].modelo);
        System.out.println("Voar mais longe: " + aeronaves[verificarVoarMaisLonge(aeronaves)].modelo);
    }

    public static int verificarMaiorPassageiro(Aeronave[] aeronaves) {
        int maior = Integer.MIN_VALUE;
        int indice = 0;
        for (int i = 0; i < aeronaves.length; i++) {
            if (aeronaves[i].passageiros > maior) {
                maior = aeronaves[i].passageiros;
                indice = i;
            }
        }

        return indice;
    }

    public static int verificarMaiorTempoAr(Aeronave[] aeronaves) {
        double menor = Double.MAX_VALUE;
        int indice = 0;
        for (int i = 0; i < aeronaves.length; i++) {
            if (aeronaves[i].queimaCombustivelMin < menor) {
                menor = aeronaves[i].queimaCombustivelMin;
                indice = i;
            }
        }

        return indice;
    }

    public static int verificarVoarMaisLonge(Aeronave[] aeronaves) {
        int maior = Integer.MIN_VALUE;
        int indice = 0;
        for (int i = 0; i < aeronaves.length; i++) {
            double media = aeronaves[i].velocidadeMaxima / aeronaves[i].queimaCombustivelMin;
            if (media > maior) {
                maior = aeronaves[i].passageiros;
                indice = i;
            }
        }

        return indice;
    }

}
