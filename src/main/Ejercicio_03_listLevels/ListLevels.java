package main.Ejercicio_03_listLevels;

import main.Materia.Controllers.Models.Node;
import java.util.*;

public class ListLevels {

   
    public static List<LinkedList<Integer>> listLevels(Node root) {
        List<LinkedList<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> levelList = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                levelList.add(current.value);

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            result.add(levelList);
        }

        return result;
    }

    public static void printLevels(List<LinkedList<Integer>> levels) {
        for (LinkedList<Integer> level : levels) {
            Iterator<Integer> iterator = level.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next());
                if (iterator.hasNext()) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }
}
