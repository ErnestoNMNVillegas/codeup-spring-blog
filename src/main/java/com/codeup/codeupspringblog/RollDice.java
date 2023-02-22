package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RollDice {
    @GetMapping("/roll-dice")
    public String rollDice() {
        return "rolldice";
    }


//    @PostMapping("/roll-dice")
//    public String rollGuess(@RequestParam(name = "button") String guess) {
//        return "rolldice";
//    }

    @GetMapping("/roll-dice/1")
    @ResponseBody
    public String rollGuess1() {
        int randomInt = (int)Math.floor(Math.random() * (6 - 1 + 1) + 1);
        int userGuess = 1;
        if (randomInt == userGuess){
            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "You guessed correctly!";
        } else {
            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "Try Again!";
        }
    }

    @GetMapping("/roll-dice/2")
    @ResponseBody
    public String rollGuess2() {
        int randomInt = (int)Math.floor(Math.random() * (6 - 1 + 1) + 1);
        int userGuess = 2;
        if (randomInt == userGuess){
            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "You guessed correctly!";
        } else {
            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "Try Again!";
        }
    }

    @GetMapping("/roll-dice/3")
    @ResponseBody
    public String rollGuess3() {
        int randomInt = (int)Math.floor(Math.random() * (6 - 1 + 1) + 1);
        int userGuess = 3;
        if (randomInt == userGuess){
            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "You guessed correctly!";
        } else {
            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "Try Again!";
        }
    }

    @GetMapping("/roll-dice/4")
    @ResponseBody
    public String rollGuess4() {
        int randomInt = (int)Math.floor(Math.random() * (6 - 1 + 1) + 1);
        int userGuess = 4;
        if (randomInt == userGuess){
            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "You guessed correctly!";
        } else {
            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "Try Again!";
        }
    }

    @GetMapping("/roll-dice/5")
    @ResponseBody
    public String rollGuess5() {
        int randomInt = (int)Math.floor(Math.random() * (6 - 1 + 1) + 1);
        int userGuess = 5;
        if (randomInt == userGuess){
            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "You guessed correctly!";
        } else {
            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "Try Again!";
        }
    }

    @GetMapping("/roll-dice/6")
    @ResponseBody
    public String rollGuess6() {
        int randomInt = (int)Math.floor(Math.random() * (6 - 1 + 1) + 1);
        int userGuess = 6;
        if (randomInt == userGuess){
            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "You guessed correctly!";
        } else {
            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "Try Again!";
        }
    }





}



