/****************************************************************************************************/
/*                                                                                                  */
/* File: DescribeRegion.java                                                                        */
/* Description: DescribeRegion command implementation                                               */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class DescribeRegion extends Command {
	
	public DescribeRegion() {
		name = "describe region";
		description = "Display the attributes and key information of a region";

		parameters = new Parameter[1];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Name/Path of the region to be described";
		parameters[0].required = true;



	}
	
}