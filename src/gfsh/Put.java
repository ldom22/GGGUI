public class Put extends Command {
	
	public Put() {
		name = "put";
		description = "Add/Update an entry in a region";

		parameters = new Parameter[6];

		parameters[0] = new Parameter();
		parameters[0].name = "key";
		parameters[0].description = "String or JSON text from which to create the key";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "value";
		parameters[1].description = "String or JSON text from which to create the value";
		parameters[1].required = true;


		parameters[2] = new Parameter();
		parameters[2].name = "region";
		parameters[2].description = "Region into which the entry will be put";
		parameters[2].required = true;


		parameters[3] = new Parameter();
		parameters[3].name = "key-class";
		parameters[3].description = "Fully qualified class name of the key's type";
		parameters[3].required = false;


		parameters[4] = new Parameter();
		parameters[4].name = "value-class";
		parameters[4].description = "Fully qualified class name of the value's type";
		parameters[4].required = false;


		parameters[5] = new Parameter();
		parameters[5].name = "skip-if-exists";
		parameters[5].description = "Skip the put operation when an entry with the same key already exists";
		parameters[5].required = false;
		parameters[5].options = new String[2];
		parameters[5].options[0] = "false";
		parameters[5].options[1] = "true";



	}
	
}