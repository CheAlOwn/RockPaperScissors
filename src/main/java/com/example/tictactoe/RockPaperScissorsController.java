package com.example.tictactoe;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.Random;

public class RockPaperScissorsController {

    @FXML
    private Label resultLabel;

    @FXML
    private Label scoreLabel;

    private int playerScore = 0;
    private int computerScore = 0;

    private final String[] choices = {"Камень", "Бумага", "Ножницы"};

    @FXML
    private void handleRock() {
        play("Камень");
    }

    @FXML
    private void handlePaper() {
        play("Бумага");
    }

    @FXML
    private void handleScissors() {
        play("Ножницы");
    }

    private void play(String playerChoice) {
        String computerChoice = choices[new Random().nextInt(choices.length)];

        String result;
        if (playerChoice.equals(computerChoice)) {
            result = "Ничья!";
        } else if ((playerChoice.equals("Камень") && computerChoice.equals("Ножницы")) ||
                (playerChoice.equals("Бумага") && computerChoice.equals("Камень")) ||
                (playerChoice.equals("Ножницы") && computerChoice.equals("Бумага"))) {
            result = "Вы выиграли!";
            playerScore++;
        } else {
            result = "Компьютер выиграл!";
            computerScore++;
        }

        resultLabel.setText("Ваш выбор: " + playerChoice + ", выбор компьютера: " + computerChoice + ". " + result);
        scoreLabel.setText("Счет: Игрок " + playerScore + " - " + computerScore + " Компьютер");
    }
}
