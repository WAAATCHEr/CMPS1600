package myclassproject.HaeglerTestgraph;

import java.util.List;

import com.playerInput.DialogChoice;
import com.storygraph.Edge;
import com.storygraph.Node;
import myclassproject.mystorygraph.MyEdgeBuilder;
import myclassproject.mystorygraph.MyNodeLabels;

public class HaeglerTestEdgeBuilder2 extends MyEdgeBuilder {
    public HaeglerTestEdgeBuilder2(List<Node> list) {
        super(list);
    }

    @Override
    public void rootEdges() {
        // Set carInForest node as the root for edges
        var node = get(MyNodeLabels.carInForest.toString());
        node.clearEdges();

        // Define edges to either stop for the car or move on
        var choice1 = new DialogChoice("Yes");
        var nextNode1 = get(MyNodeLabels.stopForCar.toString());
        node.add(new Edge(choice1, nextNode1));

        var choice2 = new DialogChoice("no");
        var nextNode2 = get(MyNodeLabels.moreForest.toString());
        node.add(new Edge(choice2, nextNode2));
    }
}
