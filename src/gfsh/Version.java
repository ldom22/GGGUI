/****************************************************************************************************/
/*                                                                                                  */
/* File: Version.java                                                                               */
/* Description: Version command implementation                                                      */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class Version extends Command {
	
	public Version(){
		name = "version";
		description = "Display product version information";
		
		parameters = new Parameter[1];
		
		parameters[0] = new Parameter();
		parameters[0].name = "full";
		parameters[0].description = "Whether to show the full version information";
		parameters[0].required = false;
		parameters[0].options = new String[2];
		parameters[0].options[0] = "true";
		parameters[0].options[1] = "false";
	}
	
}