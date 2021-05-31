package com.gacha.quizapp.Model;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.ArrayList;

public class QuesMulImage extends Ques implements Serializable {
    public static class AnsImage implements Serializable
    {
        public String image;
        public String ans;

        public AnsImage() {
        }
    };
    private int ansC;
    private String ques;
    private ArrayList<AnsImage> ans;
    private int userAns;

    public int getUserAns() {
        return userAns;
    }

    public void setUserAns(int userAns) {
        this.userAns = userAns;
    }

    public int getAnsC() {
        return ansC;
    }

    public void setAnsC(int ansC) {
        this.ansC = ansC;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public ArrayList<AnsImage> getAns() {
        return ans;
    }

    public void setAns(ArrayList<AnsImage> ans) {
        this.ans = ans;
    }

    public QuesMulImage() {
    }

    public String testAnsImage(){
        StringBuilder result = new StringBuilder("{ ");
        for (AnsImage ansI : ans) {
            result.append(String.format("%s , %s", ansI.image, ansI.ans));
        }
        return result + " }";
    }

    public QuesMulImage(int id,int ansC, int category, String ques, int type, ArrayList<AnsImage> ans) {
        super(type,id,category);
        this.ansC = ansC;
        this.ques = ques;
        this.ans = ans;
    }

    @NonNull
    @Override
    public String toString() {
        return "QuesMulImage{" +
                "ansC=" + ansC +
                ", ques='" + ques + '\'' +
                ", ans=" + ans +
                ", userAns=" + userAns +
                ", type=" + type +
                ", id=" + id +
                ", category=" + category +
                '}';
    }

    @Override
    public boolean getPoint() {
        return userAns == ansC;
    }
}
