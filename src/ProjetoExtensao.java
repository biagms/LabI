import java.util.ArrayList;

public class ProjetoExtensao extends Projeto {
    private String publicoAlvo;
    private String parceiros;

    public ProjetoExtensao(String nome, String dataInicio, int cargaSemanal, ArrayList<Estudante> estudantes, String publicoAlvo, String parceiros) {
        super(nome, dataInicio, cargaSemanal, estudantes);
        this.publicoAlvo = publicoAlvo;
        this.parceiros = parceiros;
    }

    public String getPublicoAlvo() {
        return publicoAlvo;
    }

    public void setPublicoAlvo(String publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }

    public String getParceiros() {
        return parceiros;
    }

    public void setParceiros(String parceiros) {
        this.parceiros = parceiros;
    }

    @Override
    public void addEstudante(Estudante estudante) {
        super.getEstudantes().add(estudante);
    }

    @Override
    public void verProjeto(Projeto projeto) {
        System.out.println("\n" + "Nome do projeto: " + projeto.getNome() + "\n" +
                "Tipo: " + projeto.getClass().getName() + "\n" +
                "Publico-alvo: " + publicoAlvo + "\n" +
                "Carga horária semanal: " + projeto.getCargaSemanal() + "\n" +
                "Estudantes: ");
        for (Estudante estudante : projeto.getEstudantes()){
            System.out.println(estudante.getNome());
        }
    }
}
