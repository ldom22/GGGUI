/****************************************************************************************************/
/*                                                                                                  */
/* File: LoadbalanceGatewaysender.java                                                              */
/* Description: LoadbalanceGatewaysender command implementation                                     */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class LoadbalanceGatewaysender extends Command {
	
	public LoadbalanceGatewaysender() {
		name = "load-balance gateway-sender";
		description = "Cause the Gateway Sender to close its current connections so that it reconnects to its remote receivers in a more balanced fashion";

		parameters = new Parameter[1];

		parameters[0] = new Parameter();
		parameters[0].name = "id";
		parameters[0].description = "ID of the Gateway Sender";
		parameters[0].required = true;

	}
	
}