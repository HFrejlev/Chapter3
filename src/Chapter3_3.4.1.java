class Chapter_3_Programmering {

    public static void main(String[] args) {

        // 3.4.1 Write an if statement that increases pay by 3% if score is greather than 90.
        // Otherwise increases pay by 1%.

        //Here's a variable that gives us the information that the score is 94, which is greater than 90.
        int scoreA = 94;

        //This if-else-statement will display text is the score is above 90 and also a text if the score is below 90.
        if (scoreA > 90)
            System.out.println("Your pay has been raised by 9%");
        else
            System.out.println("Too bad. Your below average performance has only rewarded you with a 1% increase in pay.");

        // 3.4.2 What is the output of the code in (a) and (b) if number is 3+? What if number is 35?
        //       What if number is 35?

        //Option (a) - the output are both prints since there is else-statement.
        int number = 30;
        if (number % 2 == 0)
            System.out.println(number + " is even.");

            System.out.println(number + " is odd");

        //Option (b) - the output in this code only one of the choices, since there is a condition in if/else.
        if (number % 2 == 0)
            System.out.println(number + " is even.");
        else
            System.out.println(number + " is odd");

        // If the number 35 then all of the prints would be odd, since 35 is not divisible.


        

    }


}