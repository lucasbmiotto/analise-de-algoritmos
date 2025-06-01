# Algoritmo de Bellman-Ford

## Para que serve?

Calcula o menor caminho de um vértice origem para todos os outros em um grafo **com pesos negativos** (diferente do Dijkstra).

## Como funciona?

1. Inicializa as distâncias com infinito.
2. Define a distância da origem como 0.
3. Repete |V| - 1 vezes:
   - Relaxa todas as arestas (tenta atualizar o custo do caminho).
4. Faz uma última passada pra ver se ainda é possível melhorar:  
   - Se sim, existe um **ciclo de peso negativo** no grafo.

## Complexidade

- **Tempo**: O(V·E), onde V = vértices e E = arestas
- **Espaço**: O(V)

## Vantagens

- Funciona com pesos negativos.
- Detecta ciclos negativos.

## Desvantagem

- Mais lento que o Dijkstra.
