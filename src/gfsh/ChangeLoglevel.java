/****************************************************************************************************/
/*                                                                                                  */
/* File: ChangeLoglevel.java                                                                        */
/* Description: Change loglevel command implementation                                              */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class ChangeLoglevel extends Command {
	
	public ChangeLoglevel(){
		name = "change loglevel";
		description = "This command changes log-level run time on specified servers";
		
		parameters = new Parameter[3];
		
		parameters[0] = new Parameter();
		parameters[0].name = "members";
		parameters[0].description = "Name/Id of the member to change the log-level";
		parameters[0].required = false;
		
		parameters[1] = new Parameter();
		parameters[1].name = "groups";
		parameters[1].description = "Groups of members to change the log-level";
		parameters[0].required = false;
		
		parameters[2] = new Parameter();
		parameters[2].name = "loglevel";
		parameters[2].description = "Log level to change to";
		parameters[0].required = true;
		
	}
	
}