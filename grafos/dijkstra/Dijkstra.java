import java.util.*;

// Implementação do algoritmo de Dijkstra com fila de prioridade
public class Dijkstra {

    // Classe auxiliar para representar um nó e sua distância (usada na fila de prioridade)
    static class No implements Comparable<No> {
        String nome;
        int distancia;

        No(String nome, int distancia) {
            this.nome = nome;
            this.distancia = distancia;
        }

        // Isso faz a PriorityQueue ordenar pelos menores valores de distância
        public int compareTo(No outro) {
            return Integer.compare(this.distancia, outro.distancia);
        }
    }

    public static void main(String[] args) {
        // Criação do grafo como lista de adjacência
        Map<String, List<Grafo.Aresta>> grafo = new HashMap<>();

        // Adiciona vértices e arestas manualmente
        adicionarAresta(grafo, "A", "B", 2);
        adicionarAresta(grafo, "A", "C", 4);
        adicionarAresta(grafo, "B", "C", 1);
        adicionarAresta(grafo, "B", "D", 7);
        adicionarAresta(grafo, "C", "E", 3);
        adicionarAresta(grafo, "E", "D", 2);

        // Chama o algoritmo de Dijkstra partindo do vértice A
        Map<String, Integer> distancias = dijkstra(grafo, "A");

        // Imprime os menores caminhos
        for (var entrada : distancias.entrySet()) {
            System.out.println("A -> " + entrada.getKey() + " = " + entrada.getValue());
        }
    }

    // Função que implementa o algoritmo de Dijkstra
    public static Map<String, Integer> dijkstra(Map<String, List<Grafo.Aresta>> grafo, String origem) {
        // Inicializa as distâncias com infinito
        Map<String, Integer> distancia = new HashMap<>();
        for (String vertice : grafo.keySet()) {
            distancia.put(vertice, Integer.MAX_VALUE);
        }

        // A distância da origem até ela mesma é 0
        distancia.put(origem, 0);

        // Fila de prioridade com base na menor distância
        PriorityQueue<No> fila = new PriorityQueue<>();
        fila.add(new No(origem, 0));

        while (!fila.isEmpty()) {
            No atual = fila.poll(); // Pega o vértice com menor distância

            // Para cada vizinho do vértice atual
            for (Grafo.Aresta aresta : grafo.getOrDefault(atual.nome, new ArrayList<>())) {
                int novaDist = distancia.get(atual.nome) + aresta.peso;

                // Se achou um caminho mais curto, atualiza
                if (novaDist < distancia.get(aresta.destino)) {
                    distancia.put(aresta.destino, novaDist);
                    fila.add(new No(aresta.destino, novaDist));
                }
            }
        }

        return distancia;
    }

    // Método auxiliar para montar o grafo
    private static void adicionarAresta(Map<String, List<Grafo.Aresta>> grafo, String origem, String destino, int peso) {
        grafo.putIfAbsent(origem, new ArrayList<>());
        grafo.get(origem).add(new Grafo.Aresta(destino, peso));
    }
}
