package main.Materia.Controllers;

import java.util.Stack;

import main.Materia.Controllers.Models.Node;

public class ArbolRecorridos {
    
  
    //Realiza un recorrido en preorden de forma iterativa.
    public void preOrderIterativo(Node root){
        // Verificar si el árbol no está vacío.
        if(root == null){
            return;
        }
        
        // Crear una pila para manejar los nodos.
        Stack<Node> stack = new Stack<>();
        // Insertar la raíz en la pila.
        stack.push(root);
        
        // Mientras la pila no esté vacía:
        while(!stack.isEmpty()){
            // Sacar el nodo tope de la pila.
            Node node = stack.pop();
            // Imprimir el valor del nodo actual.
            System.out.print(node.getValue() + ", ");

            // Primero se inserta el hijo derecho para que sea procesado 
            // después del izquierdo (según la lógica de preorden).
            if(node.getRight() != null){
                stack.push(node.getRight());
            }
            // Luego se inserta el hijo izquierdo para que sea procesado inmediatamente.
            if(node.getLeft() != null){
                stack.push(node.getLeft());
            }
        }
    }

    
    // Realiza un recorrido en preorden de forma recursiva.
    
    public void preOrderRecursivo(Node node){
        // Si el nodo no es nulo, se procede a mostrar el valor y a recorrer subárboles.
        if(node != null){
            // Imprimir el valor actual (nodo raíz en este subárbol).
            System.out.print(node.getValue() + ", ");
            // Recorrer el lado izquierdo del nodo.
            preOrderRecursivo(node.getLeft());
            // Recorrer el lado derecho del nodo.
            preOrderRecursivo(node.getRight());
        }        
    }

    //Realiza un recorrido en inorden de forma recursiva.
     
    public void inOrderRecursivo(Node node){
        // Si el nodo no es nulo, se recorre la rama izquierda, se imprime el valor y luego la derecha.
        if(node != null){
            // Recorrer el lado izquierdo.
            inOrderRecursivo(node.getLeft());
            // Imprimir el valor actual.
            System.out.print(node.getValue() + ", ");
            // Recorrer el lado derecho.
            inOrderRecursivo(node.getRight());
        }
    }

    
    //Realiza un recorrido en postorden de forma recursiva.
     
    public void postOrderRecursivo(Node node) {
        // Si el nodo no es nulo, se recorre la rama izquierda, luego la derecha y finalmente se imprime el valor.
        if (node != null){
            // Recorrer el lado izquierdo.
            postOrderRecursivo(node.getLeft());
            // Recorrer el lado derecho.
            postOrderRecursivo(node.getRight());
            // Imprimir el valor actual.
            System.out.print(node.getValue() + ", ");
        }
    }
}
