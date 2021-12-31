/****************************************************************************************************/
/*                                                                                                  */
/* File: DescribeClient.java                                                                        */
/* Description: DescribeClient command implementation                                               */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class DescribeClient extends Command {
	
	public DescribeClient() {
		name = "describe client";
		description = "Display details of specified client";

		parameters = new Parameter[1];

		parameters[0] = new Parameter();
		parameters[0].name = "clientID";
		parameters[0].description = "ID of a client for which details are needed";
		parameters[0].required = true;


	}
	
}