package introducao;

public class ExemploPOO {
    public static void main(String[] args) {

        // Cria objeto
        Veiculo v = new Veiculo();

        // Adiciona valor ao objeto
        v.modelo = "Civic";
        v.comprimento =4.7;
        v.passageiros = 4;
        v.velMax = 150;
        v.cor = "Prata";

        // Output
        System.out.println("A velocidade máxima do " + v.modelo + ": " + v.velMax + "km/h");
    }
}
