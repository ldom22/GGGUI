/****************************************************************************************************/
/*                                                                                                  */
/* File: ExportConfig.java                                                                          */
/* Description: ExportConfig command implementation                                                 */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class ExportConfig extends Command {
	
	public ExportConfig() {
		name = "export config ";
		description = "Export configuration properties for a member or members";

		parameters = new Parameter[3];

		parameters[0] = new Parameter();
		parameters[0].name = "member";
		parameters[0].description = "Name/Id of the member(s) whose configuration will be exported";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "group";
		parameters[1].description = "Group(s) of members whose configuration will be exported";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "dir";
		parameters[2].description = "Directory to which the exported configuration files will be written";
		parameters[2].required = false;



	}
	
}