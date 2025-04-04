
public class Cachorro extends Animal {
    private String raca;
    private boolean farejador;
    private int nivelEnergia;
    private boolean adestrado;

    public Cachorro () {}

    public Cachorro(String raca, boolean farejador, int nivelEnergia, boolean adestrado, String nome, int idade ){
        super(nome, idade);
        this.raca = raca;
        this.farejador = farejador;
        this.nivelEnergia = nivelEnergia;
        this.adestrado = adestrado;
    }

    public String getRaca(){
        return raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public boolean getFarejador(){
        return farejador;
    }

    public void setFarejador(boolean farejador){
        this.farejador = farejador;
    }

    public int getNivelEnergia(){
        return nivelEnergia;
    } 

    public void setNivelEnergia(int nivelEnergia){
        this.nivelEnergia = nivelEnergia;
    }
    public boolean getAdestrado(){
        return adestrado;
    }
    public void setAdestrado(boolean adestrado){
        this.adestrado = adestrado;
    }

    public void emitirSom(){
        System.out.println("O cachorro faz auau");
    }

}