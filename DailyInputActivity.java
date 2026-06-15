package com.example.healthgame;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import com.example.healthgame.logic.GameLogicManager;

public class DailyInputActivity extends AppCompatActivity {
    EditText foodInput;
    EditText exerciseInput;
    Button saveButton;
    TextView resultText;
    GameLogicManager gameLogic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_input);

        foodInput = findViewById(R.id.foodInput);
        exerciseInput = findViewById(R.id.exerciseInput);
        saveButton = findViewById(R.id.saveButton);
        resultText = findViewById(R.id.resultText);

        gameLogic = new GameLogicManager();

        saveButton.setOnClickListener(v -> {

            if(foodInput.getText().toString().isEmpty()
            || exerciseInput.getText().toString().isEmpty()){

            resultText.setText("칼로리를 입력해주세요");
            return;
            }
            
            int food = Integer.parseInt(foodInput.getText().toString());
            int exercise = Integer.parseInt(exerciseInput.getText().toString());

            int net = gameLogic.calculateNetCalories(food, exercise);
            int state = gameLogic.updateCharacterState(net);
            String rating = gameLogic.calculateDailyRating(net);

            resultText.setText("순칼로리: " + net + "\n상태: " + state + "\n평가: " + rating);
        });
    }
}
