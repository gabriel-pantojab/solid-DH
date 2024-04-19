import java.io.File;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class CallManager {
    private List<Call> calls;
    private CallCRUD callCRUD;
    private CallPrinter callPrinter;

    public CallManager(CallCRUD callCRUD, CallPrinter callPrinter) {
        this.calls = new ArrayList<Call>();
        this.callCRUD = callCRUD;
        this.callPrinter = callPrinter;
    }

    public void createCall(String title, String description, String startDate, String endDate) {
        Call newCall = callCRUD.createCall(title, description, startDate, endDate);
        calls.add(newCall);
        System.out.println("Call created with title: " + title);
    }

    public void updateCall(int callIndex, String title, String description, String startDate, String endDate) {
        try {
            this.validateCallIndex(callIndex);

            Call callToUpdate = calls.get(callIndex);
            callCRUD.updateCall(callToUpdate, title, description, startDate, endDate);

            System.out.println("Call updated with new title: " + title);
        } catch (Exception e) {
            System.out.println("Invalid call index");
        }
    }

    public void addStageToCall(int callIndex, String stageName, String stageDescription) {
        try {
            this.validateCallIndex(callIndex);

            Call call = calls.get(callIndex);
            callCRUD.addStageToCall(call, new Stage(stageName, stageDescription, new Date(), new Date()));

            System.out.println("Stage added to call: " + stageName);
        } catch (Exception e) {
            System.out.println("Invalid call index");
        }
    }

    public void printCalls() {
        for (Call call : calls) {
            callPrinter.setCall(call);
            callPrinter.print();
        }
    }

    private void validateCallIndex(int callIndex) throws Exception {
        if (!isValidCallIndex(callIndex)) {
            throw new Exception("Invalid call index");
        }
    }

    private boolean isValidCallIndex(int callIndex) {
        return callIndex >= 0 && callIndex < calls.size();
    }

}