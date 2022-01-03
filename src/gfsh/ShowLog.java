/****************************************************************************************************/
/*                                                                                                  */
/* File: ShowLog.java                                                                               */
/* Description: ShowLog command implementation                                                      */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class ShowLog extends Command {
	
	public ShowLog() {
		name = "show log";
		description = "Display the log for a member";

		parameters = new Parameter[2];

		parameters[0] = new Parameter();
		parameters[0].name = "member";
		parameters[0].description = "Name/Id of the member whose log file will be displayed";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "lines";
		parameters[1].description = "Number of lines from the log file to display. The maximum is 100";
		parameters[1].required = false;



	}
	
}