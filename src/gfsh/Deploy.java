/****************************************************************************************************/
/*                                                                                                  */
/* File: Deploy.java                                                                                */
/* Description: Deploy command implementation                                                       */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class Deploy extends Command {
	
	public Deploy() {
		name = "deploy ";
		description = "Deploy JARs to a member or members.  Only one of either --jar or --dir may be specified";

		parameters = new Parameter[3];

		parameters[0] = new Parameter();
		parameters[0].name = "group";
		parameters[0].description = "Group(s) to which the specified JARs will be deployed. If not specified, deploy will occur on all members";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "jar";
		parameters[1].description = "Path of the JAR to deploy";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "dir";
		parameters[2].description = "Directory from which to deploy the JARs";
		parameters[2].required = false;



	}
	
}