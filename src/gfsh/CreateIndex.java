/****************************************************************************************************/
/*                                                                                                  */
/* File: CreateIndex.java                                                                           */
/* Description: CreateIndex command implementation                                                  */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class CreateIndex extends Command {
	
	public CreateIndex() {
		name = "create index";
		description = "Create an index that can be used when executing queries";

		parameters = new Parameter[6];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Name of the index to create";
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
		parameters[3].name = "member";
		parameters[3].description = "Name/Id of the member in which the index will be created";
		parameters[3].required = false;


		parameters[4] = new Parameter();
		parameters[4].name = "type";
		parameters[4].description = "Type of the index";
		parameters[4].required = false;
		parameters[4].options = new String[3];
		parameters[4].options[0] = "range";
		parameters[4].options[1] = "key";
		parameters[4].options[2] = "hash";


		parameters[5] = new Parameter();
		parameters[5].name = "group";
		parameters[5].description = "Group of members in which the index will be created";
		parameters[5].required = false;



	}
	
}