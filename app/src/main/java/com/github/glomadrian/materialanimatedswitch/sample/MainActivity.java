package com.github.glomadrian.materialanimatedswitch.sample;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.glomadrian.materialanimatedswitch.MaterialAnimatedSwitch;

public class MainActivity extends AppCompatActivity {

  private View mainView;
  private MaterialAnimatedSwitch materialAnimatedSwitch;
  private MaterialAnimatedSwitch materialAnimatedSwitch2;
  private MaterialAnimatedSwitch materialAnimatedSwitch3;
  private MaterialAnimatedSwitch materialAnimatedSwitch4;
  private MaterialAnimatedSwitch masterSwitch;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mainView = findViewById(R.id.main);
    materialAnimatedSwitch = findViewById(R.id.pin);
    materialAnimatedSwitch2 = findViewById(R.id.pin2);
    materialAnimatedSwitch3 = findViewById(R.id.pin3);
    materialAnimatedSwitch4 = findViewById(R.id.pin4);
    masterSwitch = findViewById(R.id.masterSwitch);

    materialAnimatedSwitch.setOnCheckedChangeListener(
            new MaterialAnimatedSwitch.OnCheckedChangeListener() {
              @Override
              public void onCheckedChanged(boolean isChecked) {
                Toast.makeText(MainActivity.this, materialAnimatedSwitch.isChecked() + "",
                        Toast.LENGTH_SHORT).show();
                materialAnimatedSwitch2.toggle();
              }
            });
  }
}
