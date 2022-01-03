/****************************************************************************************************/
/*                                                                                                  */
/* File: ListRegions.java                                                                           */
/* Description: ListRegions command implementation                                                  */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

import javax.swing.table.*;

public class ListRegions extends Command {
	
	public ListRegions(){
		name = "list regions";
		description = "Displays regions of a member or members";
		
		parameters = new Parameter[2];
		
		parameters[0] = new Parameter();
		parameters[0].name = "group";
		parameters[0].description = "Group of members for which regions will be displayed";
		parameters[0].required = false;
		
		parameters[1] = new Parameter();
		parameters[1].name = "member";
		parameters[1].description = "Name/Id of the member for which regions will be displayed";
		parameters[1].required = false;
	}

}