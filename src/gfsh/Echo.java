public class Echo extends Command {
	
	public Echo() {
		name = "echo";
		description = "Echo the given text which may include system and user variables";

		parameters = new Parameter[1];

		parameters[0] = new Parameter();
		parameters[0].name = "string";
		parameters[0].description = "String to be echoed";
		parameters[0].required = true;



	}
	
}