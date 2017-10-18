/**
 * 
 * @author Siu
 *
 */

public class Project {
	public String[][] project;

	public Project(String[][] project) {
		this.project = project;
	}

	public boolean isWellSorted_A(String[] sequence) {
		int len = sequence.length;
		if (len == 0 && project.length > 0) // Array is empty
			return false;
		else if (!check(sequence[len - 1]).isEmpty()) // Last entry is matched
			return false;
		else if (len == 1 && !check(sequence[0]).isEmpty()) // One entry and matched
			return false;
		else
			for (int i = 0; i < len - 1; i++) {
				String find = check(sequence[i]);
				if (!find.isEmpty())
					for (int j = i + 1; j < len; j++)
						if (sequence[j].equals(find))
							break;
						else if (j == len - 1 & (!sequence[j].equals(find)))
							return false;
			}
		return true;
	}

	public String check(String str) {
		for (int i = 0; i < project.length; i++)
			if (str.equals(project[i][0]))
				return project[i][1];
		return "";
	}

	public boolean isWellSorted_B(String[] sequence) {
		if (sequence == null)
			return false;
		int len = sequence.length;
		if (len == 0 && project.length > 0) // Array is empty
			return false;
		else if (!check(sequence[len - 1]).isEmpty()) // Last entry is matched
			return false;
		else if (len == 1 && !check(sequence[0]).isEmpty()) // One entry and matched
			return false;
		else
			for (int i = 0; i < len - 1; i++) {
				String find = check(sequence[i]);
				if (!find.isEmpty())
					for (int j = i + 1; j < len; j++)
						if (sequence[j].equals(find))
							break;
						else if (j == len - 1 & (!sequence[j].equals(find)))
							return false;
			}
		return true;
	}
}
