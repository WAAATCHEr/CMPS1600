package myclassproject.mystorygraph;

import static myclassproject.questexample.QuestStoryEntities.bandit;

import java.util.List;

import com.playerInput.CloseNarrationChoice;
import com.playerInput.DialogChoice;
import com.playerInput.MenuChoice;
import com.playerInput.PlayerInteraction;
import com.playerInput.PlayerInteraction.Icons;
import com.storygraph.BuilderMethod;
import com.storygraph.Edge;
import com.storygraph.Node;
import com.storygraph.NodeBuilder;

import myclassproject.questexample.ChoiceLabels;

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
	        var root = get(MyNodeLabels.root.toString());
	        var choice = new MenuChoice(MenuChoice.Options.Start);
	        var nextNode1 = get(MyNodeLabels.stayInBunker.toString());
	        var nextNode2 = get(MyNodeLabels.leaveBunker.toString());
	        root.add(new Edge(choice, nextNode1));
	    }


	    @BuilderMethod
	    public void stayinbunkerEdges() {
	        var node = get(MyNodeLabels.stayInBunker.toString());
	        var choice1 = new DialogChoice("Yes");
	        var nextNode1 = get(MyNodeLabels.atStore.toString()); 
	        node.add(new Edge(choice1, nextNode1));
	        var choice2 = new DialogChoice("No");
	        var nextNode2 = get(MyNodeLabels.atHospital.toString());
	        node.add(new Edge(choice2, nextNode2));
	    }

	    @BuilderMethod
	    public void leavebunkerEdges() {
	        var node = get(MyNodeLabels.leaveBunker.toString());
	        var choice1 = new DialogChoice("Coast!");
	        var nextNode1 = get(MyNodeLabels.atCoast.toString()); 
	        node.add(new Edge(choice1, nextNode1));
	        var nextNode2 = get(MyNodeLabels.atForest.toString());
	        var choice2 = new DialogChoice("Forest!");
	        node.add(new Edge(choice2, nextNode2));
	    }

	    @BuilderMethod
	    public void atstoreEdges() {
	        var node = get(MyNodeLabels.atStore.toString());
	        var choice = new CloseNarrationChoice();
	        var nextNode = get(MyNodeLabels.leaveStore.toString());  
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void athospitalEdges() {
	        var node = get(MyNodeLabels.atHospital.toString());
	        var choice = new CloseNarrationChoice();
	        var nextNode = get(MyNodeLabels.leaveHospital.toString());  
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void atforestEdges() {
	        var node = get(MyNodeLabels.atForest.toString());
	        var choice1 = new DialogChoice("Red Berries!");
	        var nextNode1 = get(MyNodeLabels.redBerries.toString());  
	        node.add(new Edge(choice1, nextNode1));
	        var choice2 = new DialogChoice("Purple Berries!");
	        var nextNode2 = get(MyNodeLabels.purpleBerries.toString());
	        node.add(new Edge(choice2,nextNode2));
	        
	    }

	    @BuilderMethod
	    public void purpleberriesEdges() {
	        var node = get(MyNodeLabels.purpleBerries.toString());
	        var choice = new CloseNarrationChoice();
	        var nextNode = get(MyNodeLabels.carInForest.toString());  
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void redberriesEdges() {
	        var node = get(MyNodeLabels.redBerries.toString());
	        var choice = new CloseNarrationChoice();
	        var nextNode = get(MyNodeLabels.carInForest.toString()); 
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void carinforestEdges() {
	        var node = get(MyNodeLabels.carInForest.toString());
	        var choice1 = new DialogChoice("Yes");
	        var nextNode1 = get(MyNodeLabels.stopForCar.toString());  
	        node.add(new Edge(choice1, nextNode1));
	        var choice2 = new DialogChoice("no");
	        var nextNode2 = get(MyNodeLabels.moreForest.toString());
	        node.add(new Edge(choice2,nextNode2));
	    }

	    @BuilderMethod
	    public void leavestoreEdges() {
	        var node = get(MyNodeLabels.leaveStore.toString());
	        var choice1 = new DialogChoice("Coast");
	        var nextNode1 = get(MyNodeLabels.atCoast.toString());   
	        node.add(new Edge(choice1,nextNode1));
	        var choice2 = new DialogChoice("Forest");
	        var nextNode2 = get(MyNodeLabels.atForest.toString());
	        node.add(new Edge(choice2, nextNode2));
	    }

	    @BuilderMethod
	    public void leavehospitalEdges() {
	        var node = get(MyNodeLabels.leaveHospital.toString());
	        var choice1 = new DialogChoice("Coast");
	        var nextNode1 = get(MyNodeLabels.atCoast.toString());   
	        node.add(new Edge(choice1,nextNode1));
	        var choice2 = new DialogChoice("Forest");
	        var nextNode2 = get(MyNodeLabels.atForest.toString());
	        node.add(new Edge(choice2, nextNode2));
	    }

	    @BuilderMethod
	    public void atcoastEdges() {
	        var node = get(MyNodeLabels.atCoast.toString());
	        var choice1 = new DialogChoice("Lets Follow It!");
	        var nextNode1 = get(MyNodeLabels.followWaterTrail.toString());  
	        node.add(new Edge(choice1, nextNode1));
	        var choice2 = new DialogChoice("Lets Stay!");
	        var nextNode2 = get(MyNodeLabels.seeHut.toString());
	        node.add(new Edge(choice2, nextNode2));
	    }

	    @BuilderMethod
	    public void stopforcarEdges() {
	        var node = get(MyNodeLabels.stopForCar.toString());
	        var choice = new CloseNarrationChoice();
	        var nextNode = get(MyNodeLabels.moreForest.toString());  
	        node.add(new Edge(choice, nextNode));
	    }

	    @BuilderMethod
	    public void moreforestEdges() {
	        var node = get(MyNodeLabels.moreForest.toString());
	        var choice1 = new DialogChoice("RUNNN!");
	        var nextNode1 = get(MyNodeLabels.runFromAnimal.toString()); 
	        node.add(new Edge(choice1, nextNode1));
	        var choice2 = new DialogChoice("Lets Pet it!");
	        var nextNode2 = get(MyNodeLabels.petAnimal.toString());
	        node.add(new Edge(choice2,nextNode2));
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
