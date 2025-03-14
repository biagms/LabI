import java.util.ArrayList;

abstract class Projeto {
    private String nome;
    private String dataInicio;
    private int cargaSemanal;
    private ArrayList<Estudante> estudantes;

    public Projeto(String nome, String dataInicio, int cargaSemanal, ArrayList<Estudante> estudantes) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.cargaSemanal = cargaSemanal;
        this.estudantes = estudantes;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public int getCargaSemanal() {
        return cargaSemanal;
    }

    public void setCargaSemanal(int cargaSemanal) {
        this.cargaSemanal = cargaSemanal;
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public abstract void addEstudante(Estudante estudante);

    public abstract void verProjeto(Projeto projeto);

}