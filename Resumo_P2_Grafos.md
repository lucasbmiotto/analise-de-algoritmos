
# 📚 Resumo P2 - Teoria dos Grafos e Algoritmos

## 🔗 Teoria dos Grafos

- **Grafo**: Conjunto de **vértices (nós)** conectados por **arestas (ligações)**.
- **Tipos de grafos**:
  - **Direcionado** vs **Não direcionado**
  - **Ponderado** vs **Não ponderado**
- **Representações**:
  - **Matriz de adjacência**: boa pra grafos densos
  - **Lista de adjacência**: boa pra grafos esparsos
- **Conceitos importantes**:
  - **Árvore**: Grafo conectado e sem ciclos
  - **Ciclo**: Caminho que volta para o mesmo vértice
  - **Conectividade**: Há caminho entre todos os pares de vértices

---

## 🔍 Algoritmo de Busca em Profundidade (DFS)

- Explora recursivamente até o final antes de voltar.
- Usa **pilha** (implícita com recursão ou explícita).
- Serve para:
  - Verificar conectividade
  - Detectar ciclos
  - Topological Sort (em DAGs)

### Exemplo em Python:
```python
def dfs(grafo, no, visitado):
    visitado.add(no)
    for vizinho in grafo[no]:
        if vizinho not in visitado:
            dfs(grafo, vizinho, visitado)
```

---

## 🧮 Relaxamento

- Técnica usada para atualizar distâncias mínimas:
```python
if dist[u] + peso(u, v) < dist[v]:
    dist[v] = dist[u] + peso(u, v)
```
- Usado em Dijkstra e Bellman-Ford.

---

## 🛣️ Algoritmo de Dijkstra

- Encontra o menor caminho de um vértice até os outros.
- **Não funciona com arestas negativas**.
- Usa **min-heap** (fila de prioridade).

### Passos:
1. Inicializa todas as distâncias com ∞, exceto o nó inicial (0)
2. Insere o nó inicial no heap
3. Enquanto o heap não estiver vazio:
   - Extrai o vértice com menor distância
   - Relaxa as arestas adjacentes

### Complexidade:
- `O((V + E) log V)` com heap

---

## ⚠️ Algoritmo de Bellman-Ford

- Funciona com **pesos negativos**.
- Detecta **ciclos de peso negativo**.

### Passos:
1. Inicializa as distâncias
2. Relaxa todas as arestas `V - 1` vezes
3. Verifica se ainda é possível relaxar (ciclo negativo)

### Complexidade:
- `O(V * E)`

---

## 🌉 Algoritmo de Kruskal

- Resolve o problema da **árvore geradora mínima (MST)**.
- Usa **Union-Find (Disjoint Set)** pra evitar ciclos.
- Adiciona arestas de menor peso sem formar ciclo.

### Passos:
1. Ordena as arestas por peso
2. Itera sobre as arestas:
   - Se os vértices estão em componentes diferentes, une eles
3. Continua até formar MST

### Complexidade:
- `O(E log E)`

---

## 🌀 Heap Sort

- Algoritmo de ordenação baseado em **heap binária (max-heap)**.
- **In-place** (sem uso extra de memória).
- **Não é estável**.

### Passos:
1. Constrói um heap com os dados
2. Troca o maior com o último
3. Reajusta o heap (heapify)
4. Repete até ordenar tudo

### Complexidade:
- Pior caso: `O(n log n)`

---

> ✅ Feito para revisão rápida da P2. Boa sorte! 🚀
