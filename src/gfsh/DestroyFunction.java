/****************************************************************************************************/
/*                                                                                                  */
/* File: DestroyFunction.java                                                                       */
/* Description: DestroyFunction command implementation                                              */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class DestroyFunction extends Command {
	
	public DestroyFunction() {
		name = "destroy function";
		description = "Destroy/Unregister a function. The default is for the function to be unregistered from all members";

		parameters = new Parameter[3];

		parameters[0] = new Parameter();
		parameters[0].name = "id";
		parameters[0].description = "Destroy/Unregister a function. The default is for the function to be unregistered from all members";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "groups";
		parameters[1].description = "Groups of members from which this function will be unregistered";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "member";
		parameters[2].description = "Name/Id of the member from which this function will be unregistered";
		parameters[2].required = false;



	}
	
}