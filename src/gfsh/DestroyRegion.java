/****************************************************************************************************/
/*                                                                                                  */
/* File: DestroyRegion.java                                                                         */
/* Description: DestroyRegion command implementation                                                */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class DestroyRegion extends Command {
	
	public DestroyRegion() {
		name = "destroy region";
		description = "Destroy/Remove a region";

		parameters = new Parameter[1];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Name/Path of the region to be removed";
		parameters[0].required = true;



	}
	
}