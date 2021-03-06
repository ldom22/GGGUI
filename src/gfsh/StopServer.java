/****************************************************************************************************/
/*                                                                                                  */
/* File: StopServer.java                                                                            */
/* Description: StopServer command implementation                                                   */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class StopServer extends Command {
	
	public StopServer() {
		name = "stop server ";
		description = "Stop a GemFire Cache Server";

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