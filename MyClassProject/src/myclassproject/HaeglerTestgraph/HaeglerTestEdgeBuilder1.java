package myclassproject.HaeglerTestgraph;

import java.util.List;

import com.playerInput.CloseNarrationChoice;
import com.storygraph.Edge;
import com.storygraph.Node;
import myclassproject.mystorygraph.MyEdgeBuilder;
import myclassproject.mystorygraph.MyNodeLabels;

public class HaeglerTestEdgeBuilder1 extends MyEdgeBuilder {
    public HaeglerTestEdgeBuilder1(List<Node> list) {
        super(list);
    }

    @Override
    public void rootEdges() {
        // Set atStore node as the root for edges
        var node = get(MyNodeLabels.atStore.toString());
        node.clearEdges();

        // Define the edge to leaveStore
        var choice = new CloseNarrationChoice();
        var nextNode = get(MyNodeLabels.leaveStore.toString());
        node.add(new Edge(choice, nextNode));
    }
}
