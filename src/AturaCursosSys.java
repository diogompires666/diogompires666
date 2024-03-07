public class AturaCursosSys {
    private Aluno[] arrayAluno = new Aluno[100];
    private int indexAluno = 0;
    private Curso[] arrayCurso = new Curso[20];
    private int indexCurso = 0;


    public int adicionaAluno(String nome, String cpf){
        this.arrayAluno[indexAluno] = new Aluno(nome, cpf);
        this.indexAluno++;
        return this.arrayAluno[indexAluno - 1].getAlunoID();
    }

    public int adicionaCurso(String titulo, String ementa, String nomeInstrutor, int numVagas){
        this.arrayCurso[indexCurso] = new Curso(titulo,ementa,nomeInstrutor,numVagas);
        this.indexCurso++;
        return this.arrayCurso[indexCurso - 1].getCursoID();
    }

    public int adicionaCurso(String titulo, String ementa, String nomeInstrutor, int numVagas, String[] palavrasChave){
        this.arrayCurso[indexCurso] = new Curso(titulo,ementa,nomeInstrutor,numVagas,palavrasChave);
        this.indexCurso++;
        return this.arrayCurso[indexCurso - 1].getCursoID();
    }

    public boolean inscreveAluno(int cursoID, int alunoID){
        if (arrayCurso[cursoID - 1].getStatus().equals("Matrículas abertas")) {
            arrayCurso[cursoID - 1].addAluno(arrayAluno[alunoID - 1]);
            return true;
        } else return false;
    }

    public String statusCurso(int cursoID){
        return arrayCurso[cursoID - 1].getStatus();
    }

    public String listarCurso(int cursoID){
        return arrayCurso[cursoID - 1].toString();
    }
    public void alterarPalavrasChave(int cursoID, String palavraChave){
        this.arrayCurso[cursoID - 1].setPalavrasChave(palavraChave);
    }

    public boolean fecharInscricao(int cursoID){
        this.arrayCurso[cursoID - 1].setStatus("Matrículas encerradas! Curso " + this.arrayCurso[cursoID -1].getTitulo() + " em andamento!");
        return true;
    }

    public boolean concluirCurso(int cursoID){
        this.arrayCurso[cursoID - 1].setStatus("Curso " + this.arrayCurso[cursoID -1].getTitulo() + " concluído. Certificados emitidos!");

        return true;
    }
}
