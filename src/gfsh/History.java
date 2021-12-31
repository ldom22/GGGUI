public class History extends Command {
	
	public History() {
		name = "history ";
		description = "Display or export previously executed GFSH commands";

		parameters = new Parameter[2];

		parameters[0] = new Parameter();
		parameters[0].name = "file";
		parameters[0].description = "File to which the history will be written";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "clear";
		parameters[1].description = "Clears the history of GFSH commands";
		parameters[1].required = false;
		parameters[1].options = new String[2];
		parameters[1].options[0] = "false";
		parameters[1].options[0] = "true";



	}
	
}