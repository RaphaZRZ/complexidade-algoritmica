⚡️ Explicando a Complexidade Algorítmica Logarítmica, também conhecida como O(log N).

Vamos imaginar que você deseja encontrar uma palavra específica em um dicionário. Como um dicionário contém milhares de 
palavras organizadas alfabeticamente, a busca por uma palavra pode ser otimizada. Em vez de folhear página por página, 
você pode abrir o dicionário no meio e verificar se a palavra desejada está na metade esquerda ou direita. Em seguida, 
repete o processo até encontrá-la. A cada etapa, o número de páginas a serem pesquisadas é reduzido pela metade. 
Por isso, o total de etapas necessárias é proporcional ao logaritmo do número total de páginas.\
Esse é um ótimo exemplo do que chamamos de complexidade logarítmica, representada pela notação O(log N).

📌 O que significa O(log n)?
A complexidade O(log N) indica que o tempo de execução de um algoritmo cresce logaritmicamente à medida que a 
quantidade de dados aumenta. Ou seja, conforme a entrada do problema cresce, o tempo necessário para resolvê-lo não 
aumenta na mesma proporção, mas sim de forma significativamente mais lenta.

🔍Exemplo Prático:
No código abaixo, tentamos calcular a raiz quadrada de diferentes valores (144, 1.048.576 e 268.402.689).
Observe que a quantidade de etapas necessárias para encontrar a raiz de 1.048.576 (13 etapas) não aumentou muito em 
relação à de 268.402.689 (18 etapas), mesmo com a grande diferença numérica entre os dois valores. 
Isso acontece porque o crescimento segue um padrão logarítmico.