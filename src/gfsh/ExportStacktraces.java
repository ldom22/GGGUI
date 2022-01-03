/****************************************************************************************************/
/*                                                                                                  */
/* File: ExportStacktraces.java                                                                     */
/* Description: ExportStacktraces command implementation                                            */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class ExportStacktraces extends Command {
	
	public ExportStacktraces() {
		name = "export stack-traces";
		description = "Export the stack trace for a member or members";

		parameters = new Parameter[3];

		parameters[0] = new Parameter();
		parameters[0].name = "file";
		parameters[0].description = "Name of the file to which the stack traces will be written";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "member";
		parameters[1].description = "Export the stack trace for a member or members";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "group";
		parameters[2].description = "Group";
		parameters[2].required = false;



	}
	
}