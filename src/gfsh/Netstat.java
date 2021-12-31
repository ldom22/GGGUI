public class Netstat extends Command {
	
	public Netstat() {
		name = "netstat ";
		description = "Report network information and statistics via the netstat operating system command";

		parameters = new Parameter[4];

		parameters[0] = new Parameter();
		parameters[0].name = "member";
		parameters[0].description = "Name/Id of the member(s) on which to run the netstat command";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "group";
		parameters[1].description = "Group of members on which to run the netstat command";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "file";
		parameters[2].description = "Text file to which output from the netstat command will be written";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "with-lsof";
		parameters[3].description = "Whether list open files command output should also be displayed";
		parameters[3].required = false;
		parameters[3].options = new String[2];
		parameters[3].options[0] = "true";
		parameters[3].options[1] = "false";


	}
	
}