package main.Ejercicio_01_insert;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.Models.Node;

public class Insert {

   
    public static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    
    public static void printTree(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.value + " ");
        } else if (level > 1) {
            printTree(root.left, level - 1);
            printTree(root.right, level - 1);
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void printLevelOrder(Node root) {
        int height = height(root);
        for (int i = 1; i <= height; i++) {
            printTree(root, i);
            System.out.println();
        }
    }
}
