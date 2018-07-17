package sg.edu.rp.c346.customquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView Quiz;
    ArrayList<QuizItem> alQuiz;
    CustomAdapter caQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Quiz=findViewById(R.id.lvQuizC);

        //initialize array lsit
        alQuiz=new ArrayList<>();

        //create object
        QuizItem item1=new QuizItem("Area of Rectangle","Length x Length","Formula type is:Area");
        QuizItem item2=new QuizItem("Area of Triangle","(Length of base x Length)/2","Formula type is:Area");
        QuizItem item3=new QuizItem("Volume of Cube","Length x Length x Length","Formula type is:Volume");


        //put object into arraylist
        alQuiz.add(item1);
        alQuiz.add(item2);
        alQuiz.add(item3);


        caQuiz=new CustomAdapter(this,R.layout.quizitem, alQuiz);
        Quiz.setAdapter(caQuiz);
    }
}
