⚡️ Explicando a Complexidade Algorítmica Quadrática, também conhecida como O(n^2).

Vamos supor que você quer experimentar todas as combinações possíveis de camisetas e calças presentes no seu armário.
Para cada uma das n camisetas, você tem a mesma quantidade de calças para experimentar. Por isso terá que experimentar
um total de n*n (n^2) combinações.

📌 O que significa O(n^2)?
A complexidade O(n^2) indica que o tempo de execução de um algoritmo aumenta ao quadrado do tamanho do problema.
Ou seja, isso significa que o tempo necessário para resolver um problema cresce rapidamente com o tamanho da entrada,
tornando-se mais lento do que o crescimento linear, mas geralmente mais rápido do que o crescimento exponencial.

🔍 Exemplo Prático:
No código abaixo, simulamos a geração de combinações entre camisetas e tênis. Para cada camiseta disponível, 
testamos a combinação com cada um dos tênis, resultando em um número total de pares proporcional ao quadrado da 
quantidade de itens.

Esse processo reflete a complexidade O(n²), pois para cada elemento (camiseta) percorremos novamente toda a lista de 
elementos (tênis), tornando o crescimento do tempo de execução quadrático em relação ao tamanho da entrada.