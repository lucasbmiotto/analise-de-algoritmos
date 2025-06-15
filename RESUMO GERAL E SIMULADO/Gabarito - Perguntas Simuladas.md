# Gabarito - Perguntas Simuladas

## 1. Notação Assintótica

**Questão 1:**

$f(n) = 3n^3 + 2n^2 + 5$
$g(n) = n^3$

A função $f(n)$ tem como termo dominante $3n^3$. A notação $\Theta(g(n))$ indica que $f(n)$ cresce assintoticamente igual a $g(n)$. Como $n^3$ é o termo de maior grau em $f(n)$, e $g(n)$ é $n^3$, então $f(n) \in \Theta(n^3)$.

**Resposta Correta:** c) $f(n) \in \Theta(n^3)$

**Questão 2:**

a) Falso. Se $f(n) = O(g(n))$, então $f(n)$ cresce *igual ou mais lentamente* que $g(n)$.
b) Falso. A notação $\Omega$ descreve o *limite inferior* de um algoritmo.
c) Verdadeiro. A notação $\Theta$ define um limite superior e inferior, indicando um crescimento assintótico justo.
d) Falso. Para pequenas entradas, um algoritmo $O(n^2)$ pode ser mais rápido devido a constantes menores. A vantagem assintótica de $O(n)$ se manifesta para grandes entradas.

**Resposta Correta:** c) A notação $\Theta$ indica que o tempo de execução de um algoritmo está limitado tanto superior quanto inferiormente por uma função.

**Questão 3:**

O código possui dois loops aninhados, onde cada loop externo e interno executa `n` vezes. Isso resulta em `n * n = n^2` operações no pior caso. Portanto, a complexidade é quadrática.

**Resposta Correta:** c) $O(n^2)$




## 2. Algoritmos Gulosos

**Questão 4:**

Para o Problema da Mochila Fracionária, a estratégia gulosa que garante a solução ótima é priorizar os itens que oferecem o maior valor por unidade de peso. Isso permite maximizar o valor total carregado na mochila, aproveitando ao máximo a capacidade disponível.

**Resposta Correta:** c) Escolher os itens com maior valor por unidade de peso primeiro.

**Questão 5:**

Algoritmos gulosos não garantem a solução ótima para todos os problemas de otimização. O Problema do Caixeiro Viajante é um exemplo clássico de problema para o qual um algoritmo guloso (como escolher a próxima cidade mais próxima) geralmente não encontra a rota mais curta. Para os outros problemas listados, algoritmos gulosos (ou variações deles) são conhecidos por encontrar a solução ótima.

**Resposta Correta:** d) Problema do Caixeiro Viajante.




## 3. Teoria dos Grafos

**Questão 6:**

Vamos analisar o grafo $G = (V, E)$ onde $V = \{A, B, C, D\}$ e $E = \{(A,B), (B,C), (C,A), (C,D)\}$:

*   **Arestas:** (A,B), (B,C), (C,A), (C,D)
*   **Conexões:**
    *   A está conectado a B e C.
    *   B está conectado a A e C.
    *   C está conectado a B, A e D.
    *   D está conectado a C.

Análise das proposições:

a) **O grafo é bipartido.** Falso. Existe um ciclo de comprimento 3 (A-B-C-A), o que impede que o grafo seja bipartido.
b) **O grafo não possui ciclos.** Falso. Como mencionado, existe o ciclo A-B-C-A.
c) **O vértice D é adjacente a A.** Falso. D está conectado apenas a C.
d) **O grafo é conexo.** Verdadeiro. É possível ir de qualquer vértice para qualquer outro vértice no grafo. Por exemplo, de D para A, o caminho é D-C-A.

**Resposta Correta:** d) O grafo é conexo.

**Questão 7:**

A Matriz de Adjacência é uma matriz $n \times n$ onde $n$ é o número de vértices. Para grafos esparsos (com poucas arestas), a maioria das entradas da matriz será zero, o que leva a um desperdício de espaço. A Lista de Adjacências, por outro lado, armazena apenas as conexões existentes, tornando-a mais eficiente em termos de espaço para grafos esparsos. Para grafos densos (com muitas arestas), a Matriz de Adjacência pode ser mais eficiente.

**Resposta Correta:** b) A Matriz de Adjacência usa mais espaço para grafos esparsos, enquanto a Lista de Adjacências é mais eficiente em termos de espaço para esses grafos.

**Questão 8:**

O algoritmo de Dijkstra é um algoritmo clássico para encontrar o caminho mais curto de um único vértice de origem para todos os outros vértices em um grafo com pesos de arestas não negativos. Ele não lida com ciclos negativos e não é usado para encontrar árvores geradoras máximas.

**Resposta Correta:** c) Encontrar o caminho mais curto de uma origem para todos os outros vértices em grafos com pesos de arestas não negativos.

**Questão 9:**

Ambos Kruskal e Prim são algoritmos gulosos que encontram a Árvore Geradora Mínima (MST) em grafos conexos e ponderados. Eles sempre encontram a MST. Kruskal ordena as arestas e as adiciona se não formarem ciclo, utilizando UNION-FIND. Prim constrói a MST adicionando vértices e arestas de menor peso que conectam a árvore em construção a um vértice fora dela. Ambos podem ser usados em grafos com ciclos, pois o objetivo é encontrar uma árvore (que por definição não tem ciclos) que abranja todos os vértices com o menor custo total.

**Resposta Correta:** a) Ambos os algoritmos são gulosos e sempre encontram a MST.




## 4. Heaps e Heapsort

**Questão 10:**

Em um heap máximo, a propriedade fundamental é que o valor de cada nó pai deve ser maior ou igual ao valor de seus filhos. Isso garante que o maior elemento esteja sempre na raiz do heap.

**Resposta Correta:** b) O valor do pai é sempre maior ou igual ao valor de seus filhos.

**Questão 11:**

O procedimento `maxHeapify` é uma operação chave na construção e manutenção de heaps máximos. Ele é chamado para corrigir uma possível violação da propriedade de heap máximo em um nó específico, assumindo que suas subárvores já são heaps. Ele não constrói o heap do zero nem ordena o array completamente.

**Resposta Correta:** c) Manter a propriedade de heap máximo em uma subárvore, assumindo que seus filhos já são heaps máximos.

**Questão 12:**

Heaps são estruturas de dados eficientes para implementar filas de prioridade porque as operações de inserção (adicionar um elemento) e extração do elemento de maior/menor prioridade (remover a raiz) podem ser realizadas em tempo logarítmico ($O(\log n)$), o que é muito eficiente para grandes conjuntos de dados. Outras opções, como acesso aleatório, não são o foco principal de um heap, e embora sejam eficientes em termos de memória, não é a principal vantagem em relação a outras estruturas para filas de prioridade.

**Resposta Correta:** b) Garante que a inserção e a extração do elemento de maior prioridade sejam eficientes (logarítmicas).



