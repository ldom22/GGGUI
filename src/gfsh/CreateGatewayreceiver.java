/****************************************************************************************************/
/*                                                                                                  */
/* File: CreateGatewayreceiver.java                                                                 */
/* Description: CreateGatewayreceiver command implementation                                        */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class CreateGatewayreceiver extends Command {
	
	public CreateGatewayreceiver() {
		name = "create gateway-receiver ";
		description = "Create the Gateway Receiver on a member or members";

		parameters = new Parameter[9];

		parameters[0] = new Parameter();
		parameters[0].name = "group";
		parameters[0].description = "Group(s) of members on which to create the Gateway Receiver";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "member";
		parameters[1].description = "Name/Id of the member on which to create the Gateway Receiver";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "manual-start";
		parameters[2].description = "Whether manual start is to be enabled or the receiver will start automatically after creation";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "start-port";
		parameters[3].description = "Starting value of the port range from which the GatewayReceiver's port will be chosen";
		parameters[3].required = false;


		parameters[4] = new Parameter();
		parameters[4].name = "end-port";
		parameters[4].description = "End value of the port range from which the GatewayReceiver's port will be chosen";
		parameters[4].required = false;


		parameters[5] = new Parameter();
		parameters[5].name = "bind-address";
		parameters[5].description = "The IP address or host name that the receiver's socket will listen on for client connections";
		parameters[5].required = false;


		parameters[6] = new Parameter();
		parameters[6].name = "maximum-time-between-pings";
		parameters[6].description = "The maximum amount of time between client pings";
		parameters[6].required = false;


		parameters[7] = new Parameter();
		parameters[7].name = "socket-buffer-size";
		parameters[7].description = "The buffer size in bytes of the socket connection for this GatewayReceiver";
		parameters[7].required = false;


		parameters[8] = new Parameter();
		parameters[8].name = "gateway-transport-filter";
		parameters[8].description = "The list of fully qualified class names of GatewayTransportFilters (separated by comma) to be added to the GatewayReceiver";
		parameters[8].required = false;



	}
	
}