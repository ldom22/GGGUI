/****************************************************************************************************/
/*                                                                                                  */
/* File: DescribeOfflinediskstore.java                                                              */
/* Description: DescribeOfflinediskstore command implementation                                     */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class DescribeOfflinediskstore extends Command {
	
	public DescribeOfflinediskstore() {
		name = "describe offline-disk-store";
		description = "Display information about an offline disk store";

		parameters = new Parameter[4];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Name of the disk store to be described";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "disk-dirs";
		parameters[1].description = "Directories which contain the disk store files";
		parameters[1].required = true;


		parameters[2] = new Parameter();
		parameters[2].name = "pdx";
		parameters[2].description = "Display all the pdx types stored in the disk store";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "region";
		parameters[3].description = "Name/Path of the region in the disk store to be described";
		parameters[3].required = false;



	}
	
}