package net.ensan.codest.experiment.graph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphSearch {

    public void scanGraphBreathFirstSearch(Node root) {
        Queue<Node> queue = new LinkedList<>();
        root.setVisited(true);
        queue.add(root);
        while (!queue.isEmpty()) {
            Node r = queue.poll();
            visit(r);
            if (r.getChildren() != null) {
                for (Node n: r.getChildren()) {
                    if (!n.isVisited()) {
                        n.setVisited(true);
                        queue.add(n);
                    }
                }
            }
        }
    }

    public void scanGraphDepthFirstSearch(Node root) {
        root.setVisited(true);
        visit(root);
        if (root.getChildren() != null) {
            for (Node r: root.getChildren()) {
                if (!r.isVisited()) {
                    scanGraphDepthFirstSearch(r);
                }
            }
        }
    }

    private void visit(Node node) {
        System.out.println(node.getName());
    }
}
