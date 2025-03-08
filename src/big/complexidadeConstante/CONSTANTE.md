⚡️ Explicando a Complexidade Algorítmica Constante, também conhecida como O(1).

Você já percebeu que, ao pagar suas compras no supermercado, não importa se você tem 10 ou 1000 produtos, a ação de passar o cartão acontece rapidamente e de forma constante independentemente do tamanho do carrinho?\
Isso é um ótimo exemplo do que chamamos de complexidade constante, representada pela notação O(1).

📌 O que significa O(1)?
A complexidade O(1) indica que o tempo de execução de um algoritmo não muda conforme a quantidade de dados aumenta. 
Ou seja, independente do tamanho da entrada, a operação sempre leva aproximadamente o mesmo tempo.

Exemplo Prático:
No código abaixo, acessamos o primeiro elemento de arrays de diferentes tamanhos (10, 1000, 100000 elementos). 
Como esperado, o tempo de execução permanece quase o mesmo, pois acessar o primeiro elemento de um array é uma 
operação constante que não leva em consideração o tamanho do array.

Mas por que a primeira execução demora mais?
Isso acontece por causa do JVM Warm-up, onde a JVM otimiza a execução do código após a primeira iteração. 
Como estamos medindo tempos em milissegundos, essa variação inicial pode ser perceptível, 
mas não impacta a análise da complexidade algorítmica.

💡 Dica para entender melhor:
Pense no tamanho do array como o seu carrinho de compras e na ação de pegar o primeiro elemento como 
passar o cartão no caixa. O tamanho do carrinho não influencia na rapidez do pagamento, 
assim como o tamanho do array não afeta o tempo para acessar seu primeiro elemento!

