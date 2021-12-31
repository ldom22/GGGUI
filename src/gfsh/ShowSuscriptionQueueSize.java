public class ShowSuscriptionQueueSize extends Command {
	
	public ShowSuscriptionQueueSize() {
		name = "show subscription-queue-size";
		description = "Shows the number of events in the subscription queue";

		parameters = new Parameter[4];

		parameters[0] = new Parameter();
		parameters[0].name = "durable-client-id";
		parameters[0].description = "The id used to identify the durable client";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "durable-cq-name";
		parameters[1].description = "The name that identifies the cq";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "member";
		parameters[2].description = "Name/Id of the member for which the subscription events are to be counted";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "group";
		parameters[3].description = "Group of members for which the subscription queue events are to be counted";
		parameters[3].required = false;



	}
	
}