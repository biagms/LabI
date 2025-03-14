public class Aula {
    private Professor professor;
    private String conteudo;
    private String data;

    public Aula(String conteudo, String data, Professor professor) {
        this.conteudo = conteudo;
        this.data = data;
        this.professor = professor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
