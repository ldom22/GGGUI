/****************************************************************************************************/
/*                                                                                                  */
/* File: DescribeConfig.java                                                                        */
/* Description: DescribeConfig command implementation                                               */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class DescribeConfig extends Command {
	
	public DescribeConfig() {
		name = "describe config";
		description = "Display configuration details of a member or members";

		parameters = new Parameter[2];

		parameters[0] = new Parameter();
		parameters[0].name = "member";
		parameters[0].description = "Name/Id of the member whose configuration will be described";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "hide-defaults";
		parameters[1].description = "Whether to hide configuration information for properties with the default value";
		parameters[1].required = false;
		parameters[1].options = new String[2];
		parameters[1].options[0] = "false";
		parameters[1].options[1] = "true";


	}
	
}