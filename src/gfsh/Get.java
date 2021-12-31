/****************************************************************************************************/
/*                                                                                                  */
/* File: Get.java                                                                                   */
/* Description: Get command implementation                                                          */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class Get extends Command {
	
	public Get() {
		name = "get";
		description = "Display an entry in a region";

		parameters = new Parameter[5];

		parameters[0] = new Parameter();
		parameters[0].name = "key";
		parameters[0].description = "String or JSON text from which to create the key";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "region";
		parameters[1].description = "Region from which to get the entry";
		parameters[1].required = true;


		parameters[2] = new Parameter();
		parameters[2].name = "key-class";
		parameters[2].description = "Fully qualified class name of the key's type";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "value-class";
		parameters[3].description = "Fully qualified class name of the value's type";
		parameters[3].required = false;


		parameters[4] = new Parameter();
		parameters[4].name = "load-on-cache-miss";
		parameters[4].description = "Explicitly enables or disables the use of any registered CacheLoaders on the specified Region when retrieving a value for the specified Key on Cache misses";
		parameters[4].required = false;
		parameters[4].options = new String[2];
		parameters[4].options[0] = "true";
		parameters[4].options[1] = "false";


	}
	
}