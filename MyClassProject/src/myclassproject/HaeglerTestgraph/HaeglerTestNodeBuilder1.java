package myclassproject.HaeglerTestgraph;

import java.util.List;

import com.actions.Pocket;
import com.actions.Take;
import com.storygraph.Node;
import myclassproject.mystorygraph.MyNodeBuilder;
import myclassproject.mystorygraph.MyNodeLabels;
import myclassproject.mystorygraph.MyStoryEntities;
import com.actions.SetPosition;

public class HaeglerTestNodeBuilder1 extends MyNodeBuilder {
    public HaeglerTestNodeBuilder1(List<Node> list) {
        super(list);
    }

    @Override
    public void rootActions() {
        // Set atStore node as the starting point for testing
        var node = get(MyNodeLabels.atStore.toString());
        node.clearSequence();

        // Setup actions for the atStore node for testing
        node.add(new SetPosition(MyStoryEntities.food, MyStoryEntities.store))
            .add(new Take(MyStoryEntities.dad, MyStoryEntities.food))
            .add(new Pocket(MyStoryEntities.dad, MyStoryEntities.food));
    }
}
