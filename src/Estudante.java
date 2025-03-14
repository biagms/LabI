import java.util.ArrayList;

public class Estudante {
    private String nome;
    private int idade;
    private String cpf;
    private String curso;
    private int periodo;
    private String matricula;

    public Estudante(String nome, int idade, String cpf, String curso, int periodo, String matricula){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.curso = curso;
        this.periodo = periodo;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public void exibirDetalhes() {
        System.out.println(
                " Nome: " + nome + '\n' +
                        " Idade: " + idade + '\n' +
                        " CPF: " + cpf + '\n' +
                        " Curso: " + curso + '\n' +
                        " Periodo: " + periodo + '\n' +
                        " Matricula: " + matricula + '\n');




    }
}
