/****************************************************************************************************/
/*                                                                                                  */
/* File: AlterRegion.java                                                                           */
/* Description: Alter Region command implementation                                                 */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class AlterRegion extends Command {
	
	public AlterRegion(){
		name = "alter region";
		description = "Alter a region with the given path and configuration";

		parameters = new Parameter[17];

		parameters[0] = new Parameter();
		parameters[0].name = "name";
		parameters[0].description = "Name/Path of the region to be altered";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "group";
		parameters[1].description = "Group(s) of members on which the region will be altered";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "entry-idle-time-expiration";
		parameters[2].description = "How long the region's entries can remain in the cache without being accessed. Default is no expiration";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "entry-idle-time-expiration-action";
		parameters[3].description = "Action to be taken on an entry that has exceeded the idle expiration";
		parameters[3].required = false;


		parameters[4] = new Parameter();
		parameters[4].name = "entry-time-to-live-expiration";
		parameters[4].description = "How long the region's entries can remain in the cache without being accessed or updated";
		parameters[4].required = false;


		parameters[5] = new Parameter();
		parameters[5].name = "entry-time-to-live-expiration-action";
		parameters[5].description = "Action to be taken on an entry that has exceeded the TTL expiration";
		parameters[5].required = false;


		parameters[6] = new Parameter();
		parameters[6].name = "region-idle-time-expiration";
		parameters[6].description = "How long the region can remain in the cache without being accessed";
		parameters[6].required = false;


		parameters[7] = new Parameter();
		parameters[7].name = "region-idle-time-expiration-action";
		parameters[7].description = "How long the region can remain in the cache without being accessed";
		parameters[7].required = false;


		parameters[8] = new Parameter();
		parameters[8].name = "region-time-to-live-expiration";
		parameters[8].description = "How long the region can remain in the cache without being accessed or updated";
		parameters[8].required = false;


		parameters[9] = new Parameter();
		parameters[9].name = "region-time-to-live-expiration-action";
		parameters[9].description = "Action to be taken on a region that has exceeded the idle expiration";
		parameters[9].required = false;


		parameters[10] = new Parameter();
		parameters[10].name = "cache-listener";
		parameters[10].description = "Fully qualified class name of a plug-in to be instantiated for receiving after-event notification of changes to the region and its entries";
		parameters[10].required = false;


		parameters[11] = new Parameter();
		parameters[11].name = "cache-loader";
		parameters[11].description = "Fully qualified class name of a plug-in to be instantiated for receiving notification of cache misses in the region. At most, one cache loader can be defined in each member for the region. For distributed regions, a cache loader may be invoked remotely from other members that have the region defined";
		parameters[11].required = false;


		parameters[12] = new Parameter();
		parameters[12].name = "cache-writer";
		parameters[12].description = "Fully qualified class name of a plug-in to be instantiated for receiving before-event notification of changes to the region and its entries. The plug-in may cancel the event. At most, one cache writer can be defined in each member for the region";
		parameters[12].required = false;


		parameters[13] = new Parameter();
		parameters[13].name = "async-event-queue-id";
		parameters[13].description = "IDs of the Async Event Queues that will be used for write-behind operations";
		parameters[13].required = false;


		parameters[14] = new Parameter();
		parameters[14].name = "gateway-sender-id";
		parameters[14].description = "IDs of the Gateway Senders to which data will be routed";
		parameters[14].required = false;


		parameters[15] = new Parameter();
		parameters[15].name = "enable-cloning";
		parameters[15].description = "Determines how fromDelta applies deltas to the local cache for delta propagation";
		parameters[15].required = false;
		parameters[15].options = new String[2];
		parameters[15].options[0] = "true";
		parameters[15].options[1] = "false";


		parameters[16] = new Parameter();
		parameters[16].name = "eviction-max";
		parameters[16].description = "Maximum value for the Eviction Attributes which the Eviction Algorithm uses to determine when to perform its Eviction Action. The unit of the maximum value is determined by the Eviction Algorithm";
		parameters[16].required = false;



	}

}