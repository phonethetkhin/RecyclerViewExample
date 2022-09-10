package com.ptk.recyclerviewexample.model;

public class LanguageModel {
    private String languageName;
    private String date;

    public LanguageModel(String languageName, String date) {
        this.languageName = languageName;
        this.date = date;
    }

    public String getLanguageName() {
        return languageName;
    }

    public String getDate() {
        return date;
    }

}
