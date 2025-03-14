import java.util.ArrayList;

public class Diario {
    private Professor professor;
    private ArrayList<Estudante> estudantes;
    private int id;

    public Diario(Professor professor, ArrayList<Estudante> estudantes, int id) {
        this.professor = professor;
        this.estudantes = estudantes;
        this.id = id;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void adicionarEstudante(Estudante estudante){
        estudantes.add(estudante);

    }

    public void verDiario(Diario diario){
        System.out.println( "\n" + "Diário - " + id +  "\n" + "Professor: " + diario.professor.getNome() + "\n" +
                            "Estudantes: ");
        for (Estudante estudante : diario.estudantes){
            System.out.println(estudante.getNome() + " - " + estudante.getPeriodo() + " período.");
        }


    }
}
