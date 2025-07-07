package exer_10;

public class Main {
    public static void main(String[] args) {

        OnibusEscolar onibus1 = new OnibusEscolar(19, 31);

        System.out.println(onibus1);

        onibus1.setEstudantes(50);
        System.out.println(onibus1);

        onibus1.setProfessores(0);
        onibus1.setEstudantes(30);
        System.out.println(onibus1);

        onibus1.removerAlunos(5);
        System.out.println(onibus1);

    }
}
