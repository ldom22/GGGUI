/****************************************************************************************************/
/*                                                                                                  */
/* File: StatusClusterConfigService.java                                                            */
/* Description: StatusClusterConfigService command implementation                                   */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class StatusClusterConfigService extends Command {
	
	public StatusClusterConfigService() {
		name = "status cluster-config-service";
		description = "Displays the status of cluster configuration service on all the locators with enable-cluster-configuration set to true";
	}
	
}