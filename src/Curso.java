public class Curso {
    static int PROX_ID;
    private String titulo;
    private String ementa;
    private String nomeInstrutor;
    private int numVagas;
    private String[] palavrasChave;
    private int indexPalavrasChave;
    private int cursoID;
    private String status;
    private Aluno[] arrayAlunosMatriculados;
    private int indexAlunosMatriculados;

    public Curso(String titulo, String ementa, String nomeInstrutor, int numVagas) {
        this.titulo = titulo;
        this.ementa = ementa;
        this.nomeInstrutor = nomeInstrutor;
        this.numVagas = numVagas;
        this.palavrasChave = new String[3];
        this.indexPalavrasChave = 0;
        this.cursoID = ++PROX_ID;
        this.status = "Matrículas abertas";
        this.arrayAlunosMatriculados = new Aluno[numVagas];
        this.indexAlunosMatriculados = 0;
    }

    public Curso(String titulo, String ementa, String nomeInstrutor, int numVagas, String[] palavrasChave) {
        this.titulo = titulo;
        this.ementa = ementa;
        this.nomeInstrutor = nomeInstrutor;
        this.numVagas = numVagas;
        this.palavrasChave = palavrasChave;
        this.indexPalavrasChave = 0;
        this.cursoID = ++PROX_ID;
        this.status = "Matrículas abertas";
        this.arrayAlunosMatriculados = new Aluno[numVagas];
        this.indexAlunosMatriculados = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getNomeInstrutor() {
        return nomeInstrutor;
    }

    public void setNomeInstrutor(String nomeInstrutor) {
        this.nomeInstrutor = nomeInstrutor;
    }

    public int getNumVagas() {
        return numVagas;
    }

    public void setNumVagas(int numVagas) {
        this.numVagas = numVagas;
    }

    public String[] getPalavrasChave() {
        return palavrasChave;
    }

    public void setPalavrasChave(String palavraChave) {
        this.palavrasChave[indexPalavrasChave] = palavraChave;
        this.setIndexPalavrasChave();
    }

    public int getIndexPalavrasChave() {
        return indexPalavrasChave;
    }

    public void setIndexPalavrasChave() {
        if (indexPalavrasChave == 2){
            this.indexPalavrasChave = 0;
        } else this.indexPalavrasChave++;
    }

    public int getCursoID() {
        return cursoID;
    }

    public void setCursoID(int cursoID) {
        this.cursoID = cursoID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Aluno[] getArrayAlunosMatriculados() {
        return arrayAlunosMatriculados;
    }

    public void setArrayAlunosMatriculados(Aluno[] arrayAlunosMatriculados) {
        this.arrayAlunosMatriculados = arrayAlunosMatriculados;
    }

    public void addAluno(Aluno aluno){
        this.arrayAlunosMatriculados[indexAlunosMatriculados] = aluno;
        this.indexAlunosMatriculados++;
    }


}
