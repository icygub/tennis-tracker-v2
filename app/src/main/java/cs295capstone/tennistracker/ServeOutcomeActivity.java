package cs295capstone.tennistracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServeOutcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.serve_outcome);

        Button aceButton = findViewById(R.id.button_ace);
        aceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ServeOutcomeActivity.this, MatchMainPageActivity.class);
                startActivity(intent);
            }
        });

        Button continueButton = findViewById(R.id.button_continue);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ServeOutcomeActivity.this, PointOutcomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
