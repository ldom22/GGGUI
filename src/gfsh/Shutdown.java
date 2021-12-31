public class Shutdown extends Command {
	
	public Shutdown() {
		name = "shutdown ";
		description = "Stop all members";

		parameters = new Parameter[2];

		parameters[0] = new Parameter();
		parameters[0].name = "time-out";
		parameters[0].description = "Time to wait (in seconds) for a graceful shutdown. Should be at least 10";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "include-locators";
		parameters[1].description = "To shutdown locators specify this option as true. Default is false";
		parameters[1].required = false;
		parameters[1].options = new String[2];
		parameters[1].options[0] = "false";
		parameters[1].options[1] = "true";



	}
	
}