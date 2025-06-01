import java.util.*;

// Classe principal que executa o algoritmo de Bellman-Ford
public class BellmanFord {

    // Classe que representa uma aresta (origem -> destino com certo peso)
    static class Aresta {
        String origem;
        String destino;
        int peso;

        Aresta(String origem, String destino, int peso) {
            this.origem = origem;
            this.destino = destino;
            this.peso = peso;
        }
    }

    public static void main(String[] args) {
        // Lista de vértices
        List<String> vertices = Arrays.asList("A", "B", "C", "D");

        // Lista de arestas do grafo
        List<Aresta> arestas = new ArrayList<>();
        arestas.add(new Aresta("A", "B", 1));
        arestas.add(new Aresta("B", "C", 3));
        arestas.add(new Aresta("A", "C", 10));
        arestas.add(new Aresta("C", "D", 2));
        arestas.add(new Aresta("D", "B", -6)); // Exemplo com peso negativo

        // Escolhe vértice de origem
        String origem = "A";

        // Dicionário para armazenar as distâncias mínimas (inicialmente infinito)
        Map<String, Integer> distancia = new HashMap<>();
        for (String v : vertices) {
            distancia.put(v, Integer.MAX_VALUE);
        }

        // A distância da origem pra ela mesma é 0
        distancia.put(origem, 0);

        // Relaxa todas as arestas |V| - 1 vezes (a parte central do Bellman-Ford)
        for (int i = 1; i < vertices.size(); i++) {
            for (Aresta a : arestas) {
                if (distancia.get(a.origem) != Integer.MAX_VALUE &&
                    distancia.get(a.origem) + a.peso < distancia.get(a.destino)) {

                    // Atualiza a menor distância conhecida até agora
                    distancia.put(a.destino, distancia.get(a.origem) + a.peso);
                }
            }
        }

        // Verificação de ciclos de peso negativo
        boolean temCicloNegativo = false;
        for (Aresta a : arestas) {
            if (distancia.get(a.origem) != Integer.MAX_VALUE &&
                distancia.get(a.origem) + a.peso < distancia.get(a.destino)) {
                temCicloNegativo = true;
                break;
            }
        }

        // Resultado final
        if (temCicloNegativo) {
            System.out.println("O grafo contém ciclo de peso negativo!");
        } else {
            System.out.println("Distâncias mínimas a partir do vértice " + origem + ":");
            for (String v : vertices) {
                System.out.println(origem + " -> " + v + " = " + distancia.get(v));
