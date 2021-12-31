/****************************************************************************************************/
/*                                                                                                  */
/* File: CloseDurablecq.java                                                                        */
/* Description: Close durable cq command implementation                                             */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class CloseDurablecq extends Command {
	
	public CloseDurablecq() {
		name = "close durable-cq";
		description = "Closes the durable cq registered by the durable client and drain events held for the durable cq from the subscription queue";

		parameters = new Parameter[4];

		parameters[0] = new Parameter();
		parameters[0].name = "durable-client-id";
		parameters[0].description = "The id of the durable client";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "durable-cq-name";
		parameters[1].description = "Name of the cq to be closed";
		parameters[1].required = true;


		parameters[2] = new Parameter();
		parameters[2].name = "member";
		parameters[2].description = "Name/Id of the member for which the durable client is registered and the cq to be closed";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "group";
		parameters[3].description = "Group of members for which the durable client is registered and the cq to be closed";
		parameters[3].required = false;



	}
	
}