package cs295capstone.tennistracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PointOutcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.point_outcome);

        Button finishPointButton = findViewById(R.id.button_finish_point);
        finishPointButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PointOutcomeActivity.this, MatchMainPageActivity.class);
                startActivity(intent);
            }
        });
    }
}
