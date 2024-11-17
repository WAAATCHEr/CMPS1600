package myclassproject.HaeglerTestgraph;

import java.util.List;

import com.sequences.DialogSequence;
import com.storygraph.Node;
import myclassproject.mystorygraph.MyNodeBuilder;
import myclassproject.mystorygraph.MyNodeLabels;
import myclassproject.mystorygraph.MyStoryEntities;
import com.actions.SetPosition;

public class HaeglerTestNodeBuilder2 extends MyNodeBuilder {
    public HaeglerTestNodeBuilder2(List<Node> list) {
        super(list);
    }

    @Override
    public void rootActions() {
        // Set carInForest node as the starting point for testing
        var node = get(MyNodeLabels.carInForest.toString());
        node.clearSequence();

        // Add any necessary actions at the carInForest node
        node.add(new SetPosition(MyStoryEntities.car, MyStoryEntities.forest))
            .add(new DialogSequence(MyStoryEntities.dad, MyStoryEntities.son, List.of("Should we stop at the car?"), List.of("yes", "no")));
    }
}
