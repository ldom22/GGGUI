/****************************************************************************************************/
/*                                                                                                  */
/* File: CompactDiskstore.java                                                                      */
/* Description: Compact Disk store   command implementation                                         */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class CompactDiskstore extends Command {
	
	public CompactDiskstore() {
		name = "compact disk-store";
		description = "Compact a disk store on all members with that disk store. This command uses the compaction threshold that each member has configured for its disk stores. The disk store must have allow-force-compaction set to true";

		parameters = new Parameter[2];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Name of the disk store to be compacted";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "group";
		parameters[1].description = "Group(s) of members that will perform disk compaction. If no group is specified the disk store will be compacted by all members";
		parameters[1].required = false;



	}
	
}