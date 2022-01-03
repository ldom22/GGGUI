/****************************************************************************************************/
/*                                                                                                  */
/* File: ExportClusterconfiguration.java                                                            */
/* Description: ExportClusterconfiguration command implementation                                   */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class ExportClusterconfiguration extends Command {
	
	public ExportClusterconfiguration() {
		name = "export cluster-configuration";
		description = "Exit GFSH and return control back to the calling process";

		parameters = new Parameter[2];

		parameters[0] = new Parameter();
		parameters[0].name = "zip-file-name";
		parameters[0].description = "Name of the zip file containing the exported cluster configuration artifacts";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "dir";
		parameters[1].description = "The directory in which the exported cluster configuration artifacts will be saved";
		parameters[1].required = false;



	}
	
}