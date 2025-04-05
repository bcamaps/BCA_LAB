<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html> 
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>Fibonacci Prime</title> 
    </head> 
    <body> 
        <h4>......First 10 Fibonacci Numbers.......</h4> 
        <% 
            int f1=0, f2=1,f3; for(int i=0;i<10;i++){ out.print(" " + f1 + " "); 
            f3=f1+f2; f1=f2; f2=f3; } 
        %> 
        <h4>......First 10 Prime Numbers.......</h4> 
        <% 
            int num=2,count=0; while(count<10){ boolean isPrime=true; for(int i=2; i<=num/2;i++){ if(num%i==0){ isPrime=false; break; } } if(isPrime){ out.print(num+ " "); count++; 
            } 
            num++;
    } 
        %> 
    </body> 
</html>
