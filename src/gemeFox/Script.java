package gemeFox;


public class Script {
    private String action;
    private String explanation;
    private String option1;
    private String option2;


    public Script(String action, String explanation, String option1, String option2) {
        this.action = action;
        this.explanation = explanation;
        this.option1 = option1;
        this.option2 = option2;

    }


    public String getAction() {
        return action;
    }


    public String getExplanation() {
        return explanation;
    }


    public String getOption1() {
        return option1;
    }


    public String getOption2() {
        return option2;
    }


}
