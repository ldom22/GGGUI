/****************************************************************************************************/
/*                                                                                                  */
/* File: CreateAsynceventqueue.java                                                                 */
/* Description: CreateAsynceventqueue command implementation                                        */
/* Created: 2021-2022 in Mexico                                                                     */
/* License type: Apache                                                                             */
/*                                                                                                  */
/* Author: Luis Olea                                                                                */
/*                                                                                                  */
/****************************************************************************************************/

public class CreateAsynceventqueue extends Command {
	
	public CreateAsynceventqueue() {
		name = "create async-event-queue";
		description = "Create Async Event Queue";

		parameters = new Parameter[16];

		parameters[0] = new Parameter();
		parameters[0].name = "id";
		parameters[0].description = "ID of the queue to be created";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "listener";
		parameters[1].description = "Fully qualified class name of the AsyncEventListener for this queue";
		parameters[1].required = true;


		parameters[2] = new Parameter();
		parameters[2].name = "group";
		parameters[2].description = "Group(s) of members on which queue will be created. If no group is specified the queue will be created on all members";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "parallel";
		parameters[3].description = "Whether this queue is parallel";
		parameters[3].required = false;
		parameters[3].options = new String[2];
		parameters[3].options[0] = "true";
		parameters[3].options[1] = "false";


		parameters[4] = new Parameter();
		parameters[4].name = "enable-batch-conflation";
		parameters[4].description = "Whether to enable batch conflation";
		parameters[4].required = false;
		parameters[4].options = new String[2];
		parameters[4].options[0] = "true";
		parameters[4].options[1] = "false";


		parameters[5] = new Parameter();
		parameters[5].name = "batch-size";
		parameters[5].description = "Maximum number of events that a batch can contain";
		parameters[5].required = false;


		parameters[6] = new Parameter();
		parameters[6].name = "batch-time-interval";
		parameters[6].description = "Maximum amount of time, in ms, that can elapse before a batch is delivered";
		parameters[6].required = false;


		parameters[7] = new Parameter();
		parameters[7].name = "persistent";
		parameters[7].description = "Whether events should be persisted to a disk store";
		parameters[7].required = false;
		parameters[7].options = new String[2];
		parameters[7].options[0] = "true";
		parameters[7].options[1] = "false";


		parameters[8] = new Parameter();
		parameters[8].name = "disk-store";
		parameters[8].description = "Disk store to be used by this queue";
		parameters[8].required = false;


		parameters[9] = new Parameter();
		parameters[9].name = "disk-synchronous";
		parameters[9].description = "Whether disk writes are synchronous";
		parameters[9].required = false;
		parameters[9].options = new String[2];
		parameters[9].options[0] = "true";
		parameters[9].options[1] = "false";


		parameters[10] = new Parameter();
		parameters[10].name = "max-queue-memory";
		parameters[10].description = "Maximum amount of memory, in megabytes, that the queue can consume before overflowing to disk";
		parameters[10].required = false;


		parameters[11] = new Parameter();
		parameters[11].name = "dispatcher-threads";
		parameters[11].description = "Number of threads to use for sending events";
		parameters[11].required = false;


		parameters[12] = new Parameter();
		parameters[12].name = "order-policy";
		parameters[12].description = "Policy for dispatching events when --dispatcher-threads is > 1";
		parameters[12].required = false;
		parameters[12].options = new String[3];
		parameters[12].options[0] = "THREAD";
		parameters[12].options[1] = "KEY";
		parameters[12].options[2] = "PARTITION";


		parameters[13] = new Parameter();
		parameters[13].name = "gateway-event-filter";
		parameters[13].description = "List of fully qualified class names of GatewayEventFilters for this queue";
		parameters[13].required = false;


		parameters[14] = new Parameter();
		parameters[14].name = "gateway-event-substitution-filter";
		parameters[14].description = "Fully qualified class name of the GatewayEventSubstitutionFilter for this queue";
		parameters[14].required = false;


		parameters[15] = new Parameter();
		parameters[15].name = "listener-param";
		parameters[15].description = "Parameter name for the AsyncEventListener";
		parameters[15].required = false;



	}
	
}