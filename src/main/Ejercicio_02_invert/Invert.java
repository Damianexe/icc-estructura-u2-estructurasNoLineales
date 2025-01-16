package main.Ejercicio_02_invert;
import main.Materia.Controllers.Models.Node;

public class Invert {

   
    public static Node invertTree(Node root) {
        if (root == null) {
            return null;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

       
        invertTree(root.left);
        invertTree(root.right);

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
