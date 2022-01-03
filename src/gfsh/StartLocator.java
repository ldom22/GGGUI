/****************************************************************************************************/
/*                                                                                                  */
/* File: StartLocator.java                                                                          */
/* Description: StartLocator command implementation                                                 */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class StartLocator extends Command {
	
	public StartLocator() {
		name = "start locator";
		description = "Start a Locator";

		parameters = new Parameter[22];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "The member name to give this Locator in the GemFire cluster";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "bind-address";
		parameters[1].description = "IP address on which the Locator will be bound (default is all local addresses)";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "classpath";
		parameters[2].description = "Location of user application classes required by the Locator";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "force";
		parameters[3].description = "Whether to allow the PID file from a previous Locator run to be overwritten";
		parameters[3].required = false;
		parameters[3].options = new String[2];
		parameters[3].options[0] = "true";
		parameters[3].options[1] = "false";


		parameters[4] = new Parameter();
		parameters[4].name = "group";
		parameters[4].description = "Group(s) the Locator will be a part of";
		parameters[4].required = false;


		parameters[5] = new Parameter();
		parameters[5].name = "hostname-for-clients";
		parameters[5].description = "Hostname or IP address that will be sent to clients so they can connect to this Locator";
		parameters[5].required = false;


		parameters[6] = new Parameter();
		parameters[6].name = "include-system-classpath";
		parameters[6].description = "Includes the System CLASSPATH on the Locator's CLASSPATH";
		parameters[6].required = false;
		parameters[6].options = new String[2];
		parameters[6].options[0] = "true";
		parameters[6].options[1] = "false";


		parameters[7] = new Parameter();
		parameters[7].name = "locators";
		parameters[7].description = "Sets the list of Locators used by this Locator to join the appropriate GemFire cluster";
		parameters[7].required = false;


		parameters[8] = new Parameter();
		parameters[8].name = "log-level";
		parameters[8].description = "Sets the level of output logged to the Locator log file";
		parameters[8].required = false;
		parameters[8].options = new String[8];
		parameters[8].options[0] = "finest";
		parameters[8].options[1] = "finer";
		parameters[8].options[2] = "fine";
		parameters[8].options[3] = "config";
		parameters[8].options[4] = "info";
		parameters[8].options[5] = "warning";
		parameters[8].options[6] = "severe";
		parameters[8].options[7] = "none";


		parameters[9] = new Parameter();
		parameters[9].name = "mcast-address";
		parameters[9].description = "The IP address or hostname used to bind the UPD socket for multi-cast networking so the Locator can locate other members in the GemFire cluster";
		parameters[9].required = false;


		parameters[10] = new Parameter();
		parameters[10].name = "mcast-port";
		parameters[10].description = "Sets the port used for multi-cast networking so the Locator can locate other members of the GemFire cluster";
		parameters[10].required = false;


		parameters[11] = new Parameter();
		parameters[11].name = "port";
		parameters[11].description = "Port the Locator will listen on";
		parameters[11].required = false;


		parameters[12] = new Parameter();
		parameters[12].name = "dir";
		parameters[12].description = "Directory in which the Locator will be started and ran";
		parameters[12].required = false;


		parameters[13] = new Parameter();
		parameters[13].name = "properties-file";
		parameters[13].description = "The gemfire.properties file for configuring the Locator's distributed system";
		parameters[13].required = false;


		parameters[14] = new Parameter();
		parameters[14].name = "security-properties-file";
		parameters[14].description = "The gfsecurity.properties file for configuring the Locator's security configuration in the distributed system";
		parameters[14].required = false;


		parameters[15] = new Parameter();
		parameters[15].name = "initial-heap";
		parameters[15].description = "Initial size of the heap in the same format as the JVM -Xms parameter";
		parameters[15].required = false;


		parameters[16] = new Parameter();
		parameters[16].name = "max-heap";
		parameters[16].description = "Maximum size of the heap in the same format as the JVM -Xmx parameter";
		parameters[16].required = false;


		parameters[17] = new Parameter();
		parameters[17].name = "J";
		parameters[17].description = "Argument passed to the JVM on which the Locator will run";
		parameters[17].required = false;


		parameters[18] = new Parameter();
		parameters[18].name = "connect";
		parameters[18].description = "When connect is set to false , Gfsh does not automatically connect to the locator which is started using this command";
		parameters[18].required = false;
		parameters[18].options = new String[2];
		parameters[18].options[0] = "true";
		parameters[18].options[1] = "false";


		parameters[19] = new Parameter();
		parameters[19].name = "enable-cluster-configuration";
		parameters[19].description = "When enable-cluster-configuration is set to true, locator hosts and serves cluster configuration";
		parameters[19].required = false;
		parameters[19].options = new String[2];
		parameters[19].options[0] = "true";
		parameters[19].options[1] = "false";


		parameters[20] = new Parameter();
		parameters[20].name = "load-cluster-configuration-from-dir";
		parameters[20].description = "If set to true, the locator loads the cluster configuration from the cluster_config directory";
		parameters[20].required = false;
		parameters[20].options = new String[2];
		parameters[20].options[0] = "true";
		parameters[20].options[1] = "false";


		parameters[21] = new Parameter();
		parameters[21].name = "cluster-config-dir";
		parameters[21].description = "Directory used by the cluster configuration service to store the cluster configuration on the filesystem";
		parameters[21].required = false;



	}
	
}