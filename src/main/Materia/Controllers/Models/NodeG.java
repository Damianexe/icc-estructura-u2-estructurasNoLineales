package main.Materia.Controllers.Models;

import java.util.*;


public class NodeG {
    private int value;
    private List<NodeG> neighbors;

    //Constructor
    public NodeG(int value) {
        this.value = value;
        this.neighbors = new LinkedList<>();
    
    }

     //Getters
    public int getValue() {
        return value;
    }
    
   
    public List<NodeG> getNeighbors() {
        return neighbors;
    }
    
    //Metodo para agregar neighbors
    public void addNeighbor(NodeG neighbor) {
        neighbors.add(neighbor);
    }
    
    // ToString
    @Override
    public String toString() {
        return "NodeG [value=" + value + ", neighbors=" + neighbors + "]";
    }
    
    
    
}
