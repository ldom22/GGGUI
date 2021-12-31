public class ListFunctions extends Command {
	
	public ListFunctions() {
		name = "list functions ";
		description = "Display a list of registered functions";

		parameters = new Parameter[3];

		parameters[0] = new Parameter();
		parameters[0].name = "matches";
		parameters[0].description = "Pattern that the function ID must match in order to be included";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "group";
		parameters[1].description = "Group(s) of members for which functions will be displayed";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "member";
		parameters[2].description = "Name/Id of the member(s) for which functions will be displayed";
		parameters[2].required = false;



	}
	
}