/****************************************************************************************************/
/*                                                                                                  */
/* File: ShowDeadlocks.java                                                                         */
/* Description: ShowDeadlocks command implementation                                                */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class ShowDeadlocks extends Command {
	
	public ShowDeadlocks() {
		name = "show dead-locks";
		description = "Display any deadlocks in the GemFire distributed system";

		parameters = new Parameter[1];

		parameters[0] = new Parameter();
		parameters[0].name = "file";
		parameters[0].description = "Name of the file to which dependencies between members will be written";
		parameters[0].required = true;

	}
	
}