package main.Ejercicio_03_listLevels;
import java.util.ArrayList;
import main.Materia.Controllers.Models.Node;
import java.util.List;

public class ListLevels {
    public void ListLevels(Node root){
        List<List<Node>> listLevels = new ArrayList<>();
        List<Node> actualLevel = new ArrayList<>();
        if (root != null){
            actualLevel.add(root);
        }
    }
    
}
