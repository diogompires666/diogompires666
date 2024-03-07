public class Aluno {
    static int PROX_ID = 0;
    private String nome;
    private String cpf;
    int[] arrayCursosRealizados;
    int countCursosRealizados;
    private final int alunoID;

    public Aluno(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.arrayCursosRealizados = new int[20];
        this.countCursosRealizados = 0;
        this.alunoID = ++PROX_ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int[] getArrayCursosRealizados() {
        return arrayCursosRealizados;
    }

    public void setArrayCursosRealizados(int idCurso) {
        this.arrayCursosRealizados[countCursosRealizados] = idCurso;
        this.countCursosRealizados++;
    }

    public int getAlunoID() {
        return alunoID;
    }

    public int getCountCursosRealizados() {
        return countCursosRealizados;
    }

    public void setCountCursosRealizados(int countCursosRealizados) {
        this.countCursosRealizados = countCursosRealizados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aluno aluno = (Aluno) o;

        return cpf.equals(aluno.cpf);
    }

    @Override
    public int hashCode() {
        return cpf.hashCode();
    }
}
