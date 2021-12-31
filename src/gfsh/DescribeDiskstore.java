/****************************************************************************************************/
/*                                                                                                  */
/* File: DescribeDiskstore.java                                                                     */
/* Description: DescribeDiskstore command implementation                                            */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class DescribeDiskstore extends Command {
	
	public DescribeDiskstore() {
		name = "describe disk-store";
		description = "Display information about a member's disk store";

		parameters = new Parameter[2];

		parameters[0] = new Parameter();
		parameters[0].name = "member";
		parameters[0].description = "Name/Id of the member with the disk store to be described";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "name";
		parameters[1].description = "Name of the disk store to be described";
		parameters[1].required = true;



	}
	
}