import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;

public class App {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        // runArbolBinario();
        runEjercicio3();
    }

    private static void runEjercicio3() {
        // Crear una instancia del árbol binario
        ArbolBinario arbolBinario = new ArbolBinario();
    
        // Definir los valores a insertar
        int[] numeros = {4, 2, 7, 1, 3, 6, 9};
    
        // Insertar los valores en el árbol
        for (int valor : numeros) {
            arbolBinario.insert(valor);
        }
    
        // Imprimir el árbol si no está vacío
        System.out.println("Árbol Binario:");
        if (arbolBinario.getRoot() != null) {
            arbolBinario.printTree();
        } else {
            System.out.println("El árbol está vacío.");
        }
    }
    
        public static void runArbolBinario() {
        ArbolBinario arbolBinario = new ArbolBinario();
        int[] values = { 40, 20, 60, 10, 30, 50, 70, 5, 15, 55 };
        for (int valor : values) {
            arbolBinario.insert(valor);
        }

        // Ejecucion recorridos
        ArbolRecorridos arbolRecorridos = new ArbolRecorridos();
        System.out.println("\nRecorrido PreOrder");
        arbolRecorridos.preOrderRecursivo(arbolBinario.getRoot());
        System.out.println("\nRecorrido InOrder");
        arbolRecorridos.inOrderRecursivo(arbolBinario.getRoot());
        System.out.println("\nRecorrido PostOrder");
        arbolRecorridos.postOrderRecursivo(arbolBinario.getRoot());
    }
}
