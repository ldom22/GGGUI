import javax.swing.table.*;

public class ShowMetrics extends Command {
	
	public ShowMetrics() {
		name = "show metrics";
		description = "Display or export metrics for the entire distributed system, a member or a region";

		parameters = new Parameter[5];

		parameters[0] = new Parameter();
		parameters[0].name = "member";
		parameters[0].description = "Name/Id of the member whose metrics will be displayed/exported";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "region";
		parameters[1].description = "Name/Path of the region whose metrics will be displayed/exported";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "file";
		parameters[2].description = "Name of the file to which metrics will be written";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "port";
		parameters[3].description = "Port number of the Cache Server whose metrics are to be displayed/exported. This can only be used along with the --member parameter";
		parameters[3].required = false;


		parameters[4] = new Parameter();
		parameters[4].name = "categories";
		parameters[4].description = "Categories are available depending on the parameters specified";
		parameters[4].required = false;
		parameters[4].options = new String[16];
		parameters[4].options[0] = "cluster";
		parameters[4].options[1] = "cache";
		parameters[4].options[2] = "diskstore";
		parameters[4].options[3] = "query";
		parameters[4].options[4] = "region";
		parameters[4].options[5] = "partition";
		parameters[4].options[6] = "callback";
		parameters[4].options[7] = "eviction";
		parameters[4].options[8] = "member";
		parameters[4].options[9] = "jvm";
		parameters[4].options[10] = "serialization";
		parameters[4].options[11] = "communication";
		parameters[4].options[12] = "function";
		parameters[4].options[13] = "transaction";
		parameters[4].options[14] = "lock";
		parameters[4].options[15] = "distribution";

	}
	
	
	
}