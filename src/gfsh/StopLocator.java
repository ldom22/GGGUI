public class StopLocator extends Command {
	
	public StopLocator() {
		name = "stop locator ";
		description = "Stop a Locator";

		parameters = new Parameter[3];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Member name or ID of the Locator in the GemFire cluster";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "pid";
		parameters[1].description = "The process id (PID) of the running Locator";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "dir";
		parameters[2].description = " Working directory in which the Locator is running. The default is the current directory";
		parameters[2].required = false;



	}
	
}