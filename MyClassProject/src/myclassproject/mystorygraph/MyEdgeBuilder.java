package myclassproject.mystorygraph;

import java.util.List;

import com.storygraph.BuilderMethod;
import com.storygraph.Node;
import com.storygraph.NodeBuilder;

public class MyEdgeBuilder extends NodeBuilder {
	/**
	 * Initializes the list of story graph nodes.
	 * @param list A list of all story graph nodes.
	 */
	public MyEdgeBuilder(List<Node> list) {
		super(list);
	}

	/**
	 * Write a method for each node. 
	 * Use get to get a reference to the node using its label.
	 * The method should add the edges of the node one by one. 
	 * These methods must have a BuilderMethod annotation.
	 */
	@BuilderMethod
	public void rootEdges() {
		//Example:
		//var root = get(NodeLabels.root.toString());
		//var choice = new MenuChoice(MenuChoice.Options.Start);
		//var nextNode = get(NodeLabels.atCottage.toString());
		//root.add(new Edge(choice, nextNode));
	}
	
	@BuilderMethod
	public void stayInBunkerEdges() {
		
	}
	
	@BuilderMethod
	public void leaveBunkerEdges() {
		
	}
	
	@BuilderMethod
	public void atStoreEdges() {
		
	}
	
	@BuilderMethod
	public void atHospitalEdges() {
		
	}
	
	@BuilderMethod
	public void atForestEdges() {
		
	}
	
	@BuilderMethod
	public void purpleBerriesEdges() {
		
	}
	
	@BuilderMethod
	public void redBerriesEdges() {
		
	}
	
	@BuilderMethod
	public void carInForestEdges() {
		
	}
	
	@BuilderMethod
	public void leaveStoreEdges() {
		
	}
	
	@BuilderMethod
	public void leaveHospitalEdges() {
		
	}
	
	@BuilderMethod
	public void atCoastEdges() {
		
	}
	
	@BuilderMethod
	public void stopForCarEdges() {
		
	}
	
	@BuilderMethod
	public void moreForestEdges() {
		
	}
	
	@BuilderMethod
	public void petAnimalEdges() {
		
	}
	
	@BuilderMethod
	public void OasisEdges() {
		
	}
	
	@BuilderMethod
	public void runFromAnimalEdges() {
		
	}
	
	@BuilderMethod
	public void followWaterTrailEdges() {
		
	}
}
