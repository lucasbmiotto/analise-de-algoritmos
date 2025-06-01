import java.util.*; // Importa as bibliotecas necessárias

// Classe principal com um exemplo simples de grafo
public class GrafoExemplo {
    public static void main(String[] args) {
        // Cria um grafo direcionado (true)
        Grafo grafo = new Grafo(true);

        // Adiciona algumas arestas com pesos
        grafo.adicionarAresta("A", "B", 5);   // A -> B com peso 5
        grafo.adicionarAresta("A", "C", 3);   // A -> C com peso 3
        grafo.adicionarAresta("B", "C", 2);   // B -> C com peso 2
        grafo.adicionarAresta("C", "D", 4);   // C -> D com peso 4

        // Imprime a representação do grafo
        grafo.imprimir(); // Esperado: A -> B(5), C(3) ...
    }
}
