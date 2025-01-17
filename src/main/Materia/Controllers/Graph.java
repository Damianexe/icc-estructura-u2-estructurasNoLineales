package main.Materia.Controllers;

import java.util.*;

import main.Materia.Controllers.Models.NodeG;

public class Graph {
    private List<NodeG> nodes;

    // Constructor
    public Graph() {
        this.nodes = new ArrayList<>();
    }

    //Método para agregar un nodo
    public NodeG addNode(int value) {
        NodeG newNode = new NodeG(value);
        nodes.add(newNode);
        return newNode;
    }

    //Método para agregar una arista
    public void addEdge(NodeG src, NodeG dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }

    //Método para imprimir el grafo
    public void printGraph() {
        for (NodeG nodeg : nodes){
            System.out.print("Vertice: " + nodeg.getValue() + ": " );
            for(NodeG neighbor : nodeg.getNeighbors()){
                System.out.print(neighbor.getValue() + " - ");
            }
            System.out.println();
        }
    }

    // Metodo que obtiene el recorrido en profundidad
    public void getDFS(NodeG startNode) {
    }

    // Metodo que obtiene el recorrido en profundidad
    private void getDFSUtil(NodeG node, Set<NodeG> visited) {
        
    }

    // Metodo que obtiene el recorrido en anchura
    public void getBFS(NodeG startNode) {
        
    }

    // Metodo para imprimir la matriz de adyacencia
    public void printAdjacencyMatrix() {
    }


}
