package main.Ejercicio_03_listLevels;

import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.Models.Node;

import java.util.*;

public class ListLevels {
    public static void printLevels(ArbolBinario arbolBinario) {
        // Obtener raíz del árbol
        Node root = arbolBinario.getRoot();
        if (root == null) {
            System.out.println("El árbol está vacío.");
            return;
        }

        // Inicializa la cola para el recorrido por niveles
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        // Recorre los niveles del árbol
        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Número de nodos en el nivel actual
            List<Integer> currentLevel = new ArrayList<>();

            // Procesa todos los nodos del nivel actual
            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll(); // Obtiene el nodo de la cola

                // Agrega el valor del nodo a la lista del nivel actual
                currentLevel.add(currentNode.getValue());

                // Agrega los hijos del nodo actual a la cola
                if (currentNode.getLeft() != null) {
                    queue.add(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
            }

            // Imprime los valores del nivel actual
            System.out.println(String.join(", ", 
                currentLevel.stream().map(String::valueOf).toArray(String[]::new)));
        }
    }
}
