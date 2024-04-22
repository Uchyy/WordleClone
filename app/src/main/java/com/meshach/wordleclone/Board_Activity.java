package com.meshach.wordleclone;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.text.InputFilter;
import android.text.InputType;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Board_Activity extends AppCompatActivity {

    private MainActivity mainActivity;
    private TableLayout tableLayout;
    private List<TableRow> rowsList;
    private  List <EditText> editTextList;

    //public Board_Activity(MainActivity mainActivity) {this.mainActivity = mainActivity;}


    public void initializeBoard(ConstraintLayout constraintLayout) {
       tableLayout = constraintLayout.findViewById(R.id.BoardGameBoard);
        rowsList = new ArrayList<>();
        editTextList = new ArrayList<>();

        for (int i = 0; i < tableLayout.getChildCount(); i++) {
            TableRow row = (TableRow) tableLayout.getChildAt(i);
            rowsList.add(row);
            for (int j = 0; j < row.getChildCount(); j++) {
                EditText editText = (EditText) row.getChildAt(j);
                setTexToNull(editText);
                editTextList.add(editText);
            }
        }

        editTextList.get(0).requestFocus();

    }

    private void setTexToNull(EditText editText) {

            editText.setText("A");
            editText.setCursorVisible(false);
            editText.setClickable(false);
            editText.setTextColor(Color.parseColor("#A77124"));
            editText.setInputType(InputType.TYPE_NULL);

    }

    public List<TableRow> getRowsList() {
        return rowsList;
    }

    public List<EditText> getEditTextList() {
        return editTextList;
    }


}
