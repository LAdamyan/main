package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class NewComments {
    private int icon;
    private String bug;
    private String bugTest;
    private String bugText;
    private String productNum;

    public NewComments(int icon,String bug, String bugTest, String bugText, String productNum) {
        this.icon = icon;
        this.bug = bug;
        this.bugTest = bugTest;
        this.bugText = bugText;
        this.productNum = productNum;
    }
    public int getIcon(){
        return icon;
    }
    public String getBug() {
        return bug;
    }

    public String getBugTest() {
        return bugTest;
    }

    public String getBugText() {
        return bugText;
    }

    public String getProductNum() {
        return productNum;
    }


    public static List<NewComments> getNewComments (){
        ArrayList<NewComments>newCommentsArrayList= new ArrayList<>();
        newCommentsArrayList.add(new NewComments(R.drawable.ic_baseline_comment_24,"Bug comment",
                "test IO Update","We couldn't find a tester within 24 hours.We rec...",
                "#29|OnlyProduct"));
        newCommentsArrayList.add(new NewComments(R.drawable.ic_baseline_comment_24,"Bug comment",
                "test IO Update","We couldn't find a tester within 24 hours.We rec...",
                "#29|OnlyProduct"));
        newCommentsArrayList.add(new NewComments(R.drawable.ic_baseline_comment_24,"Bug comment",
                "test IO Update","We couldn't find a tester within 24 hours.We rec...",
                "#29|OnlyProduct"));
        newCommentsArrayList.add(new NewComments(R.drawable.ic_baseline_comment_24,"Bug comment",
                "test IO Update","We couldn't find a tester within 24 hours.We rec...",
                "#29|OnlyProduct"));
        newCommentsArrayList.add(new NewComments(R.drawable.ic_baseline_comment_24,"Bug comment",
                "test IO Update","We couldn't find a tester within 24 hours.We rec...",
                "#29|OnlyProduct"));
        newCommentsArrayList.add(new NewComments(R.drawable.ic_baseline_comment_24,"Bug comment",
                "test IO Update","We couldn't find a tester within 24 hours.We rec...",
                "#29|OnlyProduct"));

       return newCommentsArrayList;
    }
}
