/****************************************************************************************************/
/*                                                                                                  */
/* File: StartServer.java                                                                           */
/* Description: StartServer command implementation                                                  */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class StartServer extends Command {
	
	public StartServer() {
		name = "start server";
		description = "Start a GemFire Cache Server";

		parameters = new Parameter[41];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "The member name to give this Cache Server in the GemFire cluster";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "assign-buckets";
		parameters[1].description = "Whether to assign buckets to the partitioned regions of the cache on server start";
		parameters[1].required = false;
		parameters[1].options = new String[2];
		parameters[1].options[0] = "true";
		parameters[1].options[1] = "false";


		parameters[2] = new Parameter();
		parameters[2].name = "bind-address";
		parameters[2].description = "The IP address on which the Server will be bound.  By default, the Server is bound to all local addresses";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "cache-xml-file";
		parameters[3].description = "Specifies the name of the XML file or resource to initialize the cache with when it is created";
		parameters[3].required = false;


		parameters[4] = new Parameter();
		parameters[4].name = "classpath";
		parameters[4].description = "Location of user application classes required by the Server";
		parameters[4].required = false;


		parameters[5] = new Parameter();
		parameters[5].name = "disable-default-server";
		parameters[5].description = "Whether the Cache Server will be started by default";
		parameters[5].required = false;
		parameters[5].options = new String[2];
		parameters[5].options[0] = "true";
		parameters[5].options[1] = "false";


		parameters[6] = new Parameter();
		parameters[6].name = "disable-exit-when-out-of-memory";
		parameters[6].description = "Prevents the JVM from exiting when an OutOfMemoryError occurs";
		parameters[6].required = false;
		parameters[6].options = new String[2];
		parameters[6].options[0] = "true";
		parameters[6].options[1] = "false";


		parameters[7] = new Parameter();
		parameters[7].name = "enable-time-statistics";
		parameters[7].description = "Causes additional time-based statistics to be gathered for GemFire operations";
		parameters[7].required = false;
		parameters[7].options = new String[2];
		parameters[7].options[0] = "true";
		parameters[7].options[1] = "false";


		parameters[8] = new Parameter();
		parameters[8].name = "force";
		parameters[8].description = "Whether to allow the PID file from a previous Cache Server run to be overwritten";
		parameters[8].required = false;
		parameters[8].options = new String[2];
		parameters[8].options[0] = "true";
		parameters[8].options[1] = "false";


		parameters[9] = new Parameter();
		parameters[9].name = "include-system-classpath";
		parameters[9].description = "Includes the System CLASSPATH on the Server's CLASSPATH";
		parameters[9].required = false;
		parameters[9].options = new String[2];
		parameters[9].options[0] = "true";
		parameters[9].options[1] = "false";


		parameters[10] = new Parameter();
		parameters[10].name = "properties-file";
		parameters[10].description = "The gemfire.properties file for configuring the Cache Server's distributed system";
		parameters[10].required = false;


		parameters[11] = new Parameter();
		parameters[11].name = "security-properties-file";
		parameters[11].description = "The gfsecurity.properties file for configuring the Server's security configuration in the distributed system";
		parameters[11].required = false;


		parameters[12] = new Parameter();
		parameters[12].name = "group";
		parameters[12].description = "Group(s) the Cache Server will be a part of";
		parameters[12].required = false;


		parameters[13] = new Parameter();
		parameters[13].name = "license-application-cache";
		parameters[13].description = "Specifies the serial number this distributed system member will use unless a license-data-management is also specified";
		parameters[13].required = false;


		parameters[14] = new Parameter();
		parameters[14].name = "license-data-management";
		parameters[14].description = "Specifies the serial number(s) this distributed system member will use";
		parameters[14].required = false;


		parameters[15] = new Parameter();
		parameters[15].name = "locators";
		parameters[15].description = "Sets the list of Locators used by the Cache Server to join the appropriate GemFire cluster";
		parameters[15].required = false;


		parameters[16] = new Parameter();
		parameters[16].name = "locator-wait-time";
		parameters[16].description = "Sets the number of seconds the server will wait for a locator to become available during startup before giving up";
		parameters[16].required = false;


		parameters[17] = new Parameter();
		parameters[17].name = "log-level";
		parameters[17].description = "Sets the level of output logged to the Cache Server log file";
		parameters[17].required = false;
		parameters[17].options = new String[8];
		parameters[17].options[0] = "finest";
		parameters[17].options[1] = "finer";
		parameters[17].options[2] = "fine";
		parameters[17].options[3] = "config";
		parameters[17].options[4] = "info";
		parameters[17].options[5] = "warning";
		parameters[17].options[6] = "severe";
		parameters[17].options[7] = "none";


		parameters[18] = new Parameter();
		parameters[18].name = "mcast-address";
		parameters[18].description = "The IP address or hostname used to bind the UPD socket for multi-cast networking so the Cache Server can locate other members in the GemFire cluster";
		parameters[18].required = false;


		parameters[19] = new Parameter();
		parameters[19].name = "mcast-port";
		parameters[19].description = "Sets the port used for multi-cast networking so the Cache Server can locate other members of the GemFire cluster";
		parameters[19].required = false;


		parameters[20] = new Parameter();
		parameters[20].name = "memcached-port";
		parameters[20].description = "Sets the port that the GemFire memcached service listens on for memcached clients";
		parameters[20].required = false;


		parameters[21] = new Parameter();
		parameters[21].name = "memcached-protocol";
		parameters[21].description = "Sets the protocol that the GemFire memcached service uses";
		parameters[21].required = false;
		parameters[21].options = new String[2];
		parameters[21].options[0] = "ASCII";
		parameters[21].options[1] = "BINARY";


		parameters[22] = new Parameter();
		parameters[22].name = "memcached-bind-address";
		parameters[22].description = "Sets the IP address the GemFire memcached service listens on for memcached clients";
		parameters[22].required = false;


		parameters[23] = new Parameter();
		parameters[23].name = "rebalance";
		parameters[23].description = "Whether to initiate rebalancing across the GemFire cluster";
		parameters[23].required = false;
		parameters[23].options = new String[2];
		parameters[23].options[0] = "true";
		parameters[23].options[1] = "false";


		parameters[24] = new Parameter();
		parameters[24].name = "server-bind-address";
		parameters[24].description = "The IP address that this distributed system's server sockets in a client-server topology will be bound";
		parameters[24].required = false;


		parameters[25] = new Parameter();
		parameters[25].name = "server-port";
		parameters[25].description = "The port that the distributed system's server sockets in a client-server topology will listen on";
		parameters[25].required = false;


		parameters[26] = new Parameter();
		parameters[26].name = "spring-xml-location";
		parameters[26].description = "Specifies the location of a Spring XML configuration file(s) for bootstrapping and configuring a GemFire Server";
		parameters[26].required = false;


		parameters[27] = new Parameter();
		parameters[27].name = "statistic-archive-file";
		parameters[27].description = "The file that statistic samples are written to";
		parameters[27].required = false;


		parameters[28] = new Parameter();
		parameters[28].name = "dir";
		parameters[28].description = "Directory in which the Cache Server will be started and ran";
		parameters[28].required = false;


		parameters[29] = new Parameter();
		parameters[29].name = "initial-heap";
		parameters[29].description = "Initial size of the heap in the same format as the JVM -Xms parameter";
		parameters[29].required = false;


		parameters[30] = new Parameter();
		parameters[30].name = "max-heap";
		parameters[30].description = "Maximum size of the heap in the same format as the JVM -Xmx parameter";
		parameters[30].required = false;


		parameters[31] = new Parameter();
		parameters[31].name = "use-cluster-configuration";
		parameters[31].description = "When set to true, the server requests the configuration from locator's cluster configuration service";
		parameters[31].required = false;
		parameters[31].options = new String[2];
		parameters[31].options[0] = "true";
		parameters[31].options[1] = "false";


		parameters[32] = new Parameter();
		parameters[32].name = "J";
		parameters[32].description = "Argument passed to the JVM on which the Locator will run";
		parameters[32].required = false;


		parameters[33] = new Parameter();
		parameters[33].name = "critical-heap-percentage";
		parameters[33].description = "Set the percentage of heap at or above which the cache is considered in danger of becoming inoperable due to garbage collection pauses or out of memory exceptions";
		parameters[33].required = false;


		parameters[34] = new Parameter();
		parameters[34].name = "eviction-heap-percentage";
		parameters[34].description = "Set the percentage of heap at or above which the eviction should begin on Regions configured for HeapLRU eviction";
		parameters[34].required = false;


		parameters[35] = new Parameter();
		parameters[35].name = "hostname-for-clients";
		parameters[35].description = "Sets the ip address or host name that this cache server is to listen on for client connections";
		parameters[35].required = false;


		parameters[36] = new Parameter();
		parameters[36].name = "max-connections";
		parameters[36].description = "Sets the maxium number of client connections allowed";
		parameters[36].required = false;


		parameters[37] = new Parameter();
		parameters[37].name = "message-time-to-live";
		parameters[37].description = "Sets the time (in seconds) after which a message in the client queue will expire";
		parameters[37].required = false;


		parameters[38] = new Parameter();
		parameters[38].name = "max-message-count";
		parameters[38].description = "Sets maximum number of messages that can be enqueued in a client-queue";
		parameters[38].required = false;


		parameters[39] = new Parameter();
		parameters[39].name = "max-threads";
		parameters[39].description = "Sets the maxium number of threads allowed in this cache server to service client requests";
		parameters[39].required = false;


		parameters[40] = new Parameter();
		parameters[40].name = "socket-buffer-size";
		parameters[40].description = "Sets the buffer size in bytes of the socket connection for this CacheServer";
		parameters[40].required = false;



	}
	
}