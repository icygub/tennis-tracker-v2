package cs295capstone.tennistracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewMatchSetupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_match_setup);

        Button createNewMatchButton = findViewById(R.id.button_create_new_match);
        createNewMatchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewMatchSetupActivity.this, MatchMainPageActivity.class);
                startActivity(intent);
            }
        });

        Button exitSetupButton = findViewById(R.id.button_exit_setup);
        exitSetupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewMatchSetupActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
