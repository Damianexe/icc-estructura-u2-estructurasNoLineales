import main.Ejercicio_01_insert.Insert;
import main.Ejercicio_02_invert.Invert;
import main.Ejercicio_03_listLevels.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Controllers.ArbolAVL;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Controllers.Models.Node;


public class App {
    public static void main(String[] args){
        // Llamada a la función que realiza la prueba con el ejercicio 3 y la funcion
        // que realiza los recorridos
        // runArbolBinario();
        // runArbolAVL();
        App app = new App();
        app.runEjercicio1();
        app.runEjercicio2();
        app.runEjercicio3();
        app.runEjercicio4();
    }

    private void runEjercicio1() {
        Node root = null;
        int[] values = {5, 3, 7, 2, 4, 6, 8 };
        for (int value : values) {
            root = Insert.insert(root, value);
        }
        System.out.println("Árbol Binario BST:");
        Insert.printLevelOrder(root);

    }

    private void runEjercicio2() {
        Node root = null;
        int[] values = {4, 2, 7, 1, 3, 6, 9 };
        for (int value : values) {
            root = Insert.insert(root, value);
        }

        System.out.println("\nArbol Original:");
        Invert.printLevelOrder(root);

        System.out.println("\nInvirtiendo el árbol...");
        root = Invert.invertTree(root);

        System.out.println("Árbol invertido:");
        Invert.printLevelOrder(root);


    }

    private void runEjercicio3() {
        Node root = null;
        int[] values = {4, 2, 7, 1, 3, 6, 9 };
        for (int value : values) {
            root = Insert.insert(root, value);
        }

        System.out.println("\nArbol Original:");
        Invert.printLevelOrder(root);

        System.out.println("\nListando niveles del arbol...");
        ListLevels.printLevels(ListLevels.listLevels(root));
        /**
         * Método que ejemplifica el uso del árbol binario:
         * 1. Crea una instancia de ArbolBinario.
         * 2. Inserta un conjunto de valores en el árbol.
         * 3. Imprime el árbol resultante de manera visual.
         * 4. Imprime la lista de niveles del árbol.
         */
        /*
         * // Ejecucion de los tres tipos de recorridos
         * ArbolRecorridos arbolRecorridos = new ArbolRecorridos();
         * System.out.println("\nRecorrido PreOrder");
         * arbolRecorridos.preOrderRecursivo(arbolBinario.getRoot());
         * System.out.println("\nRecorrido InOrder");
         * arbolRecorridos.inOrderRecursivo(arbolBinario.getRoot());
         * System.out.println("\nRecorrido PostOrder");
         * arbolRecorridos.postOrderRecursivo(arbolBinario.getRoot());
         */
    }

    private void runEjercicio4() {
        Node root = null;
        int[] values = {4, 2, 7, 1, 3, 6 , 9};
        
        for (int value : values) {
            root = Insert.insert(root, value);
        }

        
        System.out.println("\nCalcular la profundidad máxima del árbol...");
        int depth = Depth.maxDepth(root);
        System.out.println("Profundidad máxima del árbol:");
        System.out.println(depth);

    }
    /*
     * private static void runArbolAVL(){
     * ArbolAVL arbolAVL = new ArbolAVL();
     * 
     * int[] values = {10,20,15,24,9,8,21,23,50,25};
     * 
     * for (int valor : values) {
     * arbolAVL.insert(valor);
     * }
     * }
     */
}
