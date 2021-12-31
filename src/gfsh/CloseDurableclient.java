/****************************************************************************************************/
/*                                                                                                  */
/* File: CloseDurableclient.java                                                                    */
/* Description: Close durable client command implementation                                         */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class CloseDurableclient extends Command {
	
	public CloseDurableclient() {
		name = "close durable-client";
		description = "Attempts to close the durable client, the client must be disconnected";

		parameters = new Parameter[3];

		parameters[0] = new Parameter();
		parameters[0].name = "durable-client-id";
		parameters[0].description = "The id used to identify the durable client";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "member";
		parameters[1].description = "Name/Id of the member for which the durable client is to be closed";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "group";
		parameters[2].description = "Group of members for which the durable client is to be closed";
		parameters[2].required = false;

	}
	
}