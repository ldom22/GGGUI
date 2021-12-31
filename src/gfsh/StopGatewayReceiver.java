public class StopGatewayReceiver extends Command {
	
	public StopGatewayReceiver() {
		name = "stop gateway-receiver ";
		description = "";

		parameters = new Parameter[2];

		parameters[0] = new Parameter();
		parameters[0].name = "group";
		parameters[0].description = "Group(s) of members on which to stop the Gateway Receiver";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "member";
		parameters[1].description = "Name/Id of the member on which to stop the Gateway Receiver";
		parameters[1].required = false;



	}
	
}