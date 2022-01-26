/****************************************************************************************************/
/*                                                                                                  */
/* File: StopGatewayReceiver.java                                                                   */
/* Description: StopGatewayReceiver command implementation                                          */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class StopGatewayReceiver extends Command {
	
	public StopGatewayReceiver() {
		name = "stop gateway-receiver ";
		description = "Stop the Gateway Receiver on a member or members";

		parameters = new Parameter[2];

		parameters[0] = new Parameter();
		parameters[0].name = "group";
		parameters[0].description = "Group(s) of members on which to stop the Gateway Receiver";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "member";
		parameters[1].description = "Name/Id of the member on which to stop the Gateway Receiver";
		parameters[1].required = false;



	}
	
}