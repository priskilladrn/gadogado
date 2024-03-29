package com.example.gadogado;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.gadogado.Fragments.AddFragment;
import com.example.gadogado.Fragments.HomeFragment;
import com.example.gadogado.Fragments.ProfileFragment;
import com.google.firebase.firestore.FirebaseFirestore;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class MainActivity extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    private final int ID_HOME  = 1;
    private final int ID_ADD  = 2;
    private final int ID_PROFILE  = 3;
    String username, status;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sPref = getSharedPreferences("LOG_IN", MODE_PRIVATE);
        username = sPref.getString("username", null);
        status = sPref.getString("status", null);

        switchFragment(new HomeFragment(username));
        MeowBottomNavigation bottomNavigation = findViewById(R.id.bottom_navigation);

        bottomNavigation.add(new MeowBottomNavigation.Model(ID_HOME, R.drawable.ic_home));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_ADD, R.drawable.ic_add));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_PROFILE, R.drawable.ic_person));

        bottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                if(model.getId() == ID_HOME){
                    switchFragment(new HomeFragment(username));
                } else if(model.getId() == ID_ADD){
                    switchFragment(new AddFragment(username));
                } else if (model.getId() == ID_PROFILE){
                    switchFragment(new ProfileFragment(username, status));
                }
                return null;
            }
        });

        bottomNavigation.show(ID_HOME, true);
    }

    private void switchFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frameLayout, fragment);
        ft.commit();
    }
}