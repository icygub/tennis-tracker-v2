package cs295capstone.tennistracker;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import cs295capstone.tennistracker.databinding.NewMatchSetupBinding;
import cs295capstone.tennistracker.models.Match;
import cs295capstone.tennistracker.viewmodels.NewMatchSetupVM;

public class NewMatchSetupActivity extends AppCompatActivity {

    private NewMatchSetupVM newMatchSetupVM;
    private Match match;
    private NewMatchSetupBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.new_match_setup);
        match = new Match("John", "Computer", 1, 6, true);
        mBinding.setMatch(match);

        newMatchSetupVM = new NewMatchSetupVM();

        Button createNewMatchButton = findViewById(R.id.button_create_new_match);
        createNewMatchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String player1Name = ((EditText)findViewById(R.id.editText_player1)).getText().toString();
                String player2Name = ((EditText)findViewById(R.id.editText_player2)).getText().toString();
                int setsPerMatch =Integer.parseInt(((Spinner) findViewById(R.id.spinner_sets)).getSelectedItem().toString());
                int gamesPerSet =Integer.parseInt(((Spinner) findViewById(R.id.spinner_games)).getSelectedItem().toString());
                RadioGroup radioGroup= findViewById(R.id.radiogroup_first_server);
                RadioButton radioButton = findViewById(radioGroup.getCheckedRadioButtonId());
                boolean player1ServesFirst = radioButton.getText().toString().equals("Player 1");
                newMatchSetupVM.createMatch(player1Name, player2Name, setsPerMatch, gamesPerSet, player1ServesFirst);
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
