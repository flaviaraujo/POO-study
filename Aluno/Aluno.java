public class Aluno {
    
    private String numero;

    private int nota;

    private String nome;

    private String curso;


    public Aluno() {
        this.numero = "";
        this.nota = 0;
        this.nome = "";
        this.curso = "";
    }

    public Aluno(String numero, int nota, String nome, String curso) {
        this.numero = numero;
        this.nota = nota;
        this.nome = nome;
        this.curso = curso;
    }

    public Aluno(Aluno aluno) {
        this.numero = aluno.getNumero();
        this.nota = aluno.getNota();
        this.nome = aluno.getNome();
        this.curso = aluno.getCurso();
    }

    public String getNumero() {
        return this.numero;
    }

    public int getNota() {
        return this.nota;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        Aluno a = (Aluno) o;
        return (this.numero.equals(a.getNumero()) && this.nota == a.getNota()
                && this.nome.equals(a.getNome()) && this.curso.equals(a.getCurso()));
    }

    public Aluno clone() {
        return new Aluno(this);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("Numero: ");
        sb.append(this.numero+"\n");
        sb.append("Nome: ");
        sb.append(this.nome+"\n");
        sb.append("Curso: ");
        sb.append(this.curso+"\n");
        sb.append("Nota: ");
        sb.append(this.nota+"\n");
       
        return sb.toString();
    }
}
