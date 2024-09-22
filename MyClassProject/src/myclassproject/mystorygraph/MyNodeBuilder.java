package myclassproject.mystorygraph;

import java.util.List;

import com.storygraph.*;

public class MyNodeBuilder extends NodeBuilder {
	public MyNodeBuilder(List<Node> list) {
		super(list);
	}

	/**
	 * Write a method for each node. 
	 * Use get to get a reference to the node using its label.
	 * The method adds Camelot actions that execute in order when visiting that node. 
	 * These methods must have a BuilderMethod annotation.
	 */
	@BuilderMethod
	public void rootActions() {
		//var root = get(NodeLabels.root.toString());
		//root.add(new CreateAll(List.of(cottage, town, sword)));
		var node = get(MyNodeLabels.root.toString());
	}
	public void stayInBunkerActions() {
		var node = get(MyNodeLabels.stayInBunker.toString());
	}
	public void leaveBunkerActions() {
		var node = get(MyNodeLabels.leaveBunker.toString());
	}
	public void atStoreActions() {
		var node = get(MyNodeLabels.atStore.toString());
	}
	public void atHospitalActions() {
		var node = get(MyNodeLabels.atHospital.toString());
	}
	public void atForestActions() {
		var node = get(MyNodeLabels.atForest.toString());
	}
	public void purpleBerriesActions() {
		var node = get(MyNodeLabels.purpleBerries.toString());
	}
	public void redBerriesActions() {
		var node = get(MyNodeLabels.redBerries.toString());
	}
	public void carInForestActions() {
		var node = get(MyNodeLabels.carInForest.toString());
	}
	public void leaveStoreActions() {
		var node = get(MyNodeLabels.leaveStore.toString());
	}
	public void leaveHospitalActions() {
		var node = get(MyNodeLabels.leaveHospital.toString());
	}
	public void atCoastActions() {
		var node = get(MyNodeLabels.atCoast.toString());
	}
	public void stopForCarActions() {
		var node = get(MyNodeLabels.stopForCar.toString());
	}
	public void moreForestActions() {
		var node = get(MyNodeLabels.moreForest.toString());
	}
	public void petAnimalActions() {
		var node = get(MyNodeLabels.petAnimal.toString());
	}
	public void OasisActions() {
		var node = get(MyNodeLabels.Oasis.toString());
	}
	public void runFromAnimalActions() {
		var node = get(MyNodeLabels.runFromAnimal.toString());
	}
	public void stayAlongCoastActions() {
		var node = get(MyNodeLabels.stayAlongCoast.toString());
	}
	public void followWaterTrailActions() {
		var node = get(MyNodeLabels.followWaterTrail.toString());
	}
	public void catchFishActions() {
		var node = get(MyNodeLabels.catchFish.toString());
	}
	public void keepWalkingOnCoastActions() {
		var node = get(MyNodeLabels.keepWalkingOnCoast.toString());
	}
	public void seeHutActions() {
		var node = get(MyNodeLabels.seeHut.toString());
	}
	public void lostInForestActions() {
		var node = get(MyNodeLabels.lostInForest.toString());
	}
	public void safetyConversationActions() {
		var root = get(MyNodeLabels.
	}
	public void dyingPersonActionsActions() {
		var root = get(MyNodeLabels.
	}
	public void northActions() {
		var root = get(MyNodeLabels.
	}
	public void stayWithDyingPersonActions() {
		var root = get(MyNodeLabels.
	}
	public void leaveDyingPersonActions() {
		var root = get(MyNodeLabels.
	}
	public void searchBodyActions() {
		var root = get(MyNodeLabels.
	}
	public void sitThereAndCryActions() {
		var root = get(MyNodeLabels.
	}
	public void afterDeathActions() {
		var root = get(MyNodeLabels.
	}
	public void goWithPartyActions() {
		var root = get(MyNodeLabels.
	}
	public void goAloneActions() {
		var root = get(MyNodeLabels.
	}
	public void complyWithPartyActions() {
		var root = get(MyNodeLabels.
	}
	public void runAwayFromPartyActions() {
		var root = get(MyNodeLabels.
	}
	public void southActions() {
		var root = get(MyNodeLabels.
	}
	public void lastCarActions() {
		var root = get(MyNodeLabels.
	}
	public void dontGoToCityActions() {
		var root = get(MyNodeLabels.
	}
	public void goToCityActions() {
		var root = get(MyNodeLabels.
	}
}
