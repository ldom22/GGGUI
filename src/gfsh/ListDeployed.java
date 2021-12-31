public class ListDeployed extends Command {
	
	public ListDeployed() {
		name = "list deployed ";
		description = "Display a list of JARs that were deployed to members using the deploy command";

		parameters = new Parameter[1];

		parameters[0] = new Parameter();
		parameters[0].name = "group";
		parameters[0].description = "Group(s) of members for which deployed JARs will be displayed";
		parameters[0].required = false;



	}
	
}