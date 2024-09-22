package myclassproject.mystorygraph;

import static myclassproject.mystorygraph.MyStoryEntities.dad;
import static myclassproject.mystorygraph.MyStoryEntities.son;
import static myclassproject.mystorygraph.MyStoryEntities.stranger;
import static myclassproject.questexample.QuestStoryEntities.bandit;
import static myclassproject.questexample.QuestStoryEntities.player;
import static myclassproject.questexample.QuestStoryEntities.sword;
import static myclassproject.mystorygraph.MyStoryEntities.forest;
import static myclassproject.mystorygraph.MyStoryEntities.bunker;
import static myclassproject.mystorygraph.MyStoryEntities.hut;
import static myclassproject.mystorygraph.MyStoryEntities.store;
import static myclassproject.mystorygraph.MyStoryEntities.hospital;
import static myclassproject.mystorygraph.MyStoryEntities.city;
import static myclassproject.mystorygraph.MyStoryEntities.food;
import static myclassproject.mystorygraph.MyStoryEntities.medicine;
import static myclassproject.mystorygraph.MyStoryEntities.car;
import static myclassproject.mystorygraph.MyStoryEntities.berry;
import static myclassproject.mystorygraph.MyStoryEntities.animal;
import static myclassproject.mystorygraph.MyStoryEntities.oasis;


import java.util.List;
import com.actions.*;
import com.actions.Draw;
import com.actions.Drink;
import com.actions.EnableInput;
import com.actions.Face;
import com.actions.HideDialog;
import com.actions.HideMenu;
import com.actions.Pocket;
import com.actions.SetCameraFocus;
import com.actions.SetPosition;
import com.actions.ShowMenu;
import com.actions.Take;
import com.sequences.CreateAll;
import com.sequences.CreateCharacterSequence;
import com.sequences.DialogSequence;
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
		.add(new CreateCharacterSequence(son)).add(new SetPosition(dad, bunker))
		.add(new SetPosition(son, bunker)).add(new Face(dad, son))
		.add(new SetCameraFocus(dad)).add(new ShowMenu()).add(new DialogSequence(dad, son, List.of("Should we leave?"),
				List.of("Yes", "No")));
	}
	@BuilderMethod
	public void stayInBunkerActions() {
		var node = get(MyNodeLabels.stayInBunker.toString());
		node.add(new HideMenu()).add(new EnableInput());
		
	}
	@BuilderMethod
	public void leaveBunkerActions() {
		var node = get(MyNodeLabels.leaveBunker.toString());
		node.add(new HideDialog()).add(new SetPosition(son,forest)).add(new SetPosition(dad,forest));
	}
	@BuilderMethod
	public void atStoreActions() {
		var node = get(MyNodeLabels.atStore.toString());
		node.add(new SetPosition(food,store)).add(new Take(dad,food)).add(new Pocket(dad, food));
	}
	@BuilderMethod
	public void atHospitalActions() {
		var node = get(MyNodeLabels.atHospital.toString());
		node.add(new SetPosition(medicine,hospital)).add(new Take(dad,medicine)).add(new Pocket(dad, medicine));
	}
	@BuilderMethod
	public void atForestActions() {
		var node = get(MyNodeLabels.atForest.toString());
		node.add(new DialogSequence(dad, son, List.of("What colour berries do you want?"),
				List.of("Red", "Blue")));
	}
	@BuilderMethod
	public void purpleBerriesActions() {
		var node = get(MyNodeLabels.purpleBerries.toString());
		node.add(new SetPosition(car,forest)).add(new SetPosition(berry,forest)).add(new Drink(dad));
	}
	@BuilderMethod
	public void redBerriesActions() {
		var node = get(MyNodeLabels.redBerries.toString());
		node.add(new SetPosition(car,forest)).add(new SetPosition(berry,forest)).add(new Drink(dad));
	}
	@BuilderMethod
	public void carInForestActions() {
		var node = get(MyNodeLabels.carInForest.toString());
		node.add(new DialogSequence(dad, son, List.of("Should we stop at the car?"),
				List.of("yes", "no")));
	}
	@BuilderMethod
	public void leaveStoreActions() {
		var node = get(MyNodeLabels.leaveStore.toString());
		node.add(new DialogSequence(dad, son, List.of("Do you want to go to the coast or forest"),
				List.of("coast", "forest")));
	}
	@BuilderMethod
	public void leaveHospitalActions() {
		var node = get(MyNodeLabels.leaveHospital.toString());
		node.add(new DialogSequence(dad, son, List.of("Do you want to go to the coast or forest"),
				List.of("coast", "forest")));
	}
	@BuilderMethod
	public void atCoastActions() {
		var node = get(MyNodeLabels.atCoast.toString());
		node.add(new HideDialog()).add(new SetPosition(son,forest)).add(new SetPosition(dad,forest))
		.add(new DialogSequence(dad, son, List.of("Should we follow the water trail up?"),
				List.of("yes", "no")));
		
	}
	@BuilderMethod
	public void stopForCarActions() {
		var node = get(MyNodeLabels.stopForCar.toString());
		//node.add(new EnableEffect(dad,hurt));
		
	}
	@BuilderMethod
	public void moreForestActions() {
		var node = get(MyNodeLabels.moreForest.toString());
		node.add(new SetPosition(animal,forest))
		.add(new DialogSequence(dad, son, List.of("do we pet animal"),
				List.of("yes", "no")));
		
	}
	@BuilderMethod
	public void petAnimalActions() {
		var node = get(MyNodeLabels.petAnimal.toString());
		node.add(new WalkTo(dad,animal)).add(new Kneel(dad));
	}
	@BuilderMethod
	public void OasisActions() {
		var node = get(MyNodeLabels.Oasis.toString());
		node.add(new SetPosition(stranger,oasis)).add(new Face(dad, stranger));
		
	}
	@BuilderMethod
	public void runFromAnimalActions() {
		var node = get(MyNodeLabels.runFromAnimal.toString());
		node.add(new FadeOut()).add(new SetPosition(animal,bunker)).add(new FadeIn());
	}
	@BuilderMethod
	public void followWaterTrailActions() {
		var node = get(MyNodeLabels.followWaterTrail.toString());
		//Effect stuff son gets hurt here 
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
