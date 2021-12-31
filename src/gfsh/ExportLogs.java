public class ExportLogs extends Command {
	
	public ExportLogs() {
		name = "export logs";
		description = "Export the log files for a member or members";

		parameters = new Parameter[8];

		parameters[0] = new Parameter();
		parameters[0].name = "dir";
		parameters[0].description = "Directory to which log files will be written";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "group";
		parameters[1].description = "Group of members whose log files will be exported";
		parameters[1].required = false;


		parameters[2] = new Parameter();
		parameters[2].name = "member";
		parameters[2].description = "Name/Id of the member whose log files will be exported";
		parameters[2].required = false;


		parameters[3] = new Parameter();
		parameters[3].name = "log-level";
		parameters[3].description = "Minimum level of log entries to export. Valid values are: none, error, info, config , fine, finer and finest.  The default is info";
		parameters[3].required = false;


		parameters[4] = new Parameter();
		parameters[4].name = "only-log-level";
		parameters[4].description = "Whether to only include those entries that exactly match the --log-level specified";
		parameters[4].required = false;


		parameters[5] = new Parameter();
		parameters[5].name = "merge-log";
		parameters[5].description = "Whether to merge logs after exporting to the target directory";
		parameters[5].required = false;


		parameters[6] = new Parameter();
		parameters[6].name = "start-time";
		parameters[6].description = "Log entries that occurred after this time will be exported. The default is no limit";
		parameters[6].required = false;


		parameters[7] = new Parameter();
		parameters[7].name = "end-time";
		parameters[7].description = "Log entries that occurred before this time will be exported. The default is no limit";
		parameters[7].required = false;



	}
	
}