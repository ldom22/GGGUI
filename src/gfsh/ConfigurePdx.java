/****************************************************************************************************/
/*                                                                                                  */
/* File: ConfigurePdx.java                                                                          */
/* Description: ConfigurePdx command implementation                                                 */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class ConfigurePdx extends Command {
	
	public ConfigurePdx() {
		name = "configure pdx ";
		description = "Configures GemFire's Portable Data eXchange for all the cache(s) in the cluster";

		parameters = new Parameter[5];

		parameters[0] = new Parameter();
		parameters[0].name = "read-serialized";
		parameters[0].description = "Set to true to have PDX deserialization produce a PdxInstance instead of an instance of the domain class";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "ignore-unread-fields";
		parameters[1].description = "Control whether pdx ignores fields that were unread during deserialization";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "disk-store";
		parameters[2].description = "Named disk store where the PDX type data will be stored";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "auto-serializable-classes";
		parameters[3].description = "the patterns which are matched against domain class names to determine whether they should be serialized";
		parameters[3].required = false;


		parameters[4] = new Parameter();
		parameters[4].name = "portable-auto-serializable-classes";
		parameters[4].description = "the patterns which are matched against domain class names to determine whether they should be serialized";
		parameters[4].required = false;



	}
	
}