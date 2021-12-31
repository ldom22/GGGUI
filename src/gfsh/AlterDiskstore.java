/****************************************************************************************************/
/*                                                                                                  */
/* File: AlterDiskStore.java                                                                        */
/* Description: Alter Disk Store command implementation                                             */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class AlterDiskstore extends Command {
	
	public AlterDiskstore(){
		name = "alter disk-store";
		description = "Alter some options for a region or remove a region in an offline disk store.";
		
		parameters = new Parameter[12];
		
		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Name of the disk store whose contents will be altered";
		parameters[0].required = true;
		
		parameters[1] = new Parameter();
		parameters[1].name = "region";
		parameters[1].description = "Name/Path of the region in the disk store to alter";
		parameters[1].required = true;
		
		parameters[2] = new Parameter();
		parameters[2].name = "disk-dirs";
		parameters[2].description = "Directories where data for the disk store was previously written";
		parameters[2].required = true;
		
		parameters[3] = new Parameter();
		parameters[3].name = "lru-algorthm";
		parameters[3].description = "Least recently used eviction algorithm";
		parameters[3].required = false;
		parameters[3].options = new String[4];
		parameters[3].options[0] = "none";
		parameters[3].options[1] = "lru-entry-count";
		parameters[3].options[2] = "lru-heap-percentage";
		parameters[3].options[3] = "lru-memory-size";
		
		parameters[4] = new Parameter();
		parameters[4].name = "lru-action";
		parameters[4].description = "Action to take when evicting entries from the region";
		parameters[4].required = false;
		parameters[4].options = new String[3];
		parameters[4].options[0] = "none";
		parameters[4].options[1] = "overflow-to-disk";
		parameters[4].options[2] = "local-destroy";
		
		parameters[5] = new Parameter();
		parameters[5].name = "lru-limit";
		parameters[5].description = "Number of entries allowed in the region before eviction will occur";
		parameters[5].required = false;
		
		parameters[6] = new Parameter();
		parameters[6].name = "concurrency-level";
		parameters[6].description = "An estimate of the maximum number of application threads that will concurrently access a region entry at one time. This attribute does not apply to partitioned regions";
		parameters[6].required = false;
		
		parameters[7] = new Parameter();
		parameters[7].name = "initial-capacity";
		parameters[7].description = "Together with --load-factor, sets the parameters on the underlying java.util.ConcurrentHashMap used for storing region entries";
		parameters[7].required = false;
		
		parameters[8] = new Parameter();
		parameters[8].name = "load-factor";
		parameters[8].description = "Together with --initial-capacity, sets the parameters on the underlying java.util.ConcurrentHashMap used for storing region entries. This must be a floating point number between 0 and 1, inclusive";
		parameters[8].required = false;
		
		parameters[9] = new Parameter();
		parameters[9].name = "compressor";
		parameters[9].description = "The fully-qualifed class name of the Compressor to use when compressing region entry values. A value of 'none' will remove the Compressor";
		parameters[9].required = false;
		
		parameters[10] = new Parameter();
		parameters[10].name = "enable-statistics";
		parameters[10].description = "Whether to enable statistics";
		parameters[10].options = new String[2];
		parameters[10].required = false;
		parameters[10].options[0] = "true";
		parameters[10].options[1] = "false";
		
		parameters[11] = new Parameter();
		parameters[11].name = "remove";
		parameters[11].description = "Whether to remove the region from the disk store";
		parameters[11].required = false;
		parameters[11].options = new String[2];
		parameters[11].options[0] = "true";
		parameters[11].options[1] = "false";
	}

}