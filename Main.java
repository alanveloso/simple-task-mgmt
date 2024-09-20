
public class Main {
    public static void main(String[] args){
        Tarefa tarefa1 = new Tarefa("Estudar POO", "Revisar os conceitos de classes e objetos", "2024-15-48", 1);
        Tarefa tarefa2 = new Tarefa("Estudar para provas", "2050-10-25");

        System.out.println("=============== Tarefa Urgente ===============");

        TarefaUrgente tarefaUrg1 = new TarefaUrgente("Estudar para a prova", "Conceitos de POO", "2024-10-02", "Não entendi nada");

        tarefaUrg1.exibirDetalhes();

        System.out.println("=============== Tarefa com Prazo Flexível ===============");

        TarefaComPrazoFlexivel tarefaFlex1 = new TarefaComPrazoFlexivel("Estudar para estrutura de dados", "Conceitos de lista ligada", "2024-10-18", 2, 5);

        tarefaFlex1.exibirDetalhes();

        System.out.println("=============== Lista de tarefas comum, urgente e flexível ===============");

        Tarefa[] listaTarefas = new Tarefa[3];

        listaTarefas[0] = tarefa1;
        listaTarefas[1] = tarefaUrg1;
        listaTarefas[2] = tarefaFlex1;

        for (Tarefa tarefa : listaTarefas) {
            tarefa.exibirDetalhes();
            System.out.println("====================================================");
        }

    }
}