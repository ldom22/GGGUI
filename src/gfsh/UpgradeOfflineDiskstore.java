/****************************************************************************************************/
/*                                                                                                  */
/* File: UpgradeOfflineDiskstore.java                                                               */
/* Description: UpgradeOfflineDiskstore command implementation                                      */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class UpgradeOfflineDiskstore extends Command {
	
	public UpgradeOfflineDiskstore() {
		name = "upgrade offline-disk-store";
		description = "Upgrade an offline disk store";

		parameters = new Parameter[4];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Name of the offline disk store to be upgraded";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "disk-dirs";
		parameters[1].description = "Directories where data for the disk store was previously written";
		parameters[1].required = true;


		parameters[2] = new Parameter();
		parameters[2].name = "max-oplog-size";
		parameters[2].description = "Maximum size (in megabytes) of the oplogs created by the upgrade";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "J";
		parameters[3].description = "Arguments passed to the Java Virtual Machine performing the upgrade operation on the disk store";
		parameters[3].required = false;

	}
	
}