import javax.swing.table.*;

public class ListMembers extends Command {
	
	public ListMembers() {
		name = "list members";
		description = "Display all or a subset of members";

		parameters = new Parameter[1];
		
		parameters[0] = new Parameter();
		parameters[0].name = "group";
		parameters[0].description = "Group name for which members will be displayed";
		parameters[0].required = false;
	}
	
}