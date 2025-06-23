package introducao;

public class ExemploPOO {
    public static void main(String[] args) {

        Veiculo v = new Veiculo();
        v.modelo = "Civic";
        v.comprimento =4.7;
        v.passageiros = 4;
        v.velMax = 150;
        v.cor = "Prata";

        System.out.println("A velocidade máxima do " + v.modelo + ": " + v.velMax + "km/h");
    }
}
