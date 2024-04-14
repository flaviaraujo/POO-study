package week8;
import java.io.Serializable;

public class Aluno_TE extends Aluno implements Serializable{

    private String empresa;

    public Aluno_TE(){
        super();
        this.empresa = "";
    }

    public Aluno_TE(String nome, Integer nota, String numero, String curso, String empresa){
        super(nome, nota, numero, curso);
        this.empresa = empresa;
    }

    public Aluno_TE(Aluno_TE alte){
        super(alte);
        this.empresa = alte.getEmpresa();
    }

    public String getEmpresa(){
        return this.empresa;
    }

    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }

    public String toString(){
        return "Aluno_TE{" + super.toString() + " " + "empresa=" + empresa + "\"}";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        Aluno_TE alunote = (Aluno_TE) o;
        return super.equals(alunote) && this.empresa.equals(alunote.getEmpresa());
    }
    
    public Aluno_TE clone() {
        return new Aluno_TE(this);
    }
}