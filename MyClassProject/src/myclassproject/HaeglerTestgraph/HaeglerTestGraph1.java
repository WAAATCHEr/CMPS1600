package myclassproject.HaeglerTestgraph;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.storygraph.NodeBuilder;
import myclassproject.HaeglerTestgraph.*;
import myclassproject.mystorygraph.MyGraph;
import myclassproject.mystorygraph.MyNodeLabels;

public class HaeglerTestGraph1 extends MyGraph {
    public HaeglerTestGraph1() {
		super((List<String>) Stream.of(MyNodeLabels.values()).map(z->z.toString()).collect(Collectors.toList()));    
    }

    @Override
    public NodeBuilder getNodeBuilder() {
        return new HaeglerTestNodeBuilder1(nodes);
    }

    @Override
    public NodeBuilder getEdgeBuilder() {
        return new HaeglerTestEdgeBuilder1(nodes);
    }
}
