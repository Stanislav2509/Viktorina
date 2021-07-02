package com.Quiz;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void shuffleArray(String [] answers){
        Random rnd = new Random();

        for (int k = answers.length - 1; k > 0; k--) {
            int index = rnd.nextInt(k + 1);
            String swap = answers[index];
            answers[index] = answers[k];
            answers[k] = swap;
        }

        for (int j = 0; j < answers.length; j++) {
            System.out.println(answers[j]);
        }

        System.out.println();
    }
    public static void printCategoryGeography(){
        ArrayList<Integer> questionAsked = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        boolean winner=true;
        int score = 0;

        System.out.println("Да проверим как сте с географията! ");
        System.out.println();

        for (int i = 1; i < 4; i++) {
            Random rnd = new Random();
            int number = rnd.nextInt(3) + 1;

            while (questionAsked.contains(number)) {
                number = rnd.nextInt(3)+1;
            }

            switch (number) {
                case 1:
                    System.out.println(i + ".Река Марица извира от: ");
                    String[] answersForFirstQuestion = {"Рила", "Пирин", "Витоша", "Родопите"};

                    shuffleArray(answersForFirstQuestion);

                    System.out.print("Напишете вашият отговор: ");
                    String rightAnswerForFirstQuestion = input.nextLine();

                    if (rightAnswerForFirstQuestion.toLowerCase(Locale.ROOT).equals("Рила".toLowerCase(Locale.ROOT))) {
                        System.out.println("Поздравления, вие отговорихте правилно!");

                        score++;

                        System.out.println();

                    } else {
                        System.out.println("Грешен отговор, вашият резултат е : " + score);

                        winner = false;
                    }
                    questionAsked.add(number);
                    break;

                case 2:
                    System.out.println(i + ". Кое българско езеро влиза в списъка на ЮНЕСКО: ");
                    String[] answersForSecondQuestion = {"Сребърна","Атанасовско",  "Бургаско", "Седемте рилски езера"};

                    shuffleArray(answersForSecondQuestion);

                    System.out.print("Напишете вашият отговор: ");
                    String rightAnswerForSecondQuestion = input.nextLine();

                    if (rightAnswerForSecondQuestion.toLowerCase(Locale.ROOT).equals("Сребърна".toLowerCase(Locale.ROOT))) {
                        System.out.println("Поздравления, вие отговорихте правилно!");

                        score++;

                        System.out.println();
                    } else {
                        System.out.println("Грешен отговор, вашият резултат е : " + score);

                        winner = false;
                    }
                    questionAsked.add(number);

                    break;

                case 3:
                    System.out.println(i + ". Колко метра е висок връх Мусала? ");
                    String[] answersForThirdQuestion = {"2925", "2050", "3000", "2900"};

                    shuffleArray(answersForThirdQuestion);

                    System.out.print("Напишете вашият отговор: ");
                    int rightAnswersForThirdQuestion = input.nextInt();

                    if (rightAnswersForThirdQuestion == 2925) {
                        System.out.println("Поздравления, вие отговорихте правилно!");

                        score++;

                        System.out.println();
                    } else {
                        System.out.println("Грешен отговор, вашият резултат е : " + score);

                        winner = false;
                    }
                    questionAsked.add(number);

                    break;
            }
            if (!winner) {
                break;
            }
        }
        if (winner) {
            System.out.print("Вие отговорихте на всички географски въпроси с общ резултат: " + score);
            return;
        }
    }

    public static void printCategoryHistory() {
        ArrayList<Integer> questionAsked = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        boolean winner=true;
        int score = 0;

        System.out.println("Да проверим знанията Ви за Българската история! ");
        System.out.println();

        for (int i = 1; i < 4; i++) {
            Random rnd = new Random();
            int number = rnd.nextInt(3) + 1;

            while (questionAsked.contains(number)) {
                number = rnd.nextInt(3)+1;
            }

            switch (number) {
                case 1:
                    System.out.println(i + ". С кой договор се слага край на руско-турската война?");
                    String[] answersForFirstQuestion = {"Берлински", "Ньойски", "Санстефански", "Одринско примирие"};

                    shuffleArray(answersForFirstQuestion);

                    System.out.print("Напишете вашият отговор: ");
                    String rightAnswerForFirstQuestion = input.nextLine();

                    if (rightAnswerForFirstQuestion.toLowerCase(Locale.ROOT).equals("Санстефански".toLowerCase(Locale.ROOT))) {
                        System.out.println("Поздравления, вие отговорихте правилно!");

                        score++;

                        System.out.println();

                    } else {
                        System.out.println("Грешен отговор, вашият резултат е : " + score);

                        winner = false;
                    }
                    questionAsked.add(number);
                    break;

                case 2:
                    System.out.println(i + ". През коя година е битката при Клокотница? ");
                    String[] answersForSecondQuestion = {"1230", "1218", "1300", "1232"};

                    shuffleArray(answersForSecondQuestion);

                    System.out.print("Напишете вашият отговор: ");
                    int rightAnswerForSecondQuestion = input.nextInt();

                    if (rightAnswerForSecondQuestion == 1230) {
                        System.out.println("Поздравления, вие отговорихте правилно!");

                        score++;

                        System.out.println();
                    } else {
                        System.out.println("Грешен отговор, вашият резултат е : " + score);

                        winner = false;
                    }
                    questionAsked.add(number);

                    break;

                case 3:
                    System.out.println(i + ". През коя година избухва Априлското въстание? ");
                    String[] answersForThirdQuestion = {"1876", "1874", "1885", "1898"};

                    shuffleArray(answersForThirdQuestion);

                    System.out.print("Напишете вашият отговор: ");
                    int rightAnswersForThirdQuestion = input.nextInt();

                    if (rightAnswersForThirdQuestion == 1876) {
                        System.out.println("Поздравления, вие отговорихте правилно!");

                        score++;

                        System.out.println();
                    } else {
                        System.out.println("Грешен отговор, вашият резултат е : " + score);

                        winner = false;
                    }
                    questionAsked.add(number);

                    break;
            }
            if (!winner) {
                break;
            }
        }
        if (winner) {
            System.out.print("Вие отговорихте на всички исторически въпроси с общ резултат: " + score);
            return;
        }

    }

    public static void printCategoryFootball() {
        ArrayList<Integer> questionAsked = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        boolean winner = true;
        int score = 0;

        System.out.println("Добре дошли в света на футбола. Да започваме с въпросите!");

        System.out.println();

        for (int i = 1; i < 4; i++) {
            Random rnd = new Random();
            int number = rnd.nextInt(3) + 1;

            while (questionAsked.contains(number)) {
                number = rnd.nextInt(3)+1;
            }

            switch (number) {
                case 1:
                    System.out.println(i + ". Кой печели Европейското първенство през 2016г. ?");
                    String[] answersForFirstQuestion = {"Португалия", "Белгия", "Франция", "Испания"};

                   shuffleArray(answersForFirstQuestion);

                    System.out.print("Напишете вашият отговор: ");
                    String rightAnswerForFirstQuestion = input.nextLine();

                    if (rightAnswerForFirstQuestion.toLowerCase(Locale.ROOT).equals("Португалия".toLowerCase(Locale.ROOT))) {
                        System.out.println("Поздравления, вие отговорихте правилно!");

                        score++;

                        System.out.println();

                    } else {
                        System.out.println("Грешен отговор, вашият резултат е : " + score);

                        winner = false;
                    }
                    questionAsked.add(number);

                    break;

                case 2:
                    System.out.println(i + ". Кой футболен отбор е спечелил най-много европейски купи? ");
                    String[] answersForSecondQuestion = {"Реал Мадрид", "Валенсия", "Барселона", "ПСЖ"};

                    shuffleArray(answersForSecondQuestion);

                    System.out.print("Напишете вашият отговор: ");
                    String rightAnswerForSecondQuestion = input.nextLine();

                    if (rightAnswerForSecondQuestion.toLowerCase(Locale.ROOT).equals("Реал Мадрид".toLowerCase(Locale.ROOT))) {
                        System.out.println("Поздравления, вие отговорихте правилно!");

                        score++;

                        System.out.println();

                    } else {
                        System.out.println("Грешен отговор, вашият резултат е : " + score);

                        winner = false;
                    }
                    questionAsked.add(number);

                    break;

                case 3:
                    System.out.println(i + ". През коя година Кристиано Роналдо печели първата си златна топка? ");
                    String[] answersForThirdQuestion = {"2008", "2005", "2002", "2010"};

                    shuffleArray(answersForThirdQuestion);

                    System.out.print("Напишете вашият отговор: ");
                    String rightAnswerForThirdQuestion = input.nextLine();

                    if (rightAnswerForThirdQuestion.equals("2008") ) {
                        System.out.println("Поздравления, вие отговорихте правилно!");

                        score++;

                        System.out.println();

                    } else {
                        System.out.println("Грешен отговор, вашият резултат е : " + score);

                        winner = false;
                    }
                    questionAsked.add(number);

                    break;
            }
            if (!winner) {
                break;
            }
        }
        if (winner) {
            System.out.print("Вие отговорихте на всички футболни въпроси с общ резултат: " + score);
            return;
        }
    }
    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Изберете категория от следните ");
        System.out.print("Напишете: 1-за футболна, 2-за историческа, 3-за географска : ");
        int selectedCategory = input.nextInt();

        switch (selectedCategory) {
            case 1:
                printCategoryFootball();
                break;
            case 2:
                printCategoryHistory();
                break;
            case 3:
                printCategoryGeography();
                break;
        }
    }
}
