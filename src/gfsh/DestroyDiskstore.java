/****************************************************************************************************/
/*                                                                                                  */
/* File: DestroyDiskstore.java                                                                      */
/* Description: DestroyDiskstore command implementation                                             */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class DestroyDiskstore extends Command {
	
	public DestroyDiskstore() {
		name = "destroy disk-store";
		description = "Destroy a disk store, including deleting all files on disk used by the disk store. Data for closed regions previously using the disk store will be lost";

		parameters = new Parameter[2];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Name of the disk store that will be destroyed";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "group";
		parameters[1].description = "Group(s) of members on which the disk store will be destroyed. If no group is specified the disk store will be destroyed on all members";
		parameters[1].required = false;



	}
	
}