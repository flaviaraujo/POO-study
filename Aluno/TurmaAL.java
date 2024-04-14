import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TurmaAL {
    
    private String designacao;

    private List<Aluno> alunos;

//NOTA: não usamos o clone porque é por composição e não por agregação neste caso

    public TurmaAL() {
        this.designacao = "POO";
        this.alunos = new ArrayList<>();
    }

    public TurmaAL(String designacao) { //não é preciso colocar o array pq ele vai ser construido
        this.designacao = designacao;   //ao longo do programa
        this.alunos = new ArrayList<>(); 
    }

    public TurmaAL(String designacao, List<Aluno> outrosAlunos) {
        this.designacao = designacao;
        this.alunos = new ArrayList<>();
        for(Aluno a: outrosAlunos) {
            this.alunos.add(a.clone()); //DÚVIDA: clone mas é composição?
        }
    }

    public List<Aluno> getAlunos() {
        List<Aluno> copiaAlunos = new ArrayList<>();
        Iterator<Aluno> it = this.alunos.iterator();

        while(it.hasNext()) { //enquanto houver elementos
            Aluno a = it.next();
            copiaAlunos.add(a);
        }
        return copiaAlunos;
    }

    public String getDesignacao() {
        return this.designacao;
    }

    public void addAluno(Aluno a) {
        this.alunos.add(a.clone());
    }

    public boolean existeAluno1(Aluno a) {
        return this.alunos.contains(a);
    }

    public boolean existeAluno(String numero){
        boolean encontrado = false;
        Iterator<Aluno> it = this.alunos.iterator();

        while(it.hasNext() && !encontrado) {
            Aluno a = it.next();
            if(a.getNumero().equals(numero)) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public int posAluno(String numero){
        for(int i = 0; i < this.alunos.size(); i++) {
            if(this.alunos.get(i).getNumero().equals(numero)) {
                return i;
            }
        }
        return -1;
    }

    public Aluno getAlunoporNumero(String numero) {
        int pos = posAluno(numero);
        if(pos != -1)
            return this.alunos.get(pos).clone();
        else
            return null;
        }

}
