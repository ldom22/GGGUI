/****************************************************************************************************/
/*                                                                                                  */
/* File: Undeploy.java                                                                              */
/* Description: Undeploy command implementation                                                     */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class Undeploy extends Command {
	
	public Undeploy() {
		name = "undeploy ";
		description = "Undeploy JARs from a member or members";

		parameters = new Parameter[2];

		parameters[0] = new Parameter();
		parameters[0].name = "group";
		parameters[0].description = "Group(s) of members from which to undeploy JARs. If not specified, undeploy will occur on all members";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "jar";
		parameters[1].description = "JAR(s) to be undeployed.  If not specified, all JARs will be undeployed";
		parameters[1].required = false;

	}
	
}