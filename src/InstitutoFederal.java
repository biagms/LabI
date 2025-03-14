import java.util.ArrayList;

public class InstitutoFederal {
    private ArrayList<Servidor> funcionarios;
    private ArrayList<Estudante> estudantes;

    public InstitutoFederal(ArrayList<Servidor> funcionarios, ArrayList<Estudante> estudantes) {
        this.funcionarios = funcionarios;
        this.estudantes = estudantes;

    }

    public ArrayList<Servidor> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Servidor> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }


    public void matricularEstudante(Estudante estudante){
        if (estudantes.contains(estudante)){
            System.out.println(estudante.getNome() + " já está matriculado.");

        } else {
            estudantes.add(estudante);
        }

    }

    public void cadastrarServidor(Servidor servidor){
        funcionarios.add(servidor);
    }


    public void exibirEstudantes(){
        System.out.println("ESTUDANTES");
        for (Estudante estudante : estudantes){
            System.out.println("\n" + "Nome: " + estudante.getNome() + "\n" + "Matricula: " + estudante.getMatricula() );
        }
    }

    public void exibirServidores(){
        System.out.println("\n" + "SERVIDORES");
        for (Servidor servidor : funcionarios){
            System.out.println("\n" + "Nome: " + servidor.getNome() + "\n" + "Carga semanal: " + servidor.getCargaSemanal());
        }
    }

}
