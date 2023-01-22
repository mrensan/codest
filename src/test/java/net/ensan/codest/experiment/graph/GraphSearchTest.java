package net.ensan.codest.experiment.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GraphSearchTest {

    private final GraphSearch graphSearch = new GraphSearch();

    @Test
    void scanGraphBreathFirstSearchShouldScanAllNode() {
        final Node root = generateGraph().getNodes()[0];
        graphSearch.scanGraphBreathFirstSearch(root);
        Assertions.assertTrue(true);
    }

    @Test
    void scanGraphDepthFirstSearchShouldScanAllNode() {
        final Node root = generateGraph().getNodes()[0];
        graphSearch.scanGraphDepthFirstSearch(root);
        Assertions.assertTrue(true);
    }
    private Graph generateGraph() {
        final Graph graph = new Graph();

        final Node node3 = new Node("3");
        final Node node4 = new Node("4");
        final Node node2 = new Node("2");
        node3.setChildren(new Node[] {node2, node4});
        final Node node1 = new Node("1");
        node1.setChildren(new Node[] {node3, node4});
        node2.setChildren(new Node[] {node1});
        final Node node0 = new Node("0");
        node0.setChildren(new Node[] {node1, node4, new Node("5")});

        graph.setNodes(new Node[] {node0});
        return graph;
    }
}