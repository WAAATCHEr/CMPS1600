package myclassproject.mystorygraph;

import static myclassproject.mystorygraph.MyStoryEntities.*;
/*import static myclassproject.mystorygraph.MyStoryEntities.dad;
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
import static myclassproject.mystorygraph.MyStoryEntities.dungeon;*/



import java.util.List;
import com.actions.*;
/*import com.actions.Draw;
import com.actions.Drink;
import com.actions.EnableInput;
import com.actions.Face;
import com.actions.HideDialog;
import com.actions.HideMenu;
import com.actions.Pocket;
import com.actions.SetCameraFocus;
import com.actions.SetPosition;
import com.actions.ShowMenu;
import com.actions.Take;*/
import com.sequences.*;
/* import com.sequences.CreateAll;
import com.sequences.CreateCharacterSequence;
import com.sequences.DialogSequence;
import com.sequences.NarrationSequence; */
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
		node.add(new HideMenu()).add(new HideDialog())
		.add(new EnableInput());
		
	}
	@BuilderMethod
	public void leaveBunkerActions() {
		var node = get(MyNodeLabels.leaveBunker.toString());
		node.add(new HideMenu()).add(new HideDialog())
		.add(new SetPosition(son,forest)).add(new SetPosition(dad,forest));
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
		node.add(new HideDialog()).add(new SetPosition(berry,forest)).add(new Drink(dad))
		.add(new NarrationSequence("Luckily, you feel perfectly fine!"));
	}
	@BuilderMethod
	public void redBerriesActions() {
		var node = get(MyNodeLabels.redBerries.toString());
		node.add(new HideDialog()).add(new SetPosition(berry,forest)).add(new Drink(dad))
		.add(new NarrationSequence("Luckily, you feel perfectly fine!"));
	}
	@BuilderMethod
	public void carInForestActions() {
		var node = get(MyNodeLabels.carInForest.toString());
		node.add(new HideNarration())
		.add(new SetPosition(car, forest)).add(new DialogSequence(dad, son, List.of("Should we stop at the car?"),
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
		node.add(new WalkTo(dad, car)).add(new Kneel(dad))
		.add(new NarrationSequence("You try to start the car.")).add(new HideNarration());
		/* dads supposed to get hurt
		.add(new EnableEffect(Blood))
		/can't figure out how to make it work */
		
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
		node.add(new NarrationSequence("You see a stagnant pool of water, but there's a huge mosquito swarm!"))
		/* .add(new EnableEffect(son, Blood));
		 * for some reason, the Blood produces an error. 
		 */
		.add(new NarrationSequence("Your son gets hurt!")).add(new HideNarration())
		.add(new Kneel(son)) //he's supposed to kneel and then stand back up
		.add(new NarrationSequence("Looks like he's a bit hurt, but you know that you have to keep going."));
		
	}
	@BuilderMethod
	public void seeHutActions() {
		var node = get(MyNodeLabels.seeHut.toString());
		node.add(new SetPosition(stranger,oasis)).add(new Face(dad, stranger));
	}
	@BuilderMethod
	public void lostInForestActions() {
		var node = get(MyNodeLabels.lostInForest.toString());
		node.add(new NarrationSequence("You are wandering around aimlessly, with no sense of where to go."));
	}
	@BuilderMethod
	public void safetyConversationActions() {
		var node = get(MyNodeLabels.safetyConversation.toString());
		node.add(new DialogSequence(stranger, dad, List.of("We know how to get to a safer place. Do you want to come with us?"),
				List.of("yes", "no")));
	}
	@BuilderMethod
	public void dyingPersonActions() {
		var node = get(MyNodeLabels.dyingPerson.toString());
		//add narration
		node.add(new Die(son));	} //its really whoever has the sickness effect on them that dies
	
	@BuilderMethod
	public void northActions() {
		var node = get(MyNodeLabels.north.toString());
		//narration
	}
	
	
	
	
	
	
	
	//CAITLYN GIFFORD
	
	@BuilderMethod
	public void stayWithDyingPersonActions() {
		var node = get(MyNodeLabels.stayWithDyingPerson.toString());
		//you are with them while they pass away. do you search their body for supplies or sit there and cry?
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
		node.add(new Kneel(dad)).add(new Laugh(dad)).add(new NarrationSequence("He is actually crying."))
		.add(new HideNarration());
	}
	@BuilderMethod
	public void afterDeathActions() {
		var node = get(MyNodeLabels.afterDeath.toString());
		

	}
	@BuilderMethod
	public void goWithPartyActions() {
		var node = get(MyNodeLabels.goWithParty.toString());
		node.add(new SetPosition(dad, dungeon)).add(new SetPosition(son, dungeon)).add(new SetPosition(stranger,dungeon))
		.add(new NarrationSequence("You feel uneasy.. like something bad's about to happen."))
		.add(new HideNarration())
		.add(new Draw(stranger, sword))
		.add(new DialogSequence(stranger, dad, List.of("Give me everything you have!"),
				List.of("Please don't do anything!")))
		.add(new HideDialog());
		
	}
	@BuilderMethod
	public void goAloneActions() {
		var node = get(MyNodeLabels.goAlone.toString());
		node.add(new FadeOut()).add(new SetPosition(dad, forest)).add(new SetPosition(son,forest))
		.add(new FadeIn())
		.add(new NarrationSequence("You don't know what to do except wander around aimlessly."))
		.add(new HideNarration());
	}
	@BuilderMethod
	public void complyWithPartyActions() {
		var node = get(MyNodeLabels.complyWithParty.toString());
		node.add(new Draw(dad,food)).add((new Take(stranger, food, dad)));
		//add dialogue, set position
	}
	@BuilderMethod
	public void runAwayFromPartyActions() {
		var node = get(MyNodeLabels.runAwayFromParty.toString());
		node.add(new SetPosition(stranger,bunker)).add(new FadeOut())
		.add(new SetPosition(dad,forest)).add(new SetPosition(son, forest)).add(new FadeIn());
		//add dialogue to run away
	}
	@BuilderMethod
	public void southActions() {
		var node = get(MyNodeLabels.south.toString());
		//narration
	}
	@BuilderMethod
	public void lastCarActions() {
		var node = get(MyNodeLabels.lastCar.toString());
		node.add(new SetPosition(car, forest)).add(new NarrationSequence("There's another car! Do you try to fix it?"));
		
	}
	@BuilderMethod
	public void dontGoToCityActions() {
		var node = get(MyNodeLabels.dontGoToCity.toString());
		node.add(new HideNarration()).add(new FadeOut())
		.add(new SetPosition(dad,forest)).add(new Die(dad)).add(new FadeIn())
		.add(new NarrationSequence("There's nothing left for you anywhere. All is lost."));
	}
	@BuilderMethod
	public void goToCityActions() {
		var node = get(MyNodeLabels.goToCity.toString());
		node.add(new WalkTo(dad,car)).add(new Kneel(dad))
		.add(new NarrationSequence("It works!!"))
		.add(new Dance(dad))
		.add(new HideNarration())
		.add(new FadeOut())
		.add(new SetPosition(dad,city)).add(new FadeIn())
		.add(new NarrationSequence("You made it to the safe haven!! There is hope for humanity!"));
	}
}
