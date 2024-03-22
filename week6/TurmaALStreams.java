package week6;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class TurmaALStreams {

    private String designacao;

    private List<Aluno> alunos;



    public TurmaALStreams() {
        this.designacao = new String("POO");
        this.alunos = new ArrayList<>();
    }

    public TurmaALStreams(String designacao) {
        this.designacao = designacao;  
        this.alunos = new ArrayList<>(); 
    }

    public TurmaALStreams(String designacao, List<Aluno> al) {
        this.designacao = designacao;
        this.alunos = this.alunos.stream() //iterar sobre uma lista
                    .map(Aluno::clone)
                    .collect(Collectors.toList());
        }

    public TurmaALStreams(TurmaALStreams al){
        this.designacao = al.getDesignacao();
        this.alunos = al.getAlunos();
    }

    public List<Aluno> getAlunos() {
        //iterar todos os elementos, mapea-los recursivamente e clonar, depois recolher numa lista
        return this.alunos.stream().map(Aluno::clone).collect(Collectors.toList()); 
    }


    public String getDesignacao() {
        return this.designacao;
    }

    public void addAluno(Aluno a) {
        this.alunos.add(a.clone());
    }

    public boolean existeAluno(Aluno a) {
        return this.alunos.contains(a);
    }

    public boolean existeAluno(String numero){
        //"a" seja algo resultado de get.numero ser igual ao nr de input
        return this.alunos.stream().anyMatch(a -> a.getNumero().equals(numero));
    }

    public List<Aluno> alunos_passam(){
        return this.alunos.stream()
                .filter(a -> a.getNota() > 10)
                .map(l -> l.clone()) //cuidado, fazer o map depois senao iamos devolver os alunos todos
                .collect(Collectors.toList());
    }

    public List<Aluno> ordem_crescente(){
        return this.alunos.stream()
            .map(l -> l.clone())
            .sorted((l1,l2) -> l1.getNome().compareTo(l2.getNome())) //ordem crescente, senao comparavamos o l2 com o l1
            .collect(Collectors.toList());                          // para ordem decrescente!!
    }
    /*OU:
        Comparator<Aluno> comp = (l1,l2) -> l1.getNome().compareTo(l2.getNome());
        (...)
        .sorted(comp)
        (...)
    */

}

