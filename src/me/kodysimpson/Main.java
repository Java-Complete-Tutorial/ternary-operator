package me.kodysimpson;

public class Main {

    public static void main(String[] args) {

        //Ternary Operator in Java -
        // A shorthand way of writing an if/else statement that returns one of two values.

        //Here is an example of how you would traditionally write an if/else statement
        String message;
        if (true){
            message = "Hello World";
        }else{
            message = "Goodbye World";
        }

        //Here is an example of how you would write a ternary operator to do the same thing
        message = (true) ? "Hello World" : "Goodbye World";

        //It is not an operator in the traditional sense that we would think of one being,
        //but it is an operator in Java and takes 3 operands:

        //1. The condition that you want to evaluate
        //2. The value that you want to return if the condition is true
        //3. The value that you want to return if the condition is false

        //In my experience, they are most useful in situations in which you want to conditionally
        //have different values in-line with a statement.

        //A common example of this is when you want to output a message differently depending on
        //whether a condition is true or false.
        boolean wonGame = false;
        int points = 69;
        System.out.println("The game has finished! You " + (wonGame ? "won" : "lost") + " with " + points + " points!");

        //More examples of a situation using the ternary operator:
        String message2 = (points > 50) ? "You are a champion!" : "You need to practice more!";
        System.out.println(message2);

        //See if there are any situations in your code which can be simplified using a ternary operator.

    }
}
