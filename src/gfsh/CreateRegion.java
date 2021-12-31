/****************************************************************************************************/
/*                                                                                                  */
/* File: CreateRegion.java                                                                          */
/* Description: CreateRegion command implementation                                                 */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class CreateRegion extends Command {
	
	public CreateRegion() {
		name = "create region";
		description = "Create a region with the given path and configuration";

		parameters = new Parameter[36];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Name/Path of the region to be created";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "type";
		parameters[1].description = "Type of region to create";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "template-region";
		parameters[2].description = "Name/Path of the region whose attributes should be duplicated when creating this region";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "group";
		parameters[3].description = "Group(s) of members on which the region will be created";
		parameters[3].required = false;


		parameters[4] = new Parameter();
		parameters[4].name = "skip-if-exists";
		parameters[4].description = "Skip region ceation if the region already exists";
		parameters[4].required = false;
		parameters[4].options = new String[2];
		parameters[4].options[0] = "true";
		parameters[4].options[1] = "false";


		parameters[5] = new Parameter();
		parameters[5].name = "key-constraint";
		parameters[5].description = "Fully qualified class name of the objects allowed as region keys";
		parameters[5].required = false;


		parameters[6] = new Parameter();
		parameters[6].name = "value-constraint";
		parameters[6].description = "Fully qualified class name of the objects allowed as region values";
		parameters[6].required = false;


		parameters[7] = new Parameter();
		parameters[7].name = "enable-statistics";
		parameters[7].description = "Whether to gather statistics for the region";
		parameters[7].required = false;
		parameters[7].options = new String[2];
		parameters[7].options[0] = "true";
		parameters[7].options[1] = "false";


		parameters[8] = new Parameter();
		parameters[8].name = "entry-idle-time-expiration";
		parameters[8].description = "How long the region's entries can remain in the cache without being accessed";
		parameters[8].required = false;


		parameters[9] = new Parameter();
		parameters[9].name = "entry-idle-time-expiration-action";
		parameters[9].description = "";
		parameters[9].required = false;


		parameters[10] = new Parameter();
		parameters[10].name = "entry-time-to-live-expiration";
		parameters[10].description = "How long the region's entries can remain in the cache without being accessed or updated";
		parameters[10].required = false;


		parameters[11] = new Parameter();
		parameters[11].name = "entry-time-to-live-expiriation-action";
		parameters[11].description = "Action to be taken on an entry that has exceeded the idle expiration";
		parameters[11].required = false;


		parameters[12] = new Parameter();
		parameters[12].name = "region-idle-time-expiration";
		parameters[12].description = "How long the region can remain in the cache without being accessed";
		parameters[12].required = false;


		parameters[13] = new Parameter();
		parameters[13].name = "region-idle-time-expiration-action";
		parameters[13].description = "Action to be taken on a region that has exceeded the idle expiration";
		parameters[13].required = false;


		parameters[14] = new Parameter();
		parameters[14].name = "region-time-to-live-expiration";
		parameters[14].description = "How long the region can remain in the cache without being accessed or updated";
		parameters[14].required = false;


		parameters[15] = new Parameter();
		parameters[15].name = "region-time-to-live-expiration-action";
		parameters[15].description = "Action to be taken on a region that has exceeded the TTL expiration";
		parameters[15].required = false;


		parameters[16] = new Parameter();
		parameters[16].name = "disk-store";
		parameters[16].description = "Disk Store to be used by this region";
		parameters[16].required = false;


		parameters[17] = new Parameter();
		parameters[17].name = "enable-synchronous-disk";
		parameters[17].description = "Whether writes are done synchronously for regions that persist data to disk";
		parameters[17].required = false;
		parameters[17].options = new String[2];
		parameters[17].options[0] = "true";
		parameters[17].options[1] = "false";


		parameters[18] = new Parameter();
		parameters[18].name = "enable-async-conflation";
		parameters[18].description = "";
		parameters[18].required = false;


		parameters[19] = new Parameter();
		parameters[19].name = "enable-subscription-conflation";
		parameters[19].description = "Whether the server should conflate its messages to the client";
		parameters[19].required = false;
		parameters[19].options = new String[2];
		parameters[19].options[0] = "true";
		parameters[19].options[1] = "false";


		parameters[20] = new Parameter();
		parameters[20].name = "cache-listener";
		parameters[20].description = "Fully qualified class name of a plug-in to be instantiated for receiving after-event notification of changes to the region and its entries";
		parameters[20].required = false;


		parameters[21] = new Parameter();
		parameters[21].name = "cache-loader";
		parameters[21].description = "Fully qualified class name of a plug-in to be instantiated for receiving notification of cache misses in the region";
		parameters[21].required = false;


		parameters[22] = new Parameter();
		parameters[22].name = "cache-writer";
		parameters[22].description = "Fully qualified class name of a plug-in to be instantiated for receiving before-event notification of changes to the region and its entries";
		parameters[22].required = false;


		parameters[23] = new Parameter();
		parameters[23].name = "async-event-queue-id";
		parameters[23].description = "IDs of the Async Event Queues that will be used for write-behind operations";
		parameters[23].required = false;


		parameters[24] = new Parameter();
		parameters[24].name = "gateway-sender-id";
		parameters[24].description = "IDs of the Gateway Senders to which data will be routed";
		parameters[24].required = false;


		parameters[25] = new Parameter();
		parameters[25].name = "enable-concurrency-checks";
		parameters[25].description = "Whether Region Version Vectors are implemented";
		parameters[25].required = false;
		parameters[25].options = new String[2];
		parameters[25].options[0] = "true";
		parameters[25].options[1] = "false";


		parameters[26] = new Parameter();
		parameters[26].name = "enable-cloning";
		parameters[26].description = "Determines how fromDelta applies deltas to the local cache for delta propagation";
		parameters[26].required = false;
		parameters[26].options = new String[2];
		parameters[26].options[0] = "true";
		parameters[26].options[1] = "false";


		parameters[27] = new Parameter();
		parameters[27].name = "concurrency-level";
		parameters[27].description = "An estimate of the maximum number of application threads that will concurrently access a region entry at one time";
		parameters[27].required = false;


		parameters[28] = new Parameter();
		parameters[28].name = "colocated-with";
		parameters[28].description = "Central Region with which this region should be colocated";
		parameters[28].required = false;


		parameters[29] = new Parameter();
		parameters[29].name = "local-max-memory";
		parameters[29].description = "Sets the maximum amount of memory, in megabytes, to be used by the region in this process";
		parameters[29].required = false;


		parameters[30] = new Parameter();
		parameters[30].name = "recovery-delay";
		parameters[30].description = "Sets the delay in milliseconds that existing members will wait before satisfying redundancy after another member crashes";
		parameters[30].required = false;


		parameters[31] = new Parameter();
		parameters[31].name = "redundant-copies";
		parameters[31].description = "Sets the number of extra copies of buckets desired";
		parameters[31].required = false;
		parameters[31].options = new String[4];
		parameters[31].options[0] = "0";
		parameters[31].options[1] = "1";
		parameters[31].options[2] = "2";
		parameters[31].options[3] = "3";


		parameters[32] = new Parameter();
		parameters[32].name = "startup-recovery-delay";
		parameters[32].description = " Sets the delay in milliseconds that new members will wait before satisfying redundancy";
		parameters[32].required = false;


		parameters[33] = new Parameter();
		parameters[33].name = "total-max-memory";
		parameters[33].description = "Sets the maximum amount of memory, in megabytes, to be used by the region in all processes";
		parameters[33].required = false;


		parameters[34] = new Parameter();
		parameters[34].name = "total-num-buckets";
		parameters[34].description = "Sets the total number of hash buckets to be used by the region in all processes";
		parameters[34].required = false;


		parameters[35] = new Parameter();
		parameters[35].name = "compressor";
		parameters[35].description = "The fully-qualifed class name of the Compressor to use when compressing region entry values";
		parameters[35].required = false;



	}
	
}