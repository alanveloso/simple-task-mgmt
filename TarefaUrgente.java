public class TarefaUrgente extends Tarefa {
    private String razaoUrgencia;

    // Construtor da Tarefa Urgente
    public TarefaUrgente(String titulo, String descricao, String prazo, String razaoUrgencia) {
        super(titulo, descricao, prazo, 5);  // new Tarefa()
        this.razaoUrgencia = razaoUrgencia;
    }

    // Métodos getters e setters
    public String getRazaoUrgencia() {
        return this.razaoUrgencia;
    }

    public void setRazaoUrgencia(String razaoUrgencia) {
        this.razaoUrgencia = razaoUrgencia;
    }

    // Sobreescrevendo o método exibirDetalhes()
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Razão da Urgência: " + this.razaoUrgencia);
    }
}