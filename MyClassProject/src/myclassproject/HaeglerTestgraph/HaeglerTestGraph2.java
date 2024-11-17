package myclassproject.HaeglerTestgraph;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.storygraph.Graph;
import com.storygraph.NodeBuilder;
import myclassproject.mystorygraph.MyGraph;
import myclassproject.mystorygraph.MyNodeLabels;

public class HaeglerTestGraph2 extends MyGraph {
    public HaeglerTestGraph2() {
		super(Stream.of(MyNodeLabels.values()).map(z->z.toString()).collect(Collectors.toList()));    
    }

    @Override
    public NodeBuilder getNodeBuilder() {
        return new HaeglerTestNodeBuilder2(nodes);
    }

    @Override
    public NodeBuilder getEdgeBuilder() {
        return new HaeglerTestEdgeBuilder2(nodes);
    }
}
