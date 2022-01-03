/****************************************************************************************************/
/*                                                                                                  */
/* File: ListGateways.java                                                                          */
/* Description: ListGateways command implementation                                                 */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class ListGateways extends Command {
	
	public ListGateways() {
		name = "list gateways ";
		description = "Display the Gateway Senders and Receivers for a member or members";

		parameters = new Parameter[2];

		parameters[0] = new Parameter();
		parameters[0].name = "member";
		parameters[0].description = "Member(s) for which Gateway Senders and Receivers will be displayed";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "group";
		parameters[1].description = "Group(s) of members for which Gateway Senders and Receivers will be displayed";
		parameters[1].required = false;



	}
	
}