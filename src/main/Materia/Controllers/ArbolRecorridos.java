package main.Materia.Controllers;

import java.util.Stack;

import main.Materia.Controllers.Models.Node;

public class ArbolRecorridos {
    public void preOrderIterativo(Node root){
        //Verificar si no esta vacio
        if(root==null){
            return;
        }
        //Crear una pila que maneja los nodos del arbol
        Stack<Node> stack = new Stack<>();
        //Sacar la raiz
        stack.push(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            System.out.print(node.getValue() + ", ");

            if(node.getRight() != null){
                stack.push(node.getRight());
            }
            if(node.getLeft() != null){
                stack.push(node.getLeft());
            }
        }
        
    }

    public void preOrderRecursivo(Node node){
        if(node != null){
            //Imprimir el valor actual(centro)
            System.out.print(node.getValue() + ", ");
            //Recorrer el lado izquierdo
            preOrderRecursivo(node.getLeft());
            //Recorrer el lado derecho
            preOrderRecursivo(node.getRight());
        }        
    }

    public void inOrderRecursivo(Node node){
        if(node!= null){
            //Recorrer el lado izquierdo
            inOrderRecursivo(node.getLeft());
            //Imprimir el valor actual(centro)
            System.out.print(node.getValue() + ", ");
            //Recorrer el lado derecho
            inOrderRecursivo(node.getRight());
        }
    }

    public void postOrderRecursivo(Node node) {
        if (node != null){
            //Recorrer el lado izquierdo
            postOrderRecursivo(node.getLeft());
            //Recorrer el lado derecho
            postOrderRecursivo(node.getRight());
            //Imprimir el valor actual(centro)
            System.out.print(node.getValue() + ", ");
        }
    }
}
