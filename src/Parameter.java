/****************************************************************************************************/
/*                                                                                                  */
/* File: Parameter.java                                                                             */
/* Description: Single command parameter representation                                             */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class Parameter {
	
	String name;
	String description;
	String[] options;
	boolean required;
	
	public Parameter() {
		name = null;
		description = null;
		options = null;
		required = false;
	}
	
}