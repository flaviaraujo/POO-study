import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TurmaALTest {

    @Test
    void testExisteAluno() {
        TurmaAL turma = new TurmaAL("Turma 2");
        Aluno aluno = new Aluno("1", 20, "Miguel", "LEI");
        turma.addAluno(aluno);
        Aluno aluno2 = new Aluno("2", 10, "Flavia", "LEI");
        turma.addAluno(aluno2);

        List<Aluno> alunos = turma.getAlunos();
        assertTrue(alunos.contains(aluno2));

    }

    @Test
    void testGetAlunos() {
        TurmaAL turma = new TurmaAL("Turma 2");
        List<Aluno> alunos = turma.getAlunos();

        assertTrue(alunos.isEmpty());
        


    }
}
