public class CallCRUD {

    public Call createCall(String title, String description, String startDate, String endDate) {
        Call newCall = new Call(title, description, startDate, endDate, true);
        return newCall;
    }

    public void updateCall(Call callToUpdate, String title, String description, String startDate, String endDate) {
        callToUpdate.setTitle(title);
        callToUpdate.setDescription(description);
        callToUpdate.setStartDate(startDate);
        callToUpdate.setEndDate(endDate);
    }

    public void addStageToCall(Call call, Stage stage) {
        call.addStage(stage);
    }

}