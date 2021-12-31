public class Remove extends Command {
	
	public Remove() {
		name = "remove";
		description = "Remove an entry from a region";

		parameters = new Parameter[4];

		parameters[0] = new Parameter();
		parameters[0].name = "region";
		parameters[0].description = "Region from which to remove the entry";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "key";
		parameters[1].description = "String or JSON text from which to create the key";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "all";
		parameters[2].description = "Clears the region by removing all entries";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "key-class";
		parameters[3].description = "Fully qualified class name of the key's type";
		parameters[3].required = false;



	}
	
}