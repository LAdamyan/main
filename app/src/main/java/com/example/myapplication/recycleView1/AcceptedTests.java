package com.example.myapplication.recycleView1;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class AcceptedTests {

    private int image;
    private String userName;
    private String number;
    private String coverage;

    public AcceptedTests(int image, String userName, String number, String coverage) {
        this.image = image;
        this.userName = userName;
        this.number = number;
        this.coverage = coverage;
    }

    public int getImage() {
        return image;
    }

    public String getUserName() {
        return userName;
    }

    public String getNumber() {
        return number;
    }

    public String getCoverage() {
        return coverage;
    }

    public static List<AcceptedTests> getAcceptedTests (){
        ArrayList<AcceptedTests>acceptedTestsArrayList = new ArrayList<>();
        acceptedTestsArrayList.add(new AcceptedTests(R.drawable.letter_a_print,
                                 "CooperKo","#247:Advanced Ticketing",
                                  "Coverage|Ends in 81d 14:44"));
        acceptedTestsArrayList.add(new AcceptedTests(R.drawable.letter_b_print,
                "Yost,Powlowski and Jenkins","#136:VZ test #136",
                "Coverage|Ends in 50d 17:44"));
        acceptedTestsArrayList.add(new AcceptedTests(R.drawable.letter_k_print,
                "Yost,Powlowski and Jenkins","#184:VZ test #184",
                "Coverage|Ends in 19d 20:44"));
        acceptedTestsArrayList.add(new AcceptedTests(R.drawable.letter_a_print,
                "CooperKo","#247:Advanced Ticketing",
                "Coverage|Ends in 81d 14:44"));
        acceptedTestsArrayList.add(new AcceptedTests(R.drawable.letter_b_print,
                "Yost,Powlowski and Jenkins","#136:VZ test #136",
                "Coverage|Ends in 50d 17:44"));
        acceptedTestsArrayList.add(new AcceptedTests(R.drawable.letter_k_print,
                "Yost,Powlowski and Jenkins","#184:VZ test #184",
                "Coverage|Ends in 19d 20:44"));
        acceptedTestsArrayList.add(new AcceptedTests(R.drawable.letter_a_print,
                "CooperKo","#247:Advanced Ticketing",
                "Coverage|Ends in 81d 14:44"));
        acceptedTestsArrayList.add(new AcceptedTests(R.drawable.letter_b_print,
                "Yost,Powlowski and Jenkins","#136:VZ test #136",
                "Coverage|Ends in 50d 17:44"));
        acceptedTestsArrayList.add(new AcceptedTests(R.drawable.letter_k_print,
                "Yost,Powlowski and Jenkins","#184:VZ test #184",
                "Coverage|Ends in 19d 20:44"));

        return acceptedTestsArrayList;
    }
}
