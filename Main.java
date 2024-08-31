class Tarefa {
    // Atributos privados
    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;

    // Construtor
    public Tarefa(String titulo, String descricao, String prazo, int prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
    }

    public Tarefa(String titulo) {
        this.titulo = titulo;
        this.descricao = new String();
        this.prazo = "";
        this.prioridade = 0;
    }

    // Métodos Get e Set
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Implementar getters e settes para os outros atributos
    public void exibirDetalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Prazo: " + this.prazo);
        System.out.println("Prioridade: " + this.prioridade);
    }
}

public class Main {
    public static void main(String[] args){
        Tarefa tarefa1 = new Tarefa("Estudar POO", "Revisar os conceitos de classes e objetos", "06-09-2024", 1);
        System.out.println("Título: " + tarefa1.getTitulo());
        tarefa1.exibirDetalhes();
    }
}