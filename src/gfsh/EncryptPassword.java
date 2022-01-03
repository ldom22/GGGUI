/****************************************************************************************************/
/*                                                                                                  */
/* File: EncryptPassword.java                                                                       */
/* Description: EncryptPassword command implementation                                              */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class EncryptPassword extends Command {
	
	public EncryptPassword() {
		name = "encrypt password";
		description = "Encrypt a password for use in data source configuration";

		parameters = new Parameter[1];

		parameters[0] = new Parameter();
		parameters[0].name = "password";
		parameters[0].description = "Password to be encrypted";
		parameters[0].required = true;



	}
	
}