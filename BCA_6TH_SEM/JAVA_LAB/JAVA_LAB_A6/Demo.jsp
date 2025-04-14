<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html> 
    <head> 
        <!-- Sets character encoding and page title -->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>Fibonacci Prime</title> 
    </head> 
    <body> 
        <!-- Display Fibonacci heading -->
        <h4>......First 10 Fibonacci Numbers.......</h4> 
        
        <%
            // Initialize first two Fibonacci numbers
            int f1 = 0, f2 = 1, f3;

            // Loop to print first 10 Fibonacci numbers
            for (int i = 0; i < 10; i++) {
                out.print(" " + f1 + " "); // Print current number
                f3 = f1 + f2;  // Calculate next number
                f1 = f2;       // Shift f1 and f2 for next iteration
                f2 = f3;
            }
        %> 

        <!-- Display Prime numbers heading -->
        <h4>......First 10 Prime Numbers.......</h4> 

        <%
            int num = 2, count = 0; // Start from 2, the first prime number

            // Loop until 10 prime numbers are found
            while (count < 10) {
                boolean isPrime = true;

                // Check if num is prime
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                // If prime, print and increment count
                if (isPrime) {
                    out.print(num + " ");
                    count++;
                }

                num++; // Check next number
            }
        %> 
    </body> 
</html>
