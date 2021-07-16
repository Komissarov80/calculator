package calculator;

public class Converter {
String number1, number2;
char operator;
int numberInt1, numberInt2, result, count1 = 0, count2 = 0;

	public Converter (String number1, char operator, String number2) throws Exception {
		this.number1 = number1;
		this.operator = operator;
		this.number2 = number2;
	   switch(number1){
	   case "I" :  numberInt1 = 1;
	   count1++;
	   break;
	   case "II" : numberInt1 = 2;
	   count1++;
	   break;
	   case "III" : numberInt1 = 3;
	   count1++;
	   break;
	   case "IV" : numberInt1 = 4;
	   count1++;
	   break;
	   case "V" : numberInt1 = 5;
	   count1++;
	   break;
	   case "VI": numberInt1 = 6;
	   count1++;
	   break;
	   case "VII" : numberInt1 = 7;
	   count1++;
	   break;
	   case "VIII" : numberInt1 = 8;
	   count1++;
	   break;
	   case "XI" : numberInt1 = 9;
	   count1++;
	   break;
	   case "X" : numberInt1 = 10;
	   count1++;
	   break;
	   }
	   switch(number2){
	   case "I" :  numberInt2 = 1;
	   count2++;
	   break;
	   case "II" : numberInt2 = 2;
	   count2++;
	   break;
	   case "III" : numberInt2 = 3;
	   count2++;
	   break;
	   case "IV" : numberInt2 = 4;
	   count2++;
	   break;
	   case "V" : numberInt2 = 5;
	   count2++;
	   break;
	   case "VI": numberInt2 = 6;
	   count2++;
	   break;
	   case "VII" : numberInt2 = 7;
	   count2++;
	   break;
	   case "VIII" : numberInt2 = 8;
	   count2++;
	   break;
	   case "XI" : numberInt2 = 9;
	   count2++;
	   break;
	   case "X" : numberInt2 = 10;
	   count2++;
	   break;
	   }
	   if (count1 == 0 || count2 == 0) {
		   System.out.println("Ошибка. Введены неверные символы.");
   		throw new Exception();
	   }
	   switch (operator) {
	   case '+' : result = numberInt1 + numberInt2;
	   break;
	   case '-' : result = numberInt1 - numberInt2;
	   break;
	   case '*' : result = numberInt1 * numberInt2;
	   break;
	   case '/' : result = numberInt1 / numberInt2;
	   }
	   System.out.println(result);
	}



	
}
