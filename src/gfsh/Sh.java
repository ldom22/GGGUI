public class Sh extends Command {
	
	public Sh() {
		name = "sh";
		description = "Allows execution of operating system (OS) commands";

		parameters = new Parameter[2];
		
		parameters[0] = new Parameter();
		parameters[0].name = "command";
		parameters[0].description = "The command to execute";
		parameters[0].required = true;

		parameters[1] = new Parameter();
		parameters[1].name = "use-console";
		parameters[1].description = "Adds </dev/tty >/dev/tty to the user specified command";
		parameters[1].required = false;
		parameters[1].options = new String[2];
		parameters[1].options[0] = "true";
		parameters[1].options[1] = "false";



	}
	
}