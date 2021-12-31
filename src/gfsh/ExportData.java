public class ExportData extends Command {
	
	public ExportData() {
		name = "export data";
		description = "Export user data from a region to a file";

		parameters = new Parameter[3];

		parameters[0] = new Parameter();
		parameters[0].name = "region";
		parameters[0].description = "Region from which data will be exported";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "file";
		parameters[1].description = "File to which the exported data will be written. The file must have an extension of .gfd";
		parameters[1].required = true;


		parameters[2] = new Parameter();
		parameters[2].name = "member";
		parameters[2].description = "Name/Id of a member which hosts the region. The data will be exported to the specified file on the host where the member is running";
		parameters[2].required = true;

	}
	
}