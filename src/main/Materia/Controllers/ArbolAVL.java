package main.Materia.Controllers;

import main.Materia.Controllers.Models.Node;

public class ArbolAVL {
    private Node root;

    public void insert(int value) {
        System.out.println("Nodo a insertar : " + value);
        System.out.println("Nodo insertado : " + value  +  " Balance :  " + getBalance(root));
        System.out.println("Nodo Actual : " + value );
        System.out.println("Altura del nodo : " + height(root));
        System.out.println("Equilibrio del nodo " + getBalance(root));
        root = insert(root, value);
        printTree();
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            Node newNode = new Node(value);
            newNode.setHeight(1);
            return newNode;
        }
        if (value < node.getValue()) {
            node.setLeft(insert(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));
        } else {
            return node;
        }
        node.setHeight(1 + Math.max(height(node.getLeft()), height(node.getRight())));
        // Obtener el blance o FE del nodo ancestro
        int balance = getBalance(node);
        // Caso izquierda izquierda
        if (balance > 1 && value < node.getLeft().getValue()) {
            return rightRotate(node);
        }
        // Caso derecha derecha
        if (balance < -1 && value > node.getRight().getValue()) {
            return leftRotate(node);
        }
        // Caso izquierda derecha
        if (balance > 1 && value > node.getLeft().getValue()) {
            node.setLeft(leftRotate(node.getLeft()));
            return rightRotate(node);
        }
        // Caso derecha izquierda
        if (balance < -1 && value < node.getRight().getValue()) {
            node.setRight(rightRotate(node.getRight()));
            return leftRotate(node);
        }
        // Devolver el nodo sin cambios
        return node;
    }

    // Rotacion a la derecha
    private Node rightRotate(Node y) {
        Node x = y.getLeft();
        Node temp = x.getRight();
        System.out.println("Rotacion a la derecha del nodo" + y.getValue());
        // Realizar la rotacion
        x.setRight(y);
        y.setLeft(temp);
        // Actualizar las alturas
        y.setHeight(Math.max(height(y.getLeft()), height(y.getRight()))+1);
        x.setHeight(Math.max(height(x.getLeft()), height(x.getRight()))+1);
        //Imprimir info despues de rotacion
        System.out.println("Nueva raiz despues de rotacion: " + x.getValue());
        // Devolver la nueva raiz
        return x;

    }
    //Rotacion a la izquierda
    private Node leftRotate(Node x) {
        Node y = x.getRight();
        Node temp= y.getLeft();
        System.out.println("Rotacion a la izquierda del nodo:  "  + x.getValue() + " , Balance: "+ getBalance(x));
        // Realizar la rotacion
        y.setLeft(x);
        x.setRight(temp);
        // Actualizar las alturas
        x.setHeight(Math.max(height(x.getLeft()),height (x.getRight()))+1);
        y.setHeight(Math.max(height(y.getLeft()),height(y.getRight()))+1);
        System.out.println("Nueva raiz despues de rotacion: " + y.getValue());
        //Devolver la nueva raiz
        return y;
    }
    //Metodo para obtener la altura de un nodo
    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.getHeight();
    }

    // Metodo para obtener el balance o FE de un nodo
    private int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return height(node.getLeft()) - height(node.getRight());
    }

    public void printTree() {
        printTree(root, " ", true);
    }

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

    public Node getRoot() {
        return root;
    }
}
