public class CallPrinter implements Printer {

    private Call call;

    public void setCall(Call call) {
        this.call = call;
    }

    public void print() {
        System.out.println("Call: " + call.getTitle() + ", Stages: " + call.getStages().size());

        for (Stage stage : call.getStages()) {
            System.out.println(stage);
        }
    }
}