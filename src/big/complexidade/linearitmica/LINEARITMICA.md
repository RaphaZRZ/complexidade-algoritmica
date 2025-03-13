⚡️ Explicando a Complexidade Algorítmica Linearítmica, também conhecida como O(n log n).

Vamos supor que você precise organizar um baralho em ordem crescente. Em vez de percorrer carta por carta e 
reposicioná-las individualmente, uma abordagem mais eficiente seria dividir o baralho em pequenos montes, 
organizar cada monte separadamente e depois combiná-los em um único conjunto já ordenado.

Observe que a divisão e reorganização ocorrem de forma estruturada, reduzindo gradualmente o problema até que todas as 
cartas estejam na sequência correta.  Esse é um ótimo exemplo do que chamamos de complexidade linearítmica, 
representada pela notação O(n log n), usada em algoritmos eficientes de ordenação, como Merge Sort e Quick Sort.

📌 O que significa O(n log n)?
A complexidade O(n log n) indica que o tempo de execução de um algoritmo aumenta proporcionalmente ao tamanho da entrada
multiplicado pelo logaritmo desse tamanho.
Ou seja, o problema é repartido em partes menores, essas partes menores são solucionadas e depois os resultados das
pequenas partes são agrupados para formar o resultado total do problema.

🔍 Exemplo Prático:
No código abaixo, simulamos a ordenação de um baralho utilizando o algoritmo Merge Sort, que possui complexidade 
O(n log n). O baralho é dividido em pequenas partes, cada parte é ordenada individualmente e depois as partes são 
combinadas em um único baralho já ordenado. Esse processo de divisão e fusão reduz gradualmente o problema até que 
todas as cartas estejam na sequência correta.