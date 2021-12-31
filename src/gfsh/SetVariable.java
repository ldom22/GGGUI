public class SetVariable extends Command {
	
	public SetVariable() {
		name = "set variable";
		description = "Set GFSH variables that can be used by commands";

		parameters = new Parameter[2];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Name for the variable. Name must only be composed of letters, numbers and the \"_\" character and may not start with a number";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "value";
		parameters[1].description = "Value that the variable will be set to";
		parameters[1].required = true;



	}
	
}