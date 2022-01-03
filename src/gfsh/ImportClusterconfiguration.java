/****************************************************************************************************/
/*                                                                                                  */
/* File: ImportClusterconfiguration.java                                                            */
/* Description: ImportClusterconfiguration command implementation                                   */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class ImportClusterconfiguration extends Command {
	
	public ImportClusterconfiguration() {
		name = "import cluster-configuration";
		description = "Imports configuration into cluster configuration hosted at the locators";

		parameters = new Parameter[1];

		parameters[0] = new Parameter();
		parameters[0].name = "zip-file-name";
		parameters[0].description = "The zip file containing the cluster configuration artifacts";
		parameters[0].required = true;



	}
	
}