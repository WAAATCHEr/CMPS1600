package myclassproject.mystorygraph;

import static myclassproject.mystorygraph.MyStoryEntities.dad;
import static myclassproject.mystorygraph.MyStoryEntities.son;
import static myclassproject.mystorygraph.MyStoryEntities.stranger;
import static myclassproject.mystorygraph.MyStoryEntities.forest;
import static myclassproject.mystorygraph.MyStoryEntities.bunker;
import static myclassproject.mystorygraph.MyStoryEntities.hut;
import static myclassproject.mystorygraph.MyStoryEntities.store;
import static myclassproject.mystorygraph.MyStoryEntities.hospital;
import static myclassproject.mystorygraph.MyStoryEntities.city;
import static myclassproject.mystorygraph.MyStoryEntities.food;
import static myclassproject.mystorygraph.MyStoryEntities.medicine;

import java.util.List;

import com.actions.Draw;
import com.actions.Face;
import com.actions.SetCameraFocus;
import com.actions.SetPosition;
import com.actions.ShowMenu;
import com.sequences.CreateAll;
import com.sequences.CreateCharacterSequence;
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
		var root = get(MyNodeLabels.root.toString());
		root.add(new CreateAll(List.of(hospital, forest,bunker,city,hut,store,food,medicine))).add(new CreateCharacterSequence(dad))
		.add(new CreateCharacterSequence(son)).add(new SetPosition(dad, forest))
		.add(new SetPosition(son, forest)).add(new Face(dad, son))
		.add(new SetCameraFocus(dad)).add(new ShowMenu());
	}
	@BuilderMethod
	public void stayInBunkerActions() {
		var node = get(MyNodeLabels.stayInBunker.toString());
	}
	@BuilderMethod
	public void leaveBunkerActions() {
		var node = get(MyNodeLabels.leaveBunker.toString());
	}
	@BuilderMethod
	public void atStoreActions() {
		var node = get(MyNodeLabels.atStore.toString());
	}
	@BuilderMethod
	public void atHospitalActions() {
		var node = get(MyNodeLabels.atHospital.toString());
	}
	@BuilderMethod
	public void atForestActions() {
		var node = get(MyNodeLabels.atForest.toString());
	}
	@BuilderMethod
	public void purpleBerriesActions() {
		var node = get(MyNodeLabels.purpleBerries.toString());
	}
	@BuilderMethod
	public void redBerriesActions() {
		var node = get(MyNodeLabels.redBerries.toString());
	}
	@BuilderMethod
	public void carInForestActions() {
		var node = get(MyNodeLabels.carInForest.toString());
	}
	@BuilderMethod
	public void leaveStoreActions() {
		var node = get(MyNodeLabels.leaveStore.toString());
	}
	@BuilderMethod
	public void leaveHospitalActions() {
		var node = get(MyNodeLabels.leaveHospital.toString());
	}
	@BuilderMethod
	public void atCoastActions() {
		var node = get(MyNodeLabels.atCoast.toString());
	}
	@BuilderMethod
	public void stopForCarActions() {
		var node = get(MyNodeLabels.stopForCar.toString());
	}
	@BuilderMethod
	public void moreForestActions() {
		var node = get(MyNodeLabels.moreForest.toString());
	}
	@BuilderMethod
	public void petAnimalActions() {
		var node = get(MyNodeLabels.petAnimal.toString());
	}
	@BuilderMethod
	public void OasisActions() {
		var node = get(MyNodeLabels.Oasis.toString());
	}
	@BuilderMethod
	public void runFromAnimalActions() {
		var node = get(MyNodeLabels.runFromAnimal.toString());
	}
	@BuilderMethod
	public void stayAlongCoastActions() {
		var node = get(MyNodeLabels.stayAlongCoast.toString());
	}
	@BuilderMethod
	public void followWaterTrailActions() {
		var node = get(MyNodeLabels.followWaterTrail.toString());
	}
	@BuilderMethod
	public void catchFishActions() {
		var node = get(MyNodeLabels.catchFish.toString());
	}
	@BuilderMethod
	public void keepWalkingOnCoastActions() {
		var node = get(MyNodeLabels.keepWalkingOnCoast.toString());
	}
	@BuilderMethod
	public void seeHutActions() {
		var node = get(MyNodeLabels.seeHut.toString());
	}
	@BuilderMethod
	public void lostInForestActions() {
		var node = get(MyNodeLabels.lostInForest.toString());
	}
	@BuilderMethod
	public void safetyConversationActions() {
		var node = get(MyNodeLabels.safetyConversation.toString());
	}
	@BuilderMethod
	public void dyingPersonActions() {
		var node = get(MyNodeLabels.dyingPerson.toString());
	}
	@BuilderMethod
	public void northActions() {
		var node = get(MyNodeLabels.north.toString());
	}
	@BuilderMethod
	public void stayWithDyingPersonActions() {
		var node = get(MyNodeLabels.stayWithDyingPerson.toString());
	}
	@BuilderMethod
	public void leaveDyingPersonActions() {
		var node = get(MyNodeLabels.leaveDyingPerson.toString());
	}
	@BuilderMethod
	public void searchBodyActions() {
		var node = get(MyNodeLabels.searchBody.toString());
	}
	@BuilderMethod
	public void sitThereAndCryActions() {
		var node = get(MyNodeLabels.sitThereAndCry.toString());
	}
	@BuilderMethod
	public void afterDeathActions() {
		var node = get(MyNodeLabels.afterDeath.toString());
	}
	@BuilderMethod
	public void goWithPartyActions() {
		var node = get(MyNodeLabels.goWithParty.toString());
	}
	@BuilderMethod
	public void goAloneActions() {
		var node = get(MyNodeLabels.goAlone.toString());
	}
	@BuilderMethod
	public void complyWithPartyActions() {
		var node = get(MyNodeLabels.complyWithParty.toString());
	}
	@BuilderMethod
	public void runAwayFromPartyActions() {
		var node = get(MyNodeLabels.runAwayFromParty.toString());
	}
	@BuilderMethod
	public void southActions() {
		var node = get(MyNodeLabels.south.toString());
	}
	@BuilderMethod
	public void lastCarActions() {
		var node = get(MyNodeLabels.lastCar.toString());
	}
	@BuilderMethod
	public void dontGoToCityActions() {
		var node = get(MyNodeLabels.dontGoToCity.toString());
	}
	@BuilderMethod
	public void goToCityActions() {
		var node = get(MyNodeLabels.goToCity.toString());
	}
}
