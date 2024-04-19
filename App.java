public class App {

    public static void main(String[] args) {
        CallCRUD callCRUD = new CallCRUD();
        CallPrinter callPrinter = new CallPrinter();
        CallManager callManager = new CallManager(callCRUD, callPrinter);

        callManager.createCall("Developer Recruitment", "Looking for skilled developers", "2021-01-01", "2021-02-01");
        callManager.updateCall(0, "Developer Recruitment Updated", "Updated description", "2021-01-01", "2021-03-01");
        callManager.addStageToCall(0, "CV Submission", "Submit your CV");
        callManager.printCalls();
    }

}
