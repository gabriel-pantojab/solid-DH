import java.util.Date;

public class Stage {

    private String name;
    private String description;
    private Date startDate;
    private Date endDate;

    public Stage(String name, String description, Date startDate, Date endDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Stage: {" + "name: " + name + ", description: " + description + ", startDate: " + startDate + ", endDate: " + endDate + "}";
    }

}