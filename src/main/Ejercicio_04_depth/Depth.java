package main.Ejercicio_04_depth;

import java.util.LinkedList;
import java.util.Queue;

import main.Materia.Controllers.Models.Node;

public class Depth {

    public static int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    private void printLevelOrder(Node root) {
    if (root == null) {
        System.out.println("El árbol está vacío.");
        return;
    }

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        int size = queue.size();
        while (size-- > 0) {
            Node current = queue.poll();
            System.out.print(current.value + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        System.out.println(); // Salto de línea después de cada nivel.
    }
}

}