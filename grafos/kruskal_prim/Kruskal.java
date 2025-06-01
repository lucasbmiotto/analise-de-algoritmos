import java.util.*;

// Algoritmo de Kruskal para achar a árvore geradora mínima (MST)
public class Kruskal {

    // Classe que representa uma aresta com origem, destino e peso
    static class Aresta implements Comparable<Aresta> {
        String origem, destino;
        int peso;

        public Aresta(String origem, String destino, int peso) {
            this.origem = origem;
            this.destino = destino;
            this.peso = peso;
        }

        // Compara arestas pelo peso (ordem crescente)
        public int compareTo(Aresta outra) {
            return Integer.compare(this.peso, outra.peso);
        }
    }

    // Mapa pra manter o conjunto (Union-Find com Path Compression)
    static class UnionFind {
        Map<String, String> pai = new HashMap<>();
        Map<String, Integer> rank = new HashMap<>();

        // Inicializa cada vértice como seu próprio pai
        void makeSet(Set<String> vertices) {
            for (String v : vertices) {
                pai.put(v, v);
                rank.put(v, 0);
            }
        }

        // Encontra o pai com path compression
        String find(String v) {
            if (!pai.get(v).equals(v)) {
                pai.put(v, find(pai.get(v)));
            }
            return pai.get(v);
        }

        // Une dois conjuntos com Union by Rank
        void union(String a, String b) {
            String raizA = find(a);
            String raizB = find(b);

            if (raizA.equals(raizB)) return;

            if (rank.get(raizA) < rank.get(raizB)) {
                pai.put(raizA, raizB);
            } else if (rank.get(raizA) > rank.get(raizB)) {
                pai.put(raizB, raizA);
            } else {
                pai.put(raizB, raizA);
                rank.put(raizA, rank.get(raizA) + 1);
            }
        }
    }

    public static void main(String[] args) {
        // Lista de arestas do grafo
        List<Aresta> arestas = new ArrayList<>();
        arestas.add(new Aresta("A", "B", 1));
        arestas.add(new Aresta("A", "C", 4));
        arestas.add(new Aresta("B", "C", 2));
        arestas.add(new Aresta("B", "D", 5));
        arestas.add(new Aresta("C", "D", 1));

        // Coleta os vértices únicos
        Set<String> vertices = new HashSet<>();
        for (Aresta a : arestas) {
            vertices.add(a.origem);
            vertices.add(a.destino);
        }

        // Ordena as arestas por peso
        Collections.sort(arestas);

        // Inicializa Union-Find
        UnionFind uf = new UnionFind();
        uf.makeSet(vertices);

        List<Aresta> mst = new ArrayList<>();

        // Executa Kruskal
        for (Aresta a : arestas) {
            if (!uf.find(a.origem).equals(uf.find(a.destino))) {
                mst.add(a);
                uf.union(a.origem, a.destino);
            }
        }

        // Exibe resultado
        System.out.println("Arestas da Árvore Geradora Mínima:");
        for (Aresta a : mst) {
            System.out.println(a.origem + " - " + a.destino + " (" + a.peso + ")");
        }
    }
}
