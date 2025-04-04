public class Papagaio extends Animal{
    private String corPenas;
    private boolean podeFalar;
    private String origem;
    private double alturaVooMaxima;

    public Papagaio(){}

    public Papagaio(String corPenas, boolean podeFalar, String origem, double alturaVooMaxima, String nome, int idade){
        super(nome, idade);
        this.corPenas = corPenas;
        this.podeFalar = podeFalar;
        this.origem = origem;
        this.alturaVooMaxima = alturaVooMaxima;
    }

    public String getCorPena(){
        return corPenas;
    }

    public void setCorPenas(String corPenas){
        this.corPenas = corPenas;
    }

    public boolean podeFalar(){
        return podeFalar;
    }

    public void podeFalar (boolean podeFalar){
        this.podeFalar = podeFalar;
    }

    public String origem(){
        return origem;
    }

    public void origem (String origem){
        this.origem = origem;
    }

    public double alturaVooMaxima(){
        return alturaVooMaxima;
    }

    public void alturaVooMaxima(double alturaVooMaxima){
        this.alturaVooMaxima = alturaVooMaxima;
    }

    public void emitirSom(){
        System.out.println("O papagaio faz piu piu");
    }

}