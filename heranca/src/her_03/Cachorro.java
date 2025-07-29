package her_03;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String especie, boolean estimacao, double peso, String raca) {
        super(especie, estimacao, peso);
        setRaca(raca);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void som(){
        System.out.println(getEspecie() + ": Auau");
    }
}
