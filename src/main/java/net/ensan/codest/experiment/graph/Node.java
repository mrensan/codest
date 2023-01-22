package net.ensan.codest.experiment.graph;

public class Node {
    private String name;

    private boolean visited;

    private Node[] children;

    public Node(String name, boolean visited) {
        this.name = name;
        this.visited = visited;
    }

    public Node(String name) {
        this.name = name;
    }

    public Node() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Node[] getChildren() {
        return children;
    }

    public void setChildren(Node[] children) {
        this.children = children;
    }
}
