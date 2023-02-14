package com.example.menum5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivityProfile extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_profile);

        textView = findViewById(R.id.textView23);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //идентификатор пункта меню
        int id = item.getItemId();

        // Действие для каждого пункта
        switch (id) {
            case R.id.action_profile:
                //textView.setText("Мой профиль");
                return true;
            case R.id.action_about_app:
                //textView.setText("Информация о приложении");
                return true;
            case R.id.action_settings:
                //textView.setText("Настройки приложение");
                return true;
            case R.id.action_logout:
                //textView.setText("Вы хотите выйти?");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}