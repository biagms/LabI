public class TecAdministrativo extends Servidor {
    private String setor;
    private String turno;

    public TecAdministrativo(String nome, int idade, String dataAdmissao, String cpf, String email, int cargaSemanal, float salario, String setor, String turno) {
        super(nome, idade, dataAdmissao, cpf, email, cargaSemanal, salario);
        this.setor = setor;
        this.turno = turno;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
