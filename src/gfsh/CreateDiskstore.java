/****************************************************************************************************/
/*                                                                                                  */
/* File: CreateDiskstore.java                                                                       */
/* Description: CreateDiskstore command implementation                                              */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class CreateDiskstore extends Command {
	
	public CreateDiskstore() {
		name = "create disk-store";
		description = "Create a disk store";

		parameters = new Parameter[12];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Name of the disk store to be created";
		parameters[0].required = true;

		parameters[1] = new Parameter();
		parameters[1].name = "dir";
		parameters[1].description = "Directories where the disk store files will be written, the directories will be created if they don't exist.  Optionally, directory names may be followed by # and the maximum number of megabytes that the disk store can use in the directory";
		parameters[1].required = true;

		parameters[2] = new Parameter();
		parameters[2].name = "allow-force-compaction";
		parameters[2].description = "Whether to allow manual compaction through the API or command-line tools";
		parameters[2].required = false;
		parameters[2].options = new String[2];
		parameters[2].options[0] = "true";
		parameters[2].options[1] = "false";

		parameters[3] = new Parameter();
		parameters[3].name = "auto-compact";
		parameters[3].description = "Whether to automatically compact a file when it reaches the compaction-threshold";
		parameters[3].required = false;
		parameters[3].options = new String[2];
		parameters[3].options[0] = "true";
		parameters[3].options[1] = "false";

		parameters[4] = new Parameter();
		parameters[4].name = "compaction-threshold";
		parameters[4].description = "Percentage of garbage allowed in the file before it is eligible for compaction";
		parameters[4].required = false;


		parameters[5] = new Parameter();
		parameters[5].name = "max-oplog-size";
		parameters[5].description = "The largest size, in megabytes, to allow an operation log to become before automatically rolling to a new file";
		parameters[5].required = false;

		parameters[6] = new Parameter();
		parameters[6].name = "queue-size";
		parameters[6].description = "For asynchronous queueing. The maximum number of operations to allow into the write queue before automatically flushing the queue. The default of 0 indicates no limit";
		parameters[6].required = false;

		parameters[7] = new Parameter();
		parameters[7].name = "time-interval";
		parameters[7].description = "For asynchronous queueing. The number of milliseconds that can elapse before data is flushed to disk. Reaching this limit or the queue-size limit causes the queue to flush";
		parameters[7].required = false;

		parameters[8] = new Parameter();
		parameters[8].name = "write-buffer-size";
		parameters[8].description = "Size of the buffer used to write to disk";
		parameters[8].required = false;

		parameters[9] = new Parameter();
		parameters[9].name = "group";
		parameters[9].description = "Group(s) of members on which the disk store will be created. If no group is specified the disk store will be created on all members";
		parameters[9].required = false;

		parameters[10] = new Parameter();
		parameters[10].name = "disk-usage-warning-percentage";
		parameters[10].description = "Warning percentage for disk volume usage";
		parameters[10].required = false;


		parameters[11] = new Parameter();
		parameters[11].name = "disk-usage-critical-percentage";
		parameters[11].description = "Critical percentage for disk volume usage";
		parameters[11].required = false;
	}
	
}