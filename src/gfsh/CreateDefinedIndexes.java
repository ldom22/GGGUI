/****************************************************************************************************/
/*                                                                                                  */
/* File: CreateDefinedIndexes.java                                                                  */
/* Description: CreateDefinedIndexes command implementation                                         */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class CreateDefinedIndexes extends Command {
	
	public CreateDefinedIndexes() {
		
		name = "create defined indexes ";
		description = "Creates all the defined indexes";

		parameters = new Parameter[2];

		parameters[0] = new Parameter();
		parameters[0].name = "member";
		parameters[0].description = "Name/Id of the member in which the index will be created";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "group";
		parameters[1].description = "Group of members in which the index will be created";
		parameters[1].required = false;





	}
	
}