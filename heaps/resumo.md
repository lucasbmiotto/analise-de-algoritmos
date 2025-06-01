# Heap e Fila de Prioridade

## O que é um Heap?

- Estrutura de dados baseada em árvore binária.
- Pode ser:
  - **Max-Heap**: pai ≥ filhos (usado no HeapSort)
  - **Min-Heap**: pai ≤ filhos (usado em filas de prioridade)

## HeapSort

- Ordena os elementos transformando o array em um heap.
- Complexidade: **O(n log n)**
- Estável: ❌
- In-place: ✅

## Fila de Prioridade

- Permite inserir e remover elementos com base em prioridade.
- Min-Heap: remove o menor elemento.
- Pode ser implementada:
  - Manualmente com array e heapify
  - Usando `PriorityQueue` do Java

## Aplicações

- Algoritmos de caminhos mínimos (Dijkstra, A*)
- Sistemas de agendamento
- Gerenciadores de tarefas/processos
