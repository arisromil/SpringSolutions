package quartz;

import java.nio.file.Path;

public interface FileCopier {
	
	void copyFile(Path srcFile, Path destDir);

}
