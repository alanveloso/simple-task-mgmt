# Construtores, métodos e encapsulamento avançado

## Sobrecarga de construtor

* A sobrecarga de construtores permite ter múltiplos construtores em uma classe, cada um com uma _assinatura_ diferente (quantidade de parâmetro diferente).

* **Objetivo**: Flexibilizar a criação de objetos, permitindo inicializações variadas.

* **Exemplo**: Implemtanção de dois construtores na classe `Tarefa` para suportar duferentes formas de inicialização.
    * Construtor completo: aceita todos o parametros
    * Construtor simples: aceita título e prazo, com valores padrão em outros atributos.

## Métodos avançados

* Adicionar método para calcular o tempo restante até o prazo da tarefa.
* Detalhes:
    * Método: `cacularDiasRestantes()` usa `LacalDate` e `ChronoUnit` para calcular a diferente entre hoje e prazo da tarefa.

## Encapsulamento avançado e boas práticas

* Esconder detalhes internos da implamentação e expor somente o necessário.
* Objetivo: Protejar os dados da classe e garantir que apenas métodos autorizados possam alterá-los.
* Datalhes:
    * Método privado: `isPrazoValido()` valida o formato do prazo.
    * Método públic: `setPrazo()` usa a validação antes de definir o valor.

## Boas práticas na estrutura de classes
* Práticas recomendadas para garatir qe o código seja limpo, eficiente e fácil de manter.
* Objetivo: Mantter a classe foca em uma única resposabilidade, utilizar nomes claros e evitar repetição de código.
