/****************************************************************************************************/
/*                                                                                                  */
/* File: DestroyIndex.java                                                                          */
/* Description: DestroyIndex command implementation                                                 */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class DestroyIndex extends Command {
	
	public DestroyIndex() {
		name = "destroy index ";
		description = "Destroy/Remove the specified index";

		parameters = new Parameter[4];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Name of the index to remove";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "region";
		parameters[1].description = "Name/Path of the region from which the index will be removed";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "member";
		parameters[2].description = "Name/Id of the member from which the index will be removed";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "group";
		parameters[3].description = "Group of members from which the index will be removed";
		parameters[3].required = false;



	}
	
}