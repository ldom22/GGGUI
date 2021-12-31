public class PdxRename extends Command {
	
	public PdxRename() {
		name = "pdx rename";
		description = "Renames PDX types in an offline disk store";

		parameters = new Parameter[4];

		parameters[0] = new Parameter();
		parameters[0].name = "old";
		parameters[0].description = "If a PDX type's fully qualified class name has a word that matches this text then it will be renamed";
		parameters[0].required = true;


		parameters[1] = new Parameter();
		parameters[1].name = "new";
		parameters[1].description = "The text to replace the word that matched old";
		parameters[1].required = true;


		parameters[2] = new Parameter();
		parameters[2].name = "disk-store";
		parameters[2].description = "Name of the disk store to operate on";
		parameters[2].required = true;


		parameters[3] = new Parameter();
		parameters[3].name = "disk-dirs";
		parameters[3].description = "Directories which contain the disk store files";
		parameters[3].required = true;



	}
	
}