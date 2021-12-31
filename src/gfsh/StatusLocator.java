public class StatusLocator extends Command {
	
	public StatusLocator() {
		name = "status locator ";
		description = "Display the status of a Locator. Possible statuses are: started, online, offline or not responding";

		parameters = new Parameter[5];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Member name or ID of the Locator in the GemFire cluster";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "host";
		parameters[1].description = "Hostname or IP address on which the Locator is running";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "port";
		parameters[2].description = "Port on which the Locator is listening. The default is 10334";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "pid";
		parameters[3].description = "Process ID (PID) of the running Locator";
		parameters[3].required = false;


		parameters[4] = new Parameter();
		parameters[4].name = "dir";
		parameters[4].description = "Working directory in which the Locator is running. The default is the current directory";
		parameters[4].required = false;



	}
	
}