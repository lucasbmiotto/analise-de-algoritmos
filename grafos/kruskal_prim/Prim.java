import java.util.*;

// Algoritmo de Prim para MST usando fila de prioridade (min-heap)
public class Prim {

    static class Aresta {
        String destino;
        int peso;

        public Aresta(String destino, int peso) {
            this.destino = destino;
            this.peso = peso;
        }
    }

    static class No implements Comparable<No> {
        String vertice;
        int peso;

        No(String vertice, int peso) {
            this.vertice = vertice;
            this.peso = peso;
        }

        public int compareTo(No outro) {
            return Integer.compare(this.peso, outro.peso);
        }
    }

    public static void main(String[] args) {
        Map<String, List<Aresta>> grafo = new HashMap<>();

        // Monta grafo
        adicionar(grafo, "A", "B", 1);
        adicionar(grafo, "A", "C", 4);
        adicionar(grafo, "B", "C", 2);
        adicionar(grafo, "B", "D", 5);
        adicionar(grafo, "C", "D", 1);

        // Executa Prim a partir do vértice A
        prim(grafo, "A");
    }

    static void prim(Map<String, List<Aresta>> grafo, String inicio) {
        Set<String> visitado = new HashSet<>();
        PriorityQueue<No> fila = new PriorityQueue<>();

        fila.add(new No(inicio, 0));
        int custoTotal = 0;

        while (!fila.isEmpty()) {
            No atual = fila.poll();
            if (visitado.contains(atual.vertice)) continue;

            visitado.add(atual.vertice);
            custoTotal += atual.peso;

            System.out.println("Adicionando vértice: " + atual.vertice + " (peso: " + atual.peso + ")");

            for (Aresta a : grafo.getOrDefault(atual.vertice, new ArrayList<>())) {
                if (!visitado.contains(a.destino)) {
                    fila.add(new No(a.destino, a.peso));
                }
            }
        }

        System.out.println("Custo total da MST: " + custoTotal);
    }

    static void adicionar(Map<String, List<Aresta>> grafo, String origem, String destino, int peso) {
        grafo.putIfAbsent(origem, new ArrayList<>());
        grafo.putIfAbsent(destino, new ArrayList<>());
        grafo.get(origem).add(new Aresta(destino, peso));
        grafo.get(destino).add(new Aresta(origem, peso)); // Grafo não direcionado
    }
}
