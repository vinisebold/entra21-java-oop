package exer_05;

public class Main {
    public static void main(String[] args) {

        Empregado emp1 = new Empregado();
        emp1.indentificacao = "24876";
        emp1.nome = "Kaio";
        emp1.sobreNome = "Pneu";
        emp1.salario =  3400;


        System.out.println(emp1.mostrarNomeCompleto());
        System.out.println(emp1.mostrarSalarioAnual());
        emp1.setSalario(2);

        System.out.println(emp1.mostrarSalarioAnual());
    }
}
