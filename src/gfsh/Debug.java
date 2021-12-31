/****************************************************************************************************/
/*                                                                                                  */
/* File: Debug.java                                                                                 */
/* Description: Debug command implementation                                                        */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class Debug extends Command {
	
	public Debug() {
		name = "debug";
		description = "Enable/Disable debugging output in GFSH";

		parameters = new Parameter[1];

		parameters[0] = new Parameter();
		parameters[0].name = "state";
		parameters[0].description = "ON or OFF to enable or disable debugging output";
		parameters[0].required = true;
		parameters[0].options = new String[2];
		parameters[0].options[0] = "ON";
		parameters[0].options[1] = "OFF";


	}
	
}