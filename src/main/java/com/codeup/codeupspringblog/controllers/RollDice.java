package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RollDice {
    @GetMapping("/roll-dice")
    public String rollDice() {
        return "roll-dice/index";
    }

    @GetMapping("/roll-dice/{number}")
    public String rollGuess1(@PathVariable int number, Model model) {
        int randomInt = (int)(Math.random() * 6) + 1;
        model.addAttribute("number", number);
        model.addAttribute("randomInt", randomInt);
        return "/roll-dice/show";

//        int userGuess = 1;
//        if (randomInt == userGuess){
//            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "You guessed correctly!";
//        } else {
//            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "Try Again!";
//        }
    }

////    Note: Pre-walk-thru work below.  Initially done incorrectly using ResponseBody.  Was refactored above and show html created.

//    @GetMapping("/roll-dice/1")
//    @ResponseBody
//    public String rollGuess1() {
//        int randomInt = (int)Math.floor(Math.random() * (6 - 1 + 1) + 1);
//        int userGuess = 1;
//        if (randomInt == userGuess){
//            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "You guessed correctly!";
//        } else {
//            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "Try Again!";
//        }
//    }
//
//    @GetMapping("/roll-dice/2")
//    @ResponseBody
//    public String rollGuess2() {
//        int randomInt = (int)Math.floor(Math.random() * (6 - 1 + 1) + 1);
//        int userGuess = 2;
//        if (randomInt == userGuess){
//            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "You guessed correctly!";
//        } else {
//            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "Try Again!";
//        }
//    }
//
//    @GetMapping("/roll-dice/3")
//    @ResponseBody
//    public String rollGuess3() {
//        int randomInt = (int)Math.floor(Math.random() * (6 - 1 + 1) + 1);
//        int userGuess = 3;
//        if (randomInt == userGuess){
//            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "You guessed correctly!";
//        } else {
//            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "Try Again!";
//        }
//    }
//
//    @GetMapping("/roll-dice/4")
//    @ResponseBody
//    public String rollGuess4() {
//        int randomInt = (int)Math.floor(Math.random() * (6 - 1 + 1) + 1);
//        int userGuess = 4;
//        if (randomInt == userGuess){
//            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "You guessed correctly!";
//        } else {
//            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "Try Again!";
//        }
//    }
//
//    @GetMapping("/roll-dice/5")
//    @ResponseBody
//    public String rollGuess5() {
//        int randomInt = (int)Math.floor(Math.random() * (6 - 1 + 1) + 1);
//        int userGuess = 5;
//        if (randomInt == userGuess){
//            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "You guessed correctly!";
//        } else {
//            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "Try Again!";
//        }
//    }
//
//    @GetMapping("/roll-dice/6")
//    @ResponseBody
//    public String rollGuess6() {
//        int randomInt = (int)Math.floor(Math.random() * (6 - 1 + 1) + 1);
//        int userGuess = 6;
//        if (randomInt == userGuess){
//            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "You guessed correctly!";
//        } else {
//            return "Your guess:" + userGuess + ", Dice roll: " + randomInt + ", " + "Try Again!";
//        }
//    }





}



