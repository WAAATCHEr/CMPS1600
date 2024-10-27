package myclassproject.mystorygraph;

import java.util.List;

import com.playerInput.MenuChoice;
import com.storygraph.BuilderMethod;
import com.storygraph.Edge;
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
	//@BuilderMethod
	//public void rootEdges() {
		//Example:
		//var root = get(NodeLabels.root.toString());
		//var choice = new MenuChoice(MenuChoice.Options.Start);
		//var nextNode = get(NodeLabels.atCottage.toString());
		//root.add(new Edge(choice, nextNode));
	//}
	
	   @BuilderMethod
	    public void rootEdges() {
	        var root = get("root");
	        var choice = new MenuChoice(MenuChoice.Options.Start);
	        var nextNode = get("atCottage");
	        root.add(new Edge(choice, nextNode));
	    }

	    // Automatically generated edge methods for each node label


	    @BuilderMethod
	    public void stayinbunkerEdges() {
	        var node = get("stayinbunker");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void leavebunkerEdges() {
	        var node = get("leavebunker");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void atstoreEdges() {
	        var node = get("atstore");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void athospitalEdges() {
	        var node = get("athospital");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void atforestEdges() {
	        var node = get("atforest");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void purpleberriesEdges() {
	        var node = get("purpleberries");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void redberriesEdges() {
	        var node = get("redberries");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void carinforestEdges() {
	        var node = get("carinforest");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void leavestoreEdges() {
	        var node = get("leavestore");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void leavehospitalEdges() {
	        var node = get("leavehospital");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void atcoastEdges() {
	        var node = get("atcoast");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void stopforcarEdges() {
	        var node = get("stopforcar");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void moreforestEdges() {
	        var node = get("moreforest");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void petanimalEdges() {
	        var node = get("petanimal");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void oasisEdges() {
	        var node = get("oasis");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void runfromanimalEdges() {
	        var node = get("runfromanimal");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void followwatertrailEdges() {
	        var node = get("followwatertrail");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void seehutEdges() {
	        var node = get("seehut");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void lostinforestEdges() {
	        var node = get("lostinforest");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void safetyconversationEdges() {
	        var node = get("safetyconversation");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void dyingpersonEdges() {
	        var node = get("dyingperson");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void northEdges() {
	        var node = get("north");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void staywithdyingpersonEdges() {
	        var node = get("staywithdyingperson");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void leavedyingpersonEdges() {
	        var node = get("leavedyingperson");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void searchbodyEdges() {
	        var node = get("searchbody");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void sitthereandcryEdges() {
	        var node = get("sitthereandcry");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void afterdeathEdges() {
	        var node = get("afterdeath");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void gowithpartyEdges() {
	        var node = get("gowithparty");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void goaloneEdges() {
	        var node = get("goalone");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void complywithpartyEdges() {
	        var node = get("complywithparty");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void runawayfrompartyEdges() {
	        var node = get("runawayfromparty");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void southEdges() {
	        var node = get("south");
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void lastcarEdges() {
	        var node = get("lastcar");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void dontgotocityEdges() {
	        var node = get("dontgotocity");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void gotocityEdges() {
	        var node = get("gotocity");
	        var choice = new MenuChoice(MenuChoice.Options.Choose);
	        var nextNode = get("someNextNode");  // Specify appropriate next node based on game logic
	        node.add(new Edge(choice, nextNode));
	    }
}
