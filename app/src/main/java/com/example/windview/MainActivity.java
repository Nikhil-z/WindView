package com.example.windview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatSeekBar;
import android.widget.SeekBar;

import com.github.ahmadnemati.wind.WindView;
import com.github.ahmadnemati.wind.enums.TrendType;
import com.mikepenz.materialize.MaterializeBuilder;

public class MainActivity extends AppCompatActivity {
    private WindView windView;
    private AppCompatSeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new MaterializeBuilder()
                .withActivity(this)
                .withFullscreen(true)
                .withTranslucentStatusBarProgrammatically(false)
                .withTintedStatusBar(false).build();
        windView = (WindView) findViewById(R.id.windView);
        windView.setPressure(50);
        windView.setPressureUnit("in Hg");
        windView.setWindSpeed(15);
        windView.setWindSpeedUnit("Km/s");
        windView.setWindDirection("Salam");
        windView.setTrendType(TrendType.UP);





    }
}
