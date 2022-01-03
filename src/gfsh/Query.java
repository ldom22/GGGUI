/****************************************************************************************************/
/*                                                                                                  */
/* File: Query.java                                                                                 */
/* Description: Query command implementation                                                        */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class Query extends Command {
	
	public Query() {
		name = "query";
		description = "Run the specified OQL query as a single quoted string and display the results";

		parameters = new Parameter[3];

		parameters[0] = new Parameter();
		parameters[0].name = "query";
		parameters[0].description = "The OQL string";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "step-name";
		parameters[1].description = "Step name";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "interactive";
		parameters[2].description = "If false then all results will be displayed at once";
		parameters[2].required = false;
		parameters[2].options = new String[2];
		parameters[2].options[0] = "false";
		parameters[2].options[1] = "true";


	}
	
}