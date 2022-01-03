/****************************************************************************************************/
/*                                                                                                  */
/* File: Gc.java                                                                                    */
/* Description: Gc command implementation                                                           */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class Gc extends Command {
	
	public Gc() {
		name = "gc ";
		description = "Force GC (Garbage Collection) on a member or members. The default is for garbage collection to occur on all caching members";

		parameters = new Parameter[2];

		parameters[0] = new Parameter();
		parameters[0].name = "group";
		parameters[0].description = "Group(s) of members on which garbage collection will be done";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "member";
		parameters[1].description = "Name/Id of the member on which garbage collection will be done";
		parameters[1].required = false;



	}
	
}