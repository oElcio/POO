
public class Cuidador {
    private int anosExperiencia;
    private String especialidade;
    private String turno;
    private String Cpf;
    private Animal animalCuidado;

    public Cuidador(){}

    public Cuidador(int anosExperiencia, String especialidade, String turno, String Cpf){
        this.anosExperiencia = anosExperiencia;
        this.especialidade = especialidade;
        this.turno = turno;
        this.Cpf = Cpf;
    }

    public void CuidadoDeAnimal(Animal animalCuidado){
        this.animalCuidado = animalCuidado;
    }

    public int getAnosExperiencia(){
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia){
        this.anosExperiencia = anosExperiencia;
    }

    public String especialidade(){
        return especialidade;
    }

    public void especialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public String turno(){
        return turno;
    }

    public void turno(String turno){
        this.turno = turno;
    }

    public String Cpf(){
        return Cpf;
    }

    public void Cpf(String Cpf){
        this.Cpf = Cpf;
    }

}
