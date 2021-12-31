public class Run extends Command {
	
	public Run() {
		name = "run";
		description = "Execute a set of GFSH commands";

		parameters = new Parameter[3];

		parameters[0] = new Parameter();
		parameters[0].name = "file";
		parameters[0].description = "File containing the GFSH commands to execute";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "quiet";
		parameters[1].description = "Whether to show command output";
		parameters[1].required = false;
		parameters[1].options = new String[2];
		parameters[1].options[0] = "true";
		parameters[1].options[1] = "false";


		parameters[2] = new Parameter();
		parameters[2].name = "continue-on-error";
		parameters[2].description = "Whether command execution should continue if an error is received";
		parameters[2].required = false;
		parameters[2].options = new String[2];
		parameters[2].options[0] = "true";
		parameters[2].options[1] = "false";

	}
	
}