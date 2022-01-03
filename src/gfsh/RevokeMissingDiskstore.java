/****************************************************************************************************/
/*                                                                                                  */
/* File: RevokeMissingDiskstore.java                                                                */
/* Description: RevokeMissingDiskstore command implementation                                       */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class RevokeMissingDiskstore extends Command {
	
	public RevokeMissingDiskstore() {
		name = "revoke missing-disk-store";
		description = "Instructs the member(s) of a distributed system to stop waiting for a disk store to be available";

		parameters = new Parameter[1];

		parameters[0] = new Parameter();
		parameters[0].name = "id";
		parameters[0].description = "ID of the missing disk store to be revoked";
		parameters[0].required = true;



	}
	
}