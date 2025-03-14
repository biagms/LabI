import java.util.ArrayList;

public class Professor extends Servidor{
    private String area;
    private String matricula;

    public Professor(String nome, int idade, String dataAdmissao, String cpf, String email, int cargaSemanal, float salario, String area, String matricula) {
        super(nome, idade, dataAdmissao, cpf, email, cargaSemanal, salario);
        this.area = area;
        this.matricula = matricula;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString(){
        return "Nome: " + super.getNome() + "\n" +
                "Area: " + area + "\n" +
                "Data de admissão: " + super.getDataAdmissao();
    }

   public void registrarAula(Aula aula){
        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(aula);
       System.out.println("\n" + "Aulas registradas de " + super.getNome() + ":");
        for (Aula aulaRegistrada : aulas){
            System.out.println("Aula: " + aulaRegistrada.getConteudo() + "\n" + "Data: " + aulaRegistrada.getData() + "\n");
        };
   }


}
