package sg.edu.rp.c346.customquiz;

/**
 * Created by 17041061 on 17/7/2018.
 */

public class QuizItem {

    private String Figure;
    private String Formula;
    private String Type;

    public QuizItem(String figure, String formula, String type) {
        Figure = figure;
        Formula = formula;
        Type = type;
    }

    public String getFigure() {
        return Figure;
    }

    public void setFigure(String figure) {
        Figure = figure;
    }

    public String getFormula() {
        return Formula;
    }

    public void setFormula(String formula) {
        Formula = formula;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "QuizItem{" +
                "Figure='" + Figure + '\'' +
                ", Formula='" + Formula + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
