/****************************************************************************************************/
/*                                                                                                  */
/* File: AlterRuntime.java                                                                          */
/* Description: Alter Runtime command implementation                                                */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class AlterRuntime extends Command {
	
	public AlterRuntime(){
		name = "alter runtime ";
		description = "Alter a subset of member or members configuration properties while running";

		parameters = new Parameter[15];

		parameters[0] = new Parameter();
		parameters[0].name = "member";
		parameters[0].description = "Name/Id of the member in whose configuration will be altered";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "group";
		parameters[1].description = "Name/Id of the member in whose configuration will be altered";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "archive-disk-space-limit";
		parameters[2].description = "Archive disk space limit in megabytes";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "archive-file-size-limit";
		parameters[3].description = "Archive file size limit in megabytes";
		parameters[3].required = false;


		parameters[4] = new Parameter();
		parameters[4].name = "log-disk-space-limit";
		parameters[4].description = "Log disk space limit in megabytes";
		parameters[4].required = false;


		parameters[5] = new Parameter();
		parameters[5].name = "log-file-size-limit";
		parameters[5].description = "Log file size limit in megabytes";
		parameters[5].required = false;


		parameters[6] = new Parameter();
		parameters[6].name = "log-level";
		parameters[6].description = "Log level";
		parameters[6].required = false;
		parameters[6].options = new String[9];
		parameters[6].options[0] = "none";
		parameters[6].options[1] = "error";
		parameters[6].options[2] = "info";
		parameters[6].options[3] = "config";
		parameters[6].options[4] = "warning";
		parameters[6].options[5] = "severe";
		parameters[6].options[6] = "fine";
		parameters[6].options[7] = "finer";
		parameters[6].options[8] = "finest";


		parameters[7] = new Parameter();
		parameters[7].name = "statistic-archive-file";
		parameters[7].description = "File to which the statistics will be written";
		parameters[7].required = false;


		parameters[8] = new Parameter();
		parameters[8].name = "statistic-sample-rate";
		parameters[8].description = "Statistic sampling rate in milliseconds";
		parameters[8].required = false;


		parameters[9] = new Parameter();
		parameters[9].name = "enable-statistics";
		parameters[9].description = "Whether statistic sampling should be enabled";
		parameters[9].required = false;
		parameters[9].options = new String[2];
		parameters[9].options[0] = "false";
		parameters[9].options[1] = "true";


		parameters[10] = new Parameter();
		parameters[10].name = "copy-on-read";
		parameters[10].description = "Sets the copy on read feature for cache read operations";
		parameters[10].required = false;
		parameters[10].options = new String[2];
		parameters[10].options[0] = "false";
		parameters[10].options[1] = "true";


		parameters[11] = new Parameter();
		parameters[11].name = "lock-lease";
		parameters[11].description = "Sets the length, in seconds, of distributed lock leases obtained by this cache";
		parameters[11].required = false;


		parameters[12] = new Parameter();
		parameters[12].name = "lock-timeout";
		parameters[12].description = "Sets the number of seconds a cache operation may wait to obtain a distributed lock lease before timing out";
		parameters[12].required = false;


		parameters[13] = new Parameter();
		parameters[13].name = "message-sync-interval";
		parameters[13].description = "Sets the frequency (in seconds) at which a message will be sent by the primary cache-server node to all the secondary cache-server nodes to remove the events which have already been dispatched from the queue";
		parameters[13].required = false;


		parameters[14] = new Parameter();
		parameters[14].name = "search-timeout";
		parameters[14].description = "Sets the number of seconds a cache get operation can spend searching for a value";
		parameters[14].required = false;



	}

}