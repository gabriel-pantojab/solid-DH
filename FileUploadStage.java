import java.io.File;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class FileUploadStage extends Stage {

    private List<File> files;

    public FileUploadStage(String name, String description, Date startDate, Date endDate) {
        super(name, description, startDate, endDate);
        this.files = new ArrayList<File>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    public List<File> getFiles() {
        return files;
    }
}