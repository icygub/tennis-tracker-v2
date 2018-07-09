package cs295capstone.tennistracker;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cs295capstone.tennistracker.databinding.NewMatchSetupBinding;
import cs295capstone.tennistracker.viewmodels.MatchMainPageVM;

public class MatchMainPageActivity extends AppCompatActivity {

    private MatchMainPageVM matchMainPageVM;
    private NewMatchSetupBinding newMatchSetupBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        newMatchSetupBinding = DataBindingUtil.setContentView(this, R.layout.match_main_page);


        Button startPointButton = findViewById(R.id.button_start_point);
        startPointButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MatchMainPageActivity.this, ServeOutcomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
