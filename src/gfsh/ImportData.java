public class ImportData extends Command {
	
	public ImportData() {
		name = "import data";
		description = "Import user data from a file to a region";

		parameters = new Parameter[3];

		parameters[0] = new Parameter();
		parameters[0].name = "region";
		parameters[0].description = "Region into which data will be imported";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "file";
		parameters[1].description = "File from which the imported data will be read";
		parameters[1].required = true;


		parameters[2] = new Parameter();
		parameters[2].name = "member";
		parameters[2].description = "Name/Id of a member which hosts the region";
		parameters[2].required = true;



	}
	
}