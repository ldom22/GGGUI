public class Rebalance extends Command {
	
	public Rebalance() {
		name = "rebalance ";
		description = "Rebalance partitioned regions. The default is for all partitioned regions to be rebalanced";

		parameters = new Parameter[4];

		parameters[0] = new Parameter();
		parameters[0].name = "include-region";
		parameters[0].description = "Partitioned regions to be included when rebalancing. Includes take precedence over excludes";
		parameters[0].required = false;


		parameters[1] = new Parameter();
		parameters[1].name = "exclude-region";
		parameters[1].description = "Partitioned regions to be excluded when rebalancing";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "time-out";
		parameters[2].description = "Time to wait (in seconds) before GFSH returns to a prompt while rebalancing continues in the background. The default is to wait for rebalancing to complete";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "simulate";
		parameters[3].description = "Whether to only simulate rebalancing. The --time-out parameter is not available when simulating";
		parameters[3].required = false;
		parameters[3].options = new String[2];
		parameters[3].options[0] = "true";
		parameters[3].options[1] = "false";



	}
	
}