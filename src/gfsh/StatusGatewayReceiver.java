/****************************************************************************************************/
/*                                                                                                  */
/* File: StatusGatewayReceiver.java                                                                 */
/* Description: StatusGatewayReceiver command implementation                                        */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class StatusGatewayReceiver extends Command {
	
	public StatusGatewayReceiver() {
		name = "status gateway-receiver ";
		description = "Display the status of a Gateway Sender";

		parameters = new Parameter[2];

		parameters[0] = new Parameter();
		parameters[0].name = "group";
		parameters[0].description = "Group(s) of Gateway Receivers for which to display status";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "member";
		parameters[1].description = "Name/Id of the Gateway Receiver for which to display status";
		parameters[1].required = false;

	}
	
}