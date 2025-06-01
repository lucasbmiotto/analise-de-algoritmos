import java.util.PriorityQueue;

// Fila de prioridade usando API padrão do Java
public class FilaPrioridadeJavaAPI {
    public static void main(String[] args) {
        // PriorityQueue padrão do Java é min-heap por default
        PriorityQueue<Integer> fila = new PriorityQueue<>();

        fila.add(5);
        fila.add(2);
        fila.add(8);
        fila.add(1);
        fila.add(3);

        System.out.println("Fila: " + fila);

        System.out.println("Removendo menor: " + fila.poll()); // remove menor
        System.out.println("Fila atual: " + fila);
    }
}
