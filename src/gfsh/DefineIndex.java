/****************************************************************************************************/
/*                                                                                                  */
/* File: DefineIndex.java                                                                           */
/* Description: DefineIndex command implementation                                                  */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class DefineIndex extends Command {
	
	public DefineIndex() {
		name = "define index";
		description = "Define an index that can be used when executing queries";

		parameters = new Parameter[4];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Name of the index";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "expression";
		parameters[1].description = "Field of the region values that are referenced by the index";
		parameters[1].required = true;


		parameters[2] = new Parameter();
		parameters[2].name = "region";
		parameters[2].description = "Name/Path of the region which corresponds to the from clause in a query";
		parameters[2].required = true;


		parameters[3] = new Parameter();
		parameters[3].name = "type";
		parameters[3].description = "Type of the index";
		parameters[3].required = false;
		parameters[3].options = new String[3];
		parameters[3].options[0] = "range";
		parameters[3].options[1] = "key";
		parameters[3].options[2] = "hash";


	}
	
}