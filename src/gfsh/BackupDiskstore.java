/****************************************************************************************************/
/*                                                                                                  */
/* File: BackupDiskStore.java                                                                       */
/* Description: Backup Store command implementation                                                 */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class BackupDiskstore extends Command {
	
	public BackupDiskstore() {
		name = "backup disk-store";
		description = "Perform a backup on all members with persistent data. The target directory must exist on all members, but can be either local or shared. This command can safely be executed on active members and is strongly recommended over copying files via operating system commands";

		parameters = new Parameter[2];

		parameters[0] = new Parameter();
		parameters[0].name = "dir";
		parameters[0].description = "Directory to which backup files will be written";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "baseline-dir";
		parameters[1].description = "Directory which contains the baseline backup used for comparison during an incremental backup";
		parameters[1].required = false;

	}
	
}