import java.util.ArrayList;
import java.util.List;

public class Call {

    private String title;
    private String description;
    private String startDate;
    private String endDate;
    private boolean isVisible;
    private List<Stage> stages;

    public Call(String title, String description, String startDate, String endDate, boolean isVisible) {
        this.stages = new ArrayList<Stage>();
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isVisible = isVisible;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public void addStage(Stage stage) {
        stages.add(stage);
    }

    public List<Stage> getStages() {
        return stages;
    }
    
}