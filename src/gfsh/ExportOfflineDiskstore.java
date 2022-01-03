/****************************************************************************************************/
/*                                                                                                  */
/* File: ExportOfflineDiskstore.java                                                                */
/* Description: ExportOfflineDiskstore command implementation                                       */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class ExportOfflineDiskstore extends Command {
	
	public ExportOfflineDiskstore() {
		name = "export offline-disk-store";
		description = "Export region data from an offline disk store into gemfire snapshot files";

		parameters = new Parameter[3];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Name of the disk store to be exported";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "disk-dirs";
		parameters[1].description = "Directories which contain the disk store files";
		parameters[1].required = true;


		parameters[2] = new Parameter();
		parameters[2].name = "dir";
		parameters[2].description = "Directory to export snapshot files to";
		parameters[2].required = true;



	}
	
}