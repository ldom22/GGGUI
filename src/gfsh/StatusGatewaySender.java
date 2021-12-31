public class StatusGatewaySender extends Command {
	
	public StatusGatewaySender() {
		name = "status gateway-sender";
		description = "Display the status of a Gateway Sender";

		parameters = new Parameter[3];

		parameters[0] = new Parameter();
		parameters[0].name = "id";
		parameters[0].description = "ID of the Gateway Sender";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "group";
		parameters[1].description = "Group(s) of Gateway Senders for which to display status";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "member";
		parameters[2].description = "Name/Id of the Gateway Sender for which to display status";
		parameters[2].required = false;



	}
	
}