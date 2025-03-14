abstract class Servidor {
    private String nome;
    private int idade;
    private String dataAdmissao;
    private String cpf;
    private String email;
    private int cargaSemanal;
    private float salario;

    public Servidor(String nome, int idade, String dataAdmissao, String cpf, String email, int cargaSemanal, float salario) {
        this.nome = nome;
        this.idade = idade;
        this.dataAdmissao = dataAdmissao;
        this.cpf = cpf;
        this.email = email;
        this.cargaSemanal = cargaSemanal;
        this.salario = salario;
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

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCargaSemanal() {
        return cargaSemanal;
    }

    public void setCargaSemanal(int cargaSemanal) {
        this.cargaSemanal = cargaSemanal;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }



}
