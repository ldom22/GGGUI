/****************************************************************************************************/
/*                                                                                                  */
/* File: DescribeMember.java                                                                        */
/* Description: DescribeMember command implementation                                               */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class DescribeMember extends Command {
	
	public DescribeMember() {
		name = "describe member";
		description = "Display information about a member";

		parameters = new Parameter[1];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Name of Member to be described";
		parameters[0].required = true;

	}
	
}