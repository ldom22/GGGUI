/****************************************************************************************************/
/*                                                                                                  */
/* File: Exit.java                                                                                  */
/* Description: Exit command implementation                                                         */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class Exit extends Command {
	
	public Exit() {
		name = "exit";
		description = "Exit GFSH and return control back to the calling process";
	}
	
}