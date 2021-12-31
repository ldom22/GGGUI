public class ExecuteFunction extends Command {
	
	public ExecuteFunction() {
		name = "execute function";
		description = "Execute the function with the specified ID. By default will execute on all members";

		parameters = new Parameter[7];

		parameters[0] = new Parameter();
		parameters[0].name = "id";
		parameters[0].description = "ID of the function to execute";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "groups";
		parameters[1].description = "Groups of members on which the function will be executed";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "member";
		parameters[2].description = "Name/Id of the member on which the function will be executed";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "region";
		parameters[3].description = "Region on which the data dependent function will be executed";
		parameters[3].required = false;


		parameters[4] = new Parameter();
		parameters[4].name = "arguments";
		parameters[4].description = "Arguments to the function in comma separated String format";
		parameters[4].required = false;


		parameters[5] = new Parameter();
		parameters[5].name = "result-collector";
		parameters[5].description = "Fully qualified class name of the ResultCollector to instantiate for gathering results";
		parameters[5].required = false;


		parameters[6] = new Parameter();
		parameters[6].name = "filter";
		parameters[6].description = "Key list which causes the function to only be executed on members which have entries with these keys";
		parameters[6].required = false;

	}
	
}