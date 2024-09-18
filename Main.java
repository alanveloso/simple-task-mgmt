
public class Main {
    public static void main(String[] args){
        Tarefa tarefa1 = new Tarefa("Estudar POO", "Revisar os conceitos de classes e objetos", "2024-15-48", 1);

        System.out.println("=============== Testando métodos gets ===============");
        System.out.println("Título: " + tarefa1.getTitulo());
        System.out.println("Descrição: " + tarefa1.getDescricao());
        System.out.println();

        System.out.println("=============== Imprimindo com método exibitDetalhes() ===============");
        tarefa1.exibirDetalhes();

        System.out.println("=============== Imprimindo tarefa com o costrutor 2 ===============");

        Tarefa tarefa2 = new Tarefa("Estudar para provas", "2050-10-25");

        tarefa2.exibirDetalhes();


        System.out.println("Dias restantes para a tarefa 1: " + tarefa2.calcularDiasRestantes());

        System.out.print("Novo prazo da tarefa 1: ");
        tarefa1.setPrazo("2024-15-48");

        System.out.println("=============== Imprimindo tarefa ugente ===============");

        TarefaUrgente tarefaUrg1 = new TarefaUrgente("Estudar para a prova", "Conceitos de POO", "2024-10-02", "Não entendi nada");

        tarefaUrg1.exibirDetalhes();


        System.out.println("=============== Imprimindo tarefa ugente ===============");

        Tarefa[] listaTarefas = new Tarefa[3];

        listaTarefas[0] = tarefa1;
        listaTarefas[1] = tarefa2;
        listaTarefas[2] = tarefaUrg1;

        for (Tarefa tarefa : listaTarefas) {
            tarefa.exibirDetalhes();
        }

    }
}