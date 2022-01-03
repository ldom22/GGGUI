/****************************************************************************************************/
/*                                                                                                  */
/* File: StopGatewaySender.java                                                                     */
/* Description: StopGatewaySender command implementation                                            */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class StopGatewaySender extends Command {
	
	public StopGatewaySender() {
		name = "stop gateway-sender";
		description = "Stop the Gateway Sender on a member or members";

		parameters = new Parameter[3];

		parameters[0] = new Parameter();
		parameters[0].name = "id";
		parameters[0].description = "ID of the Gateway Sender";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "group";
		parameters[1].description = "Group(s) of members on which to stop the Gateway Sender";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "member";
		parameters[2].description = "Name/Id of the member on which to stop the Gateway Sender";
		parameters[2].required = false;



	}
	
}