package com.meshach.wordleclone;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TableLayout;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.meshach.wordleclone.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private Board_Activity gameBoard;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //Link to BoardActivity
        constraintLayout = findViewById(R.id.constraintLayout);
        gameBoard = new Board_Activity();
        gameBoard.initializeBoard(constraintLayout);



    }

}