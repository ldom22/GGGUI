/****************************************************************************************************/
/*                                                                                                  */
/* File: ListIndexes.java                                                                           */
/* Description: ListIndexes command implementation                                                  */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class ListIndexes extends Command {
	
	public ListIndexes() {
		name = "list indexes ";
		description = "Display the list of indexes created for all members";

		parameters = new Parameter[1];

		parameters[0] = new Parameter();
		parameters[0].name = "with-stats";
		parameters[0].description = "Whether statistics should also be displayed";
		parameters[0].required = false;
		parameters[0].options = new String[2];
		parameters[0].options[0] = "true";
		parameters[0].options[1] = "false";



	}
	
}