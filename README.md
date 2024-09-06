# Sistema simples de gestão de tarefas

## Conceitos de POO

### Classe e Objetos: 

* Classe é um molde que define a estrutura e comportamento de objetos. Um objeto é um instancia concreta dessa classe.
* **Exemplo**: A classe `Tarefa` e cada tarefa criada no sistema será um objeto dessa classe.
* A classe define as características de uma tarefa, mas ainda não é uma tarefa específica.

### Atributos e métodos:

* Atributos são propriedades que armazenam o estado de um objeto. 
* Métodos são **funções dentro da classe** que operam esses atributos e definem o **comportamento dos objetos**.
* **Exemplo**: Os atributos da classe `Tarefa` são `titulo`, `descricao`, `prazo` e `prioridade` e os métodos são as funções básicas de acesso (getters e setters).
* Os métodos getters e setters possibilitam o acesso controlodo aos atributos, ou seja, possibilita o *encapsulamento*.

### Encapsulamento:

* Encapsulamento é proteção dos dados de uma classe, permitindo o acesso controlado através de métodos específicos.
* **Exemplo**: O modificador de acesso `private` não permite o acesso direito aos atributos da classe somente através do métodos que tem o modificador de acesso como `public`.
* O encapsulamento protege a integridade dos dados e facilita a manutenção do código, por que todos as regras estão encapsuladas em um único lugar.

### Construtor:

* Construtor possibilita a inicialização de objetos como o `public Tarefa(String titulo, String descricao, String prazo, int prioridade)` que inicializada um objetos com todos valores iniciais como:

```java
Tarefa tarefa1 = new Tarefa("Estudar POO", "Revisar os conceitos de classes e objetos", "2024-09-05", 1);
```

# Referência

DEITEL, P. J.; DEITEL, H. M. **Java: como programar**. 10. ed. São Paulo, SP: Pearson, 201.
