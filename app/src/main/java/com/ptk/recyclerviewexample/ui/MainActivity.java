package com.ptk.recyclerviewexample.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import com.ptk.recyclerviewexample.R;
import com.ptk.recyclerviewexample.adapter.LanguageAdapter;
import com.ptk.recyclerviewexample.model.LanguageModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMain = findViewById(R.id.rvMain);
        LanguageAdapter adapter = new LanguageAdapter(pumpLanguageModels());
        DividerItemDecoration decoration = new DividerItemDecoration(this, RecyclerView.VERTICAL);
        rvMain.addItemDecoration(decoration);
        rvMain.setAdapter(adapter);
    }

    private ArrayList<LanguageModel> pumpLanguageModels() {
        ArrayList<LanguageModel> arrayList = new ArrayList<>();
        
        arrayList.add(new LanguageModel("JAVA", "2012"));
        arrayList.add(new LanguageModel("Kotlin", "2013"));
        arrayList.add(new LanguageModel("C", "2014"));
        arrayList.add(new LanguageModel("C#", "2015"));
        arrayList.add(new LanguageModel("C++", "2016"));
        arrayList.add(new LanguageModel("Python", "2017"));
        arrayList.add(new LanguageModel("Swift", "2018"));
        arrayList.add(new LanguageModel("PHP", "2019"));
        arrayList.add(new LanguageModel("Dart", "2020"));
        arrayList.add(new LanguageModel("Ruby", "2021"));

        arrayList.add(new LanguageModel("JAVA", "2012"));
        arrayList.add(new LanguageModel("Kotlin", "2013"));
        arrayList.add(new LanguageModel("C", "2014"));
        arrayList.add(new LanguageModel("C#", "2015"));
        arrayList.add(new LanguageModel("C++", "2016"));
        arrayList.add(new LanguageModel("Python", "2017"));
        arrayList.add(new LanguageModel("Swift", "2018"));
        arrayList.add(new LanguageModel("PHP", "2019"));
        arrayList.add(new LanguageModel("Dart", "2020"));
        arrayList.add(new LanguageModel("Ruby", "2021"));

        arrayList.add(new LanguageModel("JAVA", "2012"));
        arrayList.add(new LanguageModel("Kotlin", "2013"));
        arrayList.add(new LanguageModel("C", "2014"));
        arrayList.add(new LanguageModel("C#", "2015"));
        arrayList.add(new LanguageModel("C++", "2016"));
        arrayList.add(new LanguageModel("Python", "2017"));
        arrayList.add(new LanguageModel("Swift", "2018"));
        arrayList.add(new LanguageModel("PHP", "2019"));
        arrayList.add(new LanguageModel("Dart", "2020"));
        arrayList.add(new LanguageModel("Ruby", "2021"));

        arrayList.add(new LanguageModel("JAVA", "2012"));
        arrayList.add(new LanguageModel("Kotlin", "2013"));
        arrayList.add(new LanguageModel("C", "2014"));
        arrayList.add(new LanguageModel("C#", "2015"));
        arrayList.add(new LanguageModel("C++", "2016"));
        arrayList.add(new LanguageModel("Python", "2017"));
        arrayList.add(new LanguageModel("Swift", "2018"));
        arrayList.add(new LanguageModel("PHP", "2019"));
        arrayList.add(new LanguageModel("Dart", "2020"));
        arrayList.add(new LanguageModel("Ruby", "2021"));
        return arrayList;
    }


}