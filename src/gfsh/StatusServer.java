public class StatusServer extends Command {
	
	public StatusServer() {
		name = "status server ";
		description = "Display the status of a GemFire Cache Server";

		parameters = new Parameter[3];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Member name or ID of the Cache Server in the GemFire cluster";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "pid";
		parameters[1].description = "Process ID (PID) of the running GemFire Cache Server";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "dir";
		parameters[2].description = "Working directory in which the Cache Server is running. The default is the current directory";
		parameters[2].required = false;



	}
	
}