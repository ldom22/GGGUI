/****************************************************************************************************/
/*                                                                                                  */
/* File: ListDurablecqs.java                                                                        */
/* Description: ListDurablecqs command implementation                                               */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class ListDurablecqs extends Command {
	
	public ListDurablecqs() {
		name = "list durable-cqs";
		description = "List durable client cqs associated with the specified durable client id";

		parameters = new Parameter[3];

		parameters[0] = new Parameter();
		parameters[0].name = "durable-client-id";
		parameters[0].description = "The id used to identify the durable client";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "member";
		parameters[1].description = "Name/Id of the member for which the durable client is registered and durable cqs will be displayed";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "group";
		parameters[2].description = "Group of members for which the durable client is registered and durable cqs will be displayed";
		parameters[2].required = false;



	}
	
}