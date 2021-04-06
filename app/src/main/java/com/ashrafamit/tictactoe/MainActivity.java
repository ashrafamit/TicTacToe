package com.ashrafamit.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.ashrafamit.tictactoe.Fragment.StartFragment;

public class MainActivity extends AppCompatActivity {

    private FrameLayout frame_main;
    public static boolean multiPlayer = true;
    public static int scoreX = 0, scoreO = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        frame_main = findViewById(R.id.frame_main);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_main, new StartFragment());
        transaction.commit();

    }
}