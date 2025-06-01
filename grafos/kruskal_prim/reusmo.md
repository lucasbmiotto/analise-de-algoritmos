# Kruskal vs Prim (Árvore Geradora Mínima - MST)

## Objetivo:
Encontrar a árvore geradora mínima (MST) — um subconjunto de arestas que conecta todos os vértices com o menor custo possível, sem formar ciclos.

---

## Kruskal

- Ordena todas as arestas por peso.
- Adiciona as menores arestas uma a uma, se **não formar ciclo**.
- Usa Union-Find com Path Compression e Union by Rank.

### Complexidade:
- O(E log E) com Union-Find

---

## Prim

- Começa em um vértice.
- Vai adicionando o vizinho mais barato que **não forma ciclo**.
- Usa **fila de prioridade (min-heap)**.

### Complexidade:
- O(E log V) com heap

---

## Quando usar?

- **Kruskal**: melhor pra grafos esparsos.
- **Prim**: melhor pra grafos densos.

---

## Aplicações

- Redes (fibra, energia)
- Mapas mínimos
- Otimização de custos em conexões
