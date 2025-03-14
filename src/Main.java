import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Criando professores

        Professor Ana = new Professor("Ana Maria Sousa", 22, "22/08/2019", "13372154432",  "sousa.maria@ifpb.edu.br", 40, 4600, "Tecnologia", "2019123");
        Professor Jorge = new Professor("Jorge Matos Silva", 45, "12/03/2017", "13372157854",  "matos.jorge@ifpb.edu.br", 30, 3600, "Letras", "2017231");
        Professor Mateus = new Professor("Mateus Cordeiro Viana", 27, "22/08/2020", "19872154432",  "viana.cordeiro@ifpb.edu.br", 40, 8600, "Tecnologia", "2020123");

        // Criando Técnicos Administrativos

        TecAdministrativo Ruan = new TecAdministrativo("Ruan Júnior Pereira", 38, "13/12/2015", "14565476589", "junior.pereira@ifpb.edu.br", 20, 1512, "Laboratório", "Matutino");
        TecAdministrativo Hiago = new TecAdministrativo("Hiago Gomes Santos", 43, "13/12/2018", "16265476589", "santos.hiago@ifpb.edu.br", 40, 3590, "Coordenação", "Vespertino");
        TecAdministrativo Alexandra = new TecAdministrativo("Alexandra Maria Alves", 30, "13/12/2017", "14565476589", "alves.alexandra@ifpb.edu.br", 20, 1512, "Laboratório", "Vespertino");

        // Criando Estudantes

        Estudante Maria = new Estudante("Maria Beatriz de Sales", 19, "12365498792", "Técnico em Informática", 3, "20232456");
        Estudante Carlos = new Estudante("Carlos Daniel Matos", 22, "17865498791", "Técnico em Informática", 1, "2025245469");
        Estudante Lummarem = new Estudante("Lummarem Santos Sousa", 23, "89065498799", "Análise e Desenvolvimento de Sistemas", 4, "20222498");
        Estudante Augusto = new Estudante("Augusto Oliveria Gouveia", 21, "53265498790", "Análise e Desenvolvimento de Sistemas", 2, "20242412");

        // Cadastrando servidores e alunos

        InstitutoFederal ifpb = new InstitutoFederal(new ArrayList<Servidor>(), new ArrayList<Estudante>());

        //servidores
        ifpb.cadastrarServidor(Ruan);
        ifpb.cadastrarServidor(Hiago);
        ifpb.cadastrarServidor(Alexandra);
        ifpb.cadastrarServidor(Ana);
        ifpb.cadastrarServidor(Jorge);
        ifpb.cadastrarServidor(Mateus);

        //alunos
        ifpb.matricularEstudante(Maria);
        ifpb.matricularEstudante(Augusto);
        ifpb.matricularEstudante(Lummarem);
        ifpb.matricularEstudante(Carlos);

        //visualizando estudantes e servidores

        ifpb.exibirEstudantes();
        ifpb.exibirServidores();

        // Criando Aulas

        Aula Met1 = new Aula("Metodologia", "22/01/2025", Ana);
        Aula Alg1 = new Aula("Algoritmo", "22/01/2025", Jorge);
        Aula Web2 = new Aula("Desenvolvimento de Aplicações Web", "22/01/2025", Mateus);

        // Registrando aulas

        Ana.registrarAula(Met1);
        Mateus.registrarAula(Web2);
        Jorge.registrarAula(Alg1);

        // Criando diários

         Diario metodologia = new Diario(Ana, new ArrayList<Estudante>(), 111);
         Diario algoritmo = new Diario(Jorge, new ArrayList<Estudante>(), 222 );
         Diario web = new Diario(Mateus, new ArrayList<Estudante>(), 333 );

         // Adicionando alunos nos diários

        metodologia.adicionarEstudante(Maria);
        algoritmo.adicionarEstudante(Augusto);
        algoritmo.adicionarEstudante(Lummarem);
        web.adicionarEstudante(Carlos);

        // Visualizando diarios

        metodologia.verDiario(metodologia);
        algoritmo.verDiario(algoritmo);
        web.verDiario(web);

        // Criando projetos

        ProjetoPesquisa FogoMato = new ProjetoPesquisa("Fogo no Mato", "01/04/2023", 8, new ArrayList<Estudante>(), "Incêndios Florestais", 40000, "CNPQ", Mateus);
        ProjetoExtensao MulherTech = new ProjetoExtensao("Mulher Tech", "10/01/2025", 10, new ArrayList<Estudante>(), "Mulheres programadoras", "UFCG");

        // Adicionando alunos aos projetos

        FogoMato.addEstudante(Lummarem);
        MulherTech.addEstudante(Maria);

        // Vizualizando projetos

        FogoMato.verProjeto(FogoMato);
        MulherTech.verProjeto(MulherTech);





    }

}