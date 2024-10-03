import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        QuizQuestions questions = new QuizQuestions();  // Same class for questions and answers
        Scanner input = new Scanner(System.in);
        char userAnswer;
        int correctCount = 0, wrongCount = 0;

        questions.question1();
        userAnswer = input.next().charAt(0);
        if (userAnswer == questions.answer1) {  // Updated to use the same class
            correctCount++;
        } else {
            wrongCount++;
        }

        questions.question2();
        userAnswer = input.next().charAt(0);
        if (userAnswer == questions.answer2) {
            correctCount++;
        } else {
            wrongCount++;
        }

        questions.question3();
        userAnswer = input.next().charAt(0);
        if (userAnswer == questions.answer3) {
            correctCount++;
        } else {
            wrongCount++;
        }

        questions.question4();
        userAnswer = input.next().charAt(0);
        if (userAnswer == questions.answer4) {
            correctCount++;
        } else {
            wrongCount++;
        }

        questions.question5();
        userAnswer = input.next().charAt(0);
        if (userAnswer == questions.answer5) {
            correctCount++;
        } else {
            wrongCount++;
        }

        questions.question6();
        userAnswer = input.next().charAt(0);
        if (userAnswer == questions.answer6) {
            correctCount++;
        } else {
            wrongCount++;
        }

        questions.question7();
        userAnswer = input.next().charAt(0);
        if (userAnswer == questions.answer7) {
            correctCount++;
        } else {
            wrongCount++;
        }

        questions.question8();
        userAnswer = input.next().charAt(0);
        if (userAnswer == questions.answer8) {
            correctCount++;
        } else {
            wrongCount++;
        }

        questions.question9();
        userAnswer = input.next().charAt(0);
        if (userAnswer == questions.answer9) {
            correctCount++;
        } else {
            wrongCount++;
        }

        questions.question10();
        userAnswer = input.next().charAt(0);
        if (userAnswer == questions.answer10) {
            correctCount++;
        } else {
            wrongCount++;
        }

        double correctScore = correctCount;
        double percentageScore = (correctScore / 10) * 100;

        System.out.println("The total marks are: 100");
        System.out.println("Your marks are: " + (correctCount * 10));
        System.out.println("Total questions are: 10");
        System.out.println("Your correct answers are: " + correctCount + "\nYour wrong answers are: " + wrongCount);
        System.out.println("Your percentage is: " + percentageScore + "%");
    }
}

class QuizQuestions {
    void question1() {
        System.out.println("Q1 What is the capital of France?\n" +
                "A) Berlin\n" +
                "B) Madrid\n" +
                "C) Paris\n" +
                "D) Rome");
    }

    void question2() {
        System.out.println("Q2 What is the largest mammal in the world?\n" +
                "A) Elephant\n" +
                "B) Blue Whale\n" +
                "C) Great White Shark\n" +
                "D) Giraffe");
    }

    void question3() {
        System.out.println("Q3 What is the chemical symbol for gold?\n" +
                "A) Au\n" +
                "B) Ag\n" +
                "C) Pb\n" +
                "D) Fe");
    }

    void question4() {
        System.out.println("Q4 Which planet is known as the Red Planet?\n" +
                "A) Venus\n" +
                "B) Jupiter\n" +
                "C) Mars\n" +
                "D) Saturn");
    }

    void question5() {
        System.out.println("Q5 Who wrote 'Romeo and Juliet'?\n" +
                "A) Charles Dickens\n" +
                "B) Mark Twain\n" +
                "C) William Shakespeare\n" +
                "D) Leo Tolstoy");
    }

    void question6() {
        System.out.println("Q6 What is the hardest natural substance on Earth?\n" +
                "A) Gold\n" +
                "B) Iron\n" +
                "C) Diamond\n" +
                "D) Quartz");
    }

    void question7() {
        System.out.println("Q7 What gas do plants absorb from the atmosphere?\n" +
                "A) Oxygen\n" +
                "B) Carbon Dioxide\n" +
                "C) Nitrogen\n" +
                "D) Helium");
    }

    void question8() {
        System.out.println("Q8 Which is the largest continent?\n" +
                "A) Africa\n" +
                "B) Asia\n" +
                "C) Antarctica\n" +
                "D) Europe");
    }

    void question9() {
        System.out.println("Q9 What is the smallest prime number?\n" +
                "A) 0\n" +
                "B) 1\n" +
                "C) 2\n" +
                "D) 3");
    }

    void question10() {
        System.out.println("Q10 Who painted the Mona Lisa?\n" +
                "A) Vincent Van Gogh\n" +
                "B) Pablo Picasso\n" +
                "C) Leonardo da Vinci\n" +
                "D) Claude Monet");
    }

    // Answer key
    char answer1 = 'c';
    char answer2 = 'b';
    char answer3 = 'a';
    char answer4 = 'c';
    char answer5 = 'c';
    char answer6 = 'c';
    char answer7 = 'b';
    char answer8 = 'b';
    char answer9 = 'c';
    char answer10 = 'c';
}
