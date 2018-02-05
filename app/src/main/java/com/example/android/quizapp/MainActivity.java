package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.android.quizapp.R.id.Question_Four;
import static com.example.android.quizapp.R.id.Question_One;
import static com.example.android.quizapp.R.id.Question_One_A;
import static com.example.android.quizapp.R.id.Question_One_C;
import static com.example.android.quizapp.R.id.Question_Three_C;
import static com.example.android.quizapp.R.id.Question_Two_B;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int NumberOfAnswers = 0 ;


    public void SubmitOrder(View view) {

        EditText Name = (EditText) findViewById(R.id.Text_field);
        String NameField = Name.getText().toString();
        Log.v("MainActivity", "Name : " + NameField);

        CheckBox Answer_Question_One = (CheckBox)findViewById(Question_One_C);
        boolean AnswerOfQuestionOne = Answer_Question_One.isChecked();

        CheckBox Answer_Question_Two = (CheckBox) findViewById(Question_Two_B);
        boolean AnswerOfQuestionTwo = Answer_Question_One.isChecked();

        CheckBox Answer_Question_Three =(CheckBox) findViewById(Question_Three_C);
        boolean AnswerOfQuestionThree = Answer_Question_One.isChecked();

        CheckBox Answer_Question_Four =(CheckBox) findViewById(R.id.Question_Four_B);
        boolean AnswerOfQuestionFour = Answer_Question_Four.isChecked();

        CheckBox Answer_Question_Five = (CheckBox)findViewById(R.id.Question_Five_B);
        boolean AnswerOfQuestionFive = Answer_Question_Four.isChecked();

        String Answers = createOrderSummary(NameField , AnswerOfQuestionOne , AnswerOfQuestionTwo , AnswerOfQuestionThree , AnswerOfQuestionFour , AnswerOfQuestionFive);
        displayAnswers(Answers);


    }
    private String createOrderSummary(String name, boolean AnswerOne, boolean AnswerTwo , boolean AnswerThree , boolean AnswerFour , boolean AnswerFive) {

        if (AnswerOne== true ) {
            NumberOfAnswers =  1;

        }


        if (AnswerTwo== true ) {
            NumberOfAnswers = NumberOfAnswers + 1;

        }

        if (AnswerThree== true ) {
            NumberOfAnswers = NumberOfAnswers + 1;

        }

        if (AnswerFour== true ) {
            NumberOfAnswers = NumberOfAnswers + 1;

        }

        if (AnswerFive== true ) {
            NumberOfAnswers = NumberOfAnswers + 1;

        }

        String ShowMessage = "Great ,  " + name;

        ShowMessage += "\nAnswer one :  " + AnswerOne;
        ShowMessage += "\nAnswer Two :  " + AnswerTwo;
        ShowMessage += "\nAnswer Three : " + AnswerThree;
        ShowMessage += "\nAnswer Four : " + AnswerFour;
        ShowMessage += "\nAnswer Five : " + AnswerFive;
        ShowMessage += "\n Your Score : " + NumberOfAnswers ;

        ShowMessage += "\nThank you!";

        return ShowMessage;
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayAnswers(int Answers) {
        TextView Answers_Questions = (TextView) findViewById(R.id.order_summary_text_view);
        Answers_Questions.setText("" +Answers);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayAnswers(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }


}


