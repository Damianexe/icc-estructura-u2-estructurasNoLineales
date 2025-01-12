import main.Ejercicio_03_listLevels.ListLevels;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;

public class App {
    public static void main(String[] args) throws Exception {
        // Llamada a la función que realiza la prueba con el ejercicio 3 y la funcion que realiza los recorridos
        // runArbolBinario();
        runEjercicio3();
    }

    /**
     * Método que ejemplifica el uso del árbol binario:
     * 1. Crea una instancia de ArbolBinario.
     * 2. Inserta un conjunto de valores en el árbol.
     * 3. Imprime el árbol resultante de manera visual.
     * 4. Imprime la lista de niveles del árbol.
     */
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

        // Separador para mejorar la lectura en la consola
        System.out.println("\nNiveles del árbol:");
        
        // Imprime los niveles del árbol utilizando la clase ListLevels
        ListLevels.printLevels(arbolBinario);


        /*// Ejecucion de los tres tipos de recorridos
        ArbolRecorridos arbolRecorridos = new ArbolRecorridos();
        System.out.println("\nRecorrido PreOrder");
        arbolRecorridos.preOrderRecursivo(arbolBinario.getRoot());
        System.out.println("\nRecorrido InOrder");
        arbolRecorridos.inOrderRecursivo(arbolBinario.getRoot());
        System.out.println("\nRecorrido PostOrder");
        arbolRecorridos.postOrderRecursivo(arbolBinario.getRoot());*/
    }
}

