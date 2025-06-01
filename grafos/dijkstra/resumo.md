# Algoritmo de Dijkstra

## Pra que serve?

Calcula o menor caminho de um vértice origem para todos os outros em um grafo **com pesos positivos**.

## Como funciona?

1. Inicia as distâncias como infinito.
2. Distância da origem = 0.
3. Usa uma **fila de prioridade** pra sempre visitar o próximo vértice mais próximo.
4. Relaxa arestas ao visitar vizinhos (atualiza se achar caminho menor).

## Requisitos:

- Funciona apenas com pesos **não negativos**.
- Ideal quando o grafo não tem ciclos negativos (senão use Bellman-Ford).

## Complexidade:

- **Com heap**: O((V + E) log V)
- **Sem heap**: O(V²) com array normal

## Aplicações:

- GPS
- Redes (roteamento)
- Jogos (IA e pathfinding)
