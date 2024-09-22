package myclassproject.mystorygraph;

import com.entities.Characters;
import com.entities.Furniture;
import com.entities.Item;
import com.entities.Place;
import com.enums.BodyTypes;
import com.enums.Clothing;
import com.enums.Colors;
import com.enums.FurnitureTypes;
import com.enums.HairStyle;
import com.enums.ItemTypes;
import com.enums.PlaceTypes;

public final class MyStoryEntities {
	//Create an instance of Character, Place, Furniture, and Item classes 
	//for each of the characters, places, furniture, and items in your story
	//Make that instance public static final
	//e.g. public static final Characters player = new Characters("Player", BodyTypes.D, Clothing.Peasant, HairStyle.Short, Colors.Black, 6);
	//You can access these instances in your EdgeBuilder and NodeBuilder classes by importing:
	//import static myclassproject.mystorygraph.MyStoryEntities.*;
	public static final Characters dad = new Characters("Dad", BodyTypes.A, Clothing.Peasant, HairStyle.Short, Colors.Black, 6);
	public static final Characters son = new Characters("Son", BodyTypes.D, Clothing.Peasant, HairStyle.Short, Colors.Brown, 3);
	public static final Characters stranger = new Characters("Stranger", BodyTypes.F, Clothing.Bandit, HairStyle.Bald, Colors.Black, 4);
	public static final Place forest = new Place("Forest", PlaceTypes.ForestPath);
	public static final Place bunker = new Place("Bunker", PlaceTypes.Storage);
	public static final Place hut = new Place("Hut", PlaceTypes.Cottage);
	public static final Place store = new Place("Store", PlaceTypes.Tavern);
	public static final Place hospital = new Place("Hospital", PlaceTypes.GreatHall);
	public static final Place coast = new Place("Coast", PlaceTypes.Port);
	public static final Place city = new Place("City", PlaceTypes.City);
	public static final Place oasis = new Place("Oasis",PlaceTypes.Farm);
	public static final Item medicine = new Item("medicine", ItemTypes.BluePotion);
	public static final Item food = new Item("food", ItemTypes.Bread);
	public static final Item car = new Item("Car",ItemTypes.Compass);
	public static final Item berry = new Item("Berry",ItemTypes.Apple);
	public static final Item animal = new Item("animal",ItemTypes.Skull);

}
