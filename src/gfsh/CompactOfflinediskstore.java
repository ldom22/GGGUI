/****************************************************************************************************/
/*                                                                                                  */
/* File: CompactOfflinediskstore.java                                                               */
/* Description: CompactOfflinediskstore command implementation                                      */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class CompactOfflinediskstore extends Command {
	
	public CompactOfflinediskstore() {
		name = "compact offline-disk-store";
		description = "Compact an offline disk store. If the disk store is large, additional memory may need to be allocated to the process using the --J=-Xmx??? parameter";

		parameters = new Parameter[4];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Name of the offline disk store to be compacted";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "disk-dirs";
		parameters[1].description = "Directories where data for the disk store was previously written";
		parameters[1].required = true;


		parameters[2] = new Parameter();
		parameters[2].name = "max-oplog-size";
		parameters[2].description = "Maximum size (in megabytes) of the oplogs created by compaction";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "J";
		parameters[3].description = "Arguments passed to the Java Virtual Machine performing the compact operation on the disk store";
		parameters[3].required = false;


	}
	
}