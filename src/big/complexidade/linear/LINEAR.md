⚡️ Explicando a Complexidade Algorítmica Linear, também conhecida como O(N).

Vamos supor que você esteja lavando a louça após aquele grande almoço de domingo,
cada prato exige uma atenção individual e o esforço é o mesmo aplicado para todos eles correto?
Supondo que você demore 30 segundos para lavar cada prato, demorará 60 segundos para dois pratos, 90 segundos
para três pratos, e assim sucessivamente. Conforme mais pratos são adicionados a complexidade da tarefa não aumenta,
mas também não diminui, ou seja, é uma relação previsível e linear.
Isso é um ótimo exemplo do que chamamos de complexidade linear, representada pela notação O(N).

📌 O que significa O(N)?
A complexidade O(N) indica que o tempo de execução de um algoritmo aumenta linearmente à medida que a
quantidade de problemas (ou quantidade de dados) cresce.
Ou seja, com base no tamanho da entrada e o tempo para cada execução é possível prever o tempo total para executar
o programa.

🔍 Exemplo Prático:
No código abaixo, simulamos a lavagem de pratos em diferentes pias, onde cada array interno da matriz representa uma
pia com uma determinada quantidade de louças. Observe que o tempo necessário para lavar a primeira pia (1 prato) é de
30 segundos, enquanto a segunda pia (5 pratos) leva 150 segundos, e a terceira (10 pratos) leva 300 segundos.
Isso acontece porque o tempo total cresce proporcionalmente à quantidade de pratos, seguindo um padrão linear.