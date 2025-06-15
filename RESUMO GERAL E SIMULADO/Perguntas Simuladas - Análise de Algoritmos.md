# Perguntas Simuladas - Análise de Algoritmos

## 1. Notação Assintótica

**Questão 1:** Considere as seguintes funções:

$f(n) = 3n^3 + 2n^2 + 5$
$g(n) = n^3$

Assinale a proposição correta:

a) $f(n) \in O(n^2)$
b) $f(n) \in \Omega(n^4)$
c) $f(n) \in \Theta(n^3)$
d) $f(n) \in O(log n)$

**Questão 2:** Qual das seguintes afirmações sobre notações assintóticas é verdadeira?

a) Se $f(n) = O(g(n))$, então $f(n)$ cresce mais rápido que $g(n)$.
b) A notação $\Omega$ descreve o limite superior de um algoritmo.
c) A notação $\Theta$ indica que o tempo de execução de um algoritmo está limitado tanto superior quanto inferiormente por uma função.
d) Um algoritmo com complexidade $O(n)$ sempre será mais rápido que um algoritmo com complexidade $O(n^2)$ para qualquer tamanho de entrada $n$.

**Questão 3:** Analise o seguinte trecho de código Java:

```java
public void exemplo(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.println("Iteração");
        }
    }
}
```

Qual a complexidade de tempo de execução deste método em termos de notação Big O?

a) $O(n)$
b) $O(log n)$
c) $O(n^2)$
d) $O(1)$




## 2. Algoritmos Gulosos

**Questão 4:** O Problema da Mochila Fracionária pode ser resolvido de forma ótima utilizando um algoritmo guloso. Qual o critério guloso correto para este problema?

a) Escolher os itens com maior peso primeiro.
b) Escolher os itens com menor valor primeiro.
c) Escolher os itens com maior valor por unidade de peso primeiro.
d) Escolher os itens aleatoriamente.

**Questão 5:** Em qual das seguintes situações um algoritmo guloso *não* garante a solução ótima?

a) Problema da Mochila Fracionária.
b) Problema do Troco (com moedas canônicas).
c) Encontrar a Árvore Geradora Mínima (MST) usando Prim.
d) Problema do Caixeiro Viajante.




## 3. Teoria dos Grafos

**Questão 6:** Considere um grafo $G = (V, E)$ onde $V = \{A, B, C, D\}$ e $E = \{(A,B), (B,C), (C,A), (C,D)\}$. Qual das seguintes afirmações é verdadeira?

a) O grafo é bipartido.
b) O grafo não possui ciclos.
c) O vértice D é adjacente a A.
d) O grafo é conexo.

**Questão 7:** Qual a principal diferença entre a Matriz de Adjacência e a Lista de Adjacências como representações de grafos?

a) A Matriz de Adjacência é mais eficiente para grafos esparsos, enquanto a Lista de Adjacências é melhor para grafos densos.
b) A Matriz de Adjacência usa mais espaço para grafos esparsos, enquanto a Lista de Adjacências é mais eficiente em termos de espaço para esses grafos.
c) A Matriz de Adjacência só pode representar grafos direcionados, enquanto a Lista de Adjacências pode representar ambos.
d) A Lista de Adjacências é usada apenas para grafos ponderados.

**Questão 8:** O algoritmo de Dijkstra é utilizado para:

a) Encontrar ciclos negativos em um grafo.
b) Encontrar o caminho mais curto em grafos com arestas de pesos negativos.
c) Encontrar o caminho mais curto de uma origem para todos os outros vértices em grafos com pesos de arestas não negativos.
d) Construir uma Árvore Geradora Máxima.

**Questão 9:** Em relação aos algoritmos de Kruskal e Prim para encontrar a Árvore Geradora Mínima (MST), qual afirmação é correta?

a) Ambos os algoritmos são gulosos e sempre encontram a MST.
b) Kruskal utiliza uma fila de prioridade, enquanto Prim utiliza a estrutura UNION-FIND.
c) Prim funciona apenas em grafos não conexos.
d) Kruskal não pode ser usado em grafos com ciclos.




## 4. Heaps e Heapsort

**Questão 10:** Em um heap máximo, qual a relação entre o valor de um nó pai e o valor de seus filhos?

a) O valor do pai é sempre menor que o valor de seus filhos.
b) O valor do pai é sempre maior ou igual ao valor de seus filhos.
c) O valor do pai é sempre igual ao valor de seus filhos.
d) Não há relação definida entre o valor do pai e o valor de seus filhos.

**Questão 11:** O procedimento `maxHeapify(A, i, n)` é responsável por:

a) Construir um heap máximo a partir de um array não ordenado.
b) Ordenar um array em ordem crescente.
c) Manter a propriedade de heap máximo em uma subárvore, assumindo que seus filhos já são heaps máximos.
d) Encontrar o menor elemento em um heap.

**Questão 12:** Qual a principal vantagem de usar um heap para implementar uma fila de prioridade?

a) Permite acesso aleatório rápido a qualquer elemento.
b) Garante que a inserção e a extração do elemento de maior prioridade sejam eficientes (logarítmicas).
c) Consome menos memória do que outras estruturas de dados.
d) É a única estrutura de dados que pode ser usada para filas de prioridade.



