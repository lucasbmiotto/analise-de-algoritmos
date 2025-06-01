// Implementação do algoritmo HeapSort em Java
public class HeapSort {

    // Função principal
    public static void main(String[] args) {
        int[] array = {9, 5, 1, 7, 3, 8};

        System.out.println("Antes do HeapSort:");
        imprimir(array);

        heapSort(array);

        System.out.println("Depois do HeapSort:");
        imprimir(array);
    }

    // Algoritmo HeapSort
    public static void heapSort(int[] array) {
        int n = array.length;

        // Monta o heap (max-heap)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extrai os elementos do heap um a um
        for (int i = n - 1; i > 0; i--) {
            // Move o maior elemento (raiz) para o final
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Reaplica o heapify na raiz (posição 0)
            heapify(array, i, 0);
        }
    }

    // Garante que o sub-árvore com raiz em i obedece as regras do heap
    public static void heapify(int[] array, int tamanho, int i) {
        int maior = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < tamanho && array[esquerda] > array[maior]) {
            maior = esquerda;
        }

        if (direita < tamanho && array[direita] > array[maior]) {
            maior = direita;
        }

        if (maior != i) {
            // Troca
            int temp = array[i];
            array[i] = array[maior];
            array[maior] = temp;

            // Recursivamente ajusta o heap
            heapify(array, tamanho, maior);
        }
    }

    // Imprime o array
    public static void imprimir(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
