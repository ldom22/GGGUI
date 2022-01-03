/****************************************************************************************************/
/*                                                                                                  */
/* File: ValidateOfflineDiskstore.java                                                              */
/* Description: ValidateOfflineDiskstore command implementation                                     */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class ValidateOfflineDiskstore extends Command {
	
	public ValidateOfflineDiskstore() {
		name = "validate offline-disk-store";
		description = "Scan the contents of a disk store to verify that it has no errors";

		parameters = new Parameter[2];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Name of the disk store to be validated";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "disk-dirs";
		parameters[1].description = "Directories where data for the disk store was previously written";
		parameters[1].required = true;



	}
	
}