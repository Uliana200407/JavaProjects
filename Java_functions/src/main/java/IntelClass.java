import java.util.*;
import java.util.stream.Collectors;

public abstract class IntelClass implements ParityCheck{
    public static void main(String[] args) {
        //first task
        System.out.println ( "\nThat's a randomizer for values!\n" );
        Random newRandom = new Random ();
        List < Integer > list = new ArrayList <> ();
        for (int i = 0; i < 10; i++) {  //creating a cycle for generating numbers
            list.add ( newRandom.nextInt ( 10 ) );
        }
        List < Integer > squaresNum = list.stream ().map ( number -> number * number ).collect ( Collectors.toList () );
        int result = squaresNum.stream ().reduce ( 0, Integer::sum );


        System.out.println ( list );
        System.out.println ( "That's a quantity of squaring elements!" );
        System.out.println ( result );
        //second task
        System.out.println ( "That's a quantity of couple values !" );
        int elements = (int) (list.stream ().filter ( (n) -> (n % 2) == 0 )).count ();//Filter couple values
        System.out.println ( "elements = " + elements );
        //third task

        Scanner scanner = new Scanner ( System.in );//the function to input surname
        String surnames;
        ArrayList < String > stringArrayList = new ArrayList < String > ();
        System.out.println ( "\n\nPlease enter surnames here (entering should be in one by one order) : " );
        while (true) {
            System.out.println ( "Surname is : " );
            surnames = scanner.nextLine ();
            if (surnames.equals ( "" ) == true)    //transfer to another line
                break;
            stringArrayList.add ( surnames );
        }
//        System.out.println ();

        System.out.println ( "list of entered surnames : = " + stringArrayList.size () );
        System.out.println ( "Surnames, which start from the letter (J) : " );
        stringArrayList.stream ().filter ( sn -> sn.charAt ( 0 ) == 'J' ).forEach ( System.out::println );/*Filtering surnames
        and output everything that starts from J*/

        //last task

        System.out.println ( "\n\nPlease enter values here (entering should be in one by one order) : " );
        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner scanner1 = new Scanner(System.in);//the function to input values;


            System.out.println("Value is: ");
            String input_line = scanner.nextLine ().strip ();
                                                             //transfer to another line
        while (!input_line.equals("")) {
            numbers.add(Integer.parseInt(input_line));//String to Integer
            System.out.println("Value is: ");
            input_line = scanner.nextLine().strip();
        }

        System.out.println("list of entered numbers : " + numbers);



        ParityCheck check_for_parity = number -> number % 2 == 0;//Check for parity
        find_sum_even_and_odd_numbers(numbers, check_for_parity);
    }

    static void find_sum_even_and_odd_numbers( ArrayList <Integer> numbers, ParityCheck lambda ){
            int even_sum = 0, odd_sum = 0;

            for (Integer num : numbers) { //so here we create cycle, call lambda and redistribute it to different sums - odd or even
                if (lambda.operations ( num )) {
                    even_sum += num;
                } else {
                    odd_sum += num;
                }
            }

            System.out.println ( "Even sum: " + even_sum );
            System.out.println ( "Odd sum: " + odd_sum );
        }


        @Override
        public boolean operations ( int num){
            return false;
        }
    }







