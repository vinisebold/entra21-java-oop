package ro_03;

public class App {
    public static void main(String[] args) {
        Material m1 = new Material("Tijolo", "Tijolo ecológico de barro prensado", 10.0, 2.3, 4.0, 300);
        Material m2 = new Material("Cimento", "Saco de cimento CP-II 50kg", 40.0, 0.04, 50.0, 120);
        Material m3 = new Material("Areia", "Areia lavada média para construção", 150.0, 1.0, 1000.0, 20);
        Material m4 = new Material("Brita", "Brita 1 para concreto estrutural", 180.0, 1.0, 1200.0, 15);
        Material m5 = new Material("Bloco de concreto", "Bloco estrutural", 6.0, 0.015, 14.0, 500);


        Loja listaMateriais = new Loja();

        listaMateriais.adicionarMaterial(m1);
        listaMateriais.adicionarMaterial(m2);
        listaMateriais.adicionarMaterial(m3);
        listaMateriais.adicionarMaterial(m4);
        listaMateriais.adicionarMaterial(m5);

        m1.adicionarEstoque(100);
        m2.venderPruduto(20);
        m3.promocaoProduto(20);

        System.out.println(listaMateriais.obterMaterialMaisCaro().getNome());
        System.out.println(listaMateriais.obterMaterialMaisVolumoso().getNome());

    }
}
