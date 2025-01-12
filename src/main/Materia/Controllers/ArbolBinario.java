package main.Materia.Controllers;

import main.Materia.Controllers.Models.Node;

public class ArbolBinario {

    // Variable que representa la raíz del árbol binario
    private Node root;

    /**
     * Inserta un nuevo valor en el árbol binario.
     * Este método público delega la funcionalidad al método privado insert(Node, int).
     *
     * @param value Valor entero a insertar en el árbol
     */
    public void insert(int value) {
        // Se actualiza la raíz después de insertar el nuevo valor
        root = insert(root, value);
    }

    /**
     * Inserta un nuevo valor en el árbol binario de forma recursiva.
     * - Si el nodo actual es nulo, crea un nuevo nodo con el valor.
     * - Si el valor es menor que el valor del nodo actual, va al subárbol izquierdo.
     * - Si el valor es mayor que el valor del nodo actual, va al subárbol derecho.
     * - No se insertan duplicados (si es igual, no hace nada).
     *
     * @param node  Nodo actual en la recursión
     * @param value Valor entero a insertar
     * @return      El nodo que se usará para enlazar en la posición correspondiente
     */
    private Node insert(Node node, int value) {
        // Si el nodo actual está vacío, se crea uno nuevo con el valor
        if (node == null) {
            return new Node(value);
        }

        // Si el valor es menor, se inserta en el subárbol izquierdo
        if (value < node.getValue()) {
            node.setLeft(insert(node.getLeft(), value));
        } 
        // Si el valor es mayor, se inserta en el subárbol derecho
        else if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));
        }
        // Si el valor es igual al valor del nodo actual, no se hace nada (evita duplicados)

        return node;
    }

    /**
     * Imprime el árbol binario de forma visual usando caracteres.
     * Muestra la estructura jerárquica del árbol.
     */
    public void printTree() {
        printTree(root, " ", true);
    }

    /**
     * Imprime el árbol de manera recursiva con prefijos para indicar
     * la estructura en forma de árbol.
     *
     * @param node   Nodo actual que se va a imprimir.
     * @param prefix Cadena que se usa como prefijo para representar el nivel actual.
     * @param isLeft Indica si el nodo actual es hijo izquierdo (para dibujar correctamente).
     */
    public void printTree(Node node, String prefix, boolean isLeft) {
        // Si el nodo actual no es nulo, procede a imprimirlo
        if (node != null) {
            // Imprime el prefijo y el valor del nodo.
            // Se usan caracteres especiales para simular ramas y uniones.
            System.out.println(prefix + (isLeft ? "├── " : "└──") + node.getValue());
            
            // Solo si el nodo tiene hijos, entra a imprimirlos
            if (node.getLeft() != null || node.getRight() != null) {
                
                // Imprime el subárbol izquierdo
                if (node.getLeft() != null) {
                    printTree(node.getLeft(), prefix + (isLeft ? "|  " : ""), true);
                } else {
                    // En caso de que no exista hijo izquierdo, imprime rama vacía
                    System.out.println(prefix + (isLeft ? "|  " : "") + "└──");
                }

                // Imprime el subárbol derecho
                if (node.getRight() != null) {
                    printTree(node.getRight(), prefix + (isLeft ? "|  " : ""), false);
                } else {
                    // En caso de que no exista hijo derecho, imprime rama vacía
                    System.out.println(prefix + (isLeft ? "|  " : "") + "└──");
                }
            }
        }
    }

    /**
     * Devuelve la raíz del árbol.
     * @return Nodo que representa la raíz del árbol binario.
     */
    public Node getRoot() {
        return root;
    }
}
