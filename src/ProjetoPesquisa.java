import java.util.ArrayList;

public class ProjetoPesquisa extends Projeto{
    private String areaPesquisa;
    private double orcamento;
    private String financiamento;
    public Professor professorResponsavel;

    public ProjetoPesquisa(String nome, String dataInicio, int cargaSemanal, ArrayList<Estudante> estudantes, String areaPesquisa, double orcamento, String financiamento, Professor professorResponsavel) {
        super(nome, dataInicio, cargaSemanal, estudantes);
        this.areaPesquisa = areaPesquisa;
        this.orcamento = orcamento;
        this.financiamento = financiamento;
        this.professorResponsavel = professorResponsavel;
    }

    public String getAreaPesquisa() {
        return areaPesquisa;
    }

    public void setAreaPesquisa(String areaPesquisa) {
        this.areaPesquisa = areaPesquisa;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public String getFinanciamento() {
        return financiamento;
    }

    public void setFinanciamento(String financiamento) {
        this.financiamento = financiamento;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    @Override
    public void addEstudante(Estudante estudante) {
        super.getEstudantes().add(estudante);
    }

    @Override
    public void verProjeto(Projeto projeto) {
        System.out.println("\n" + "PROJETOS" + "\n" +
                "Tipo: " + projeto.getClass().getName() + "\n" +
                "Nome do projeto: " + projeto.getNome() + "\n" +
                "Publico-alvo: " + areaPesquisa + "\n" +
                "Carga horária semanal: " + projeto.getCargaSemanal() + "\n" +
                "Estudantes: ");
        for (Estudante estudante : projeto.getEstudantes()){
            System.out.println(estudante.getNome() + "\n");
        }
    }
}
