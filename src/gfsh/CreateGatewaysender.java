/****************************************************************************************************/
/*                                                                                                  */
/* File: CreateGatewaysender.java                                                                   */
/* Description: CreateGatewaysender command implementation                                          */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class CreateGatewaysender extends Command {
	
	public CreateGatewaysender() {
		name = "create gateway-sender";
		description = "Create the gateway sender on a member or members";

		parameters = new Parameter[20];

		parameters[0] = new Parameter();
		parameters[0].name = "id";
		parameters[0].description = "Id of the GatewaySender";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "remote-distributed-system-id";
		parameters[1].description = "Id of the remote distributed system to which the sender will send events";
		parameters[1].required = true;


		parameters[2] = new Parameter();
		parameters[2].name = "group";
		parameters[2].description = "Group(s) of members on which to create the Gateway Sender";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "member";
		parameters[3].description = "Name/Id of the member on which to create the Gateway Sender";
		parameters[3].required = false;


		parameters[4] = new Parameter();
		parameters[4].name = "parallel";
		parameters[4].description = "Whether this is Parallel GatewaySender";
		parameters[4].required = false;


		parameters[5] = new Parameter();
		parameters[5].name = "manual-start";
		parameters[5].description = "Whether manual start is to be enabled or the sender will start automatically after creation";
		parameters[5].required = false;


		parameters[6] = new Parameter();
		parameters[6].name = "socket-buffer-size";
		parameters[6].description = "The buffer size of the socket connection between this GatewaySender and its receiving GatewayReceiver";
		parameters[6].required = false;


		parameters[7] = new Parameter();
		parameters[7].name = "socket-read-timeout";
		parameters[7].description = "The amount of time in milliseconds that a socket read between a sending GatewaySender and its receiving GatewayReceiver will block";
		parameters[7].required = false;


		parameters[8] = new Parameter();
		parameters[8].name = "enable-batch-conflation";
		parameters[8].description = "Whether batch conflation is to be enabled for a GatewaySender";
		parameters[8].required = false;


		parameters[9] = new Parameter();
		parameters[9].name = "batch-size";
		parameters[9].description = "The batch size for the GatewaySender";
		parameters[9].required = false;


		parameters[10] = new Parameter();
		parameters[10].name = "batch-time-interval";
		parameters[10].description = "The batch time interval for the GatewaySender";
		parameters[10].required = false;


		parameters[11] = new Parameter();
		parameters[11].name = "enable-persistence";
		parameters[11].description = "Whether persistence is to be enabled for the GatewaySender";
		parameters[11].required = false;


		parameters[12] = new Parameter();
		parameters[12].name = "disk-store-name";
		parameters[12].description = "The disk store name to be configured for overflow or persistence";
		parameters[12].required = false;


		parameters[13] = new Parameter();
		parameters[13].name = "disk-synchronous";
		parameters[13].description = "Whether writes to the disk in case of persistence are synchronous";
		parameters[13].required = false;


		parameters[14] = new Parameter();
		parameters[14].name = "maximum-queue-memory";
		parameters[14].description = "The maximum amount of memory (in MB) for a GatewaySender's queue";
		parameters[14].required = false;


		parameters[15] = new Parameter();
		parameters[15].name = "alert-threshold";
		parameters[15].description = "The alert threshold for entries in a GatewaySender's queue";
		parameters[15].required = false;


		parameters[16] = new Parameter();
		parameters[16].name = "dispatcher-threads";
		parameters[16].description = "The number of dispatcher threads working for this GatewaySender. When dispatcher threads is set to > 1, appropriate order policy is required to be set";
		parameters[16].required = false;


		parameters[17] = new Parameter();
		parameters[17].name = "order-policy";
		parameters[17].description = "The order policy followed while dispatching the events to remote distributed system. Order policy is set only when dispatcher threads are > 1";
		parameters[17].required = false;
		parameters[17].options = new String[3];
		parameters[17].options[0] = "THREAD";
		parameters[17].options[1] = "KEY";
		parameters[17].options[2] = "PARTITION";


		parameters[18] = new Parameter();
		parameters[18].name = "gateway-event-filter";
		parameters[18].description = "The list of fully qualified class names of GatewayEventFilters to be associated with the GatewaySender";
		parameters[18].required = false;


		parameters[19] = new Parameter();
		parameters[19].name = "gateway-transport-filter";
		parameters[19].description = "The fully qualified class name of GatewayTransportFilter to be added to the GatewaySender";
		parameters[19].required = false;



	}
	
}