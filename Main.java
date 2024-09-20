
public class Main {
    public static void main(String[] args){
        Tarefa tarefa1 = new Tarefa("Estudar POO", "Revisar os conceitos de classes e objetos", "2024-15-48", 1);
        Tarefa tarefa2 = new Tarefa("Estudar para provas", "2050-10-25");

        System.out.println("=============== Tarefa Comum ===============");
        tarefa1.executarTarefa();

        tarefa2.cancelarTarefa();
        

    }
}