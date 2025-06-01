import java.util.*;

// Fila de prioridade feita manualmente com base em um min-heap
public class FilaPrioridadeHeapManual {

    private List<Integer> heap = new ArrayList<>();

    public void inserir(int valor) {
        heap.add(valor); // adiciona no final
        subir(heap.size() - 1); // ajusta subindo
    }

    public int removerMinimo() {
        if (heap.isEmpty()) throw new IllegalStateException("Fila vazia");

        int minimo = heap.get(0);
        int ultimo = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, ultimo);
            descer(0); // ajusta descendo
        }

        return minimo;
    }

    private void subir(int i) {
        while (i > 0) {
            int pai = (i - 1) / 2;
            if (heap.get(i) >= heap.get(pai)) break;
            trocar(i, pai);
            i = pai;
        }
    }

    private void descer(int i) {
        int tamanho = heap.size();
        while (true) {
            int menor = i;
            int esq = 2 * i + 1;
            int dir = 2 * i + 2;

            if (esq < tamanho && heap.get(esq) < heap.get(menor)) menor = esq;
            if (dir < tamanho && heap.get(dir) < heap.get(menor)) menor = dir;
            if (menor == i) break;
            trocar(i, menor);
            i = menor;
        }
    }

    private void trocar(int a, int b) {
        int temp = heap.get(a);
        heap.set(a, heap.get(b));
        heap.set(b, temp);
    }

    public void imprimir() {
        System.out.println(heap);
    }

    public static void main(String[] args) {
        FilaPrioridadeHeapManual fila = new FilaPrioridadeHeapManual();
        fila.inserir(5);
        fila.inserir(2);
        fila.inserir(8);
        fila.inserir(1);
        fila.inserir(3);

        fila.imprimir();

        System.out.println("Removendo: " + fila.removerMinimo());
        fila.imprimir();
    }
}
