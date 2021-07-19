package calculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Converter {
String number1, number2, resultRome="";
char operator, convertingNum;

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
	   case "IX" : numberInt1 = 9;
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
	   case "IX" : numberInt2 = 9;
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
	   //Результат вычисления (result) записываем в массив char
	   String s = Integer.toString(result);
	   char [] listOfNumbers = new char[s.length()];
	   listOfNumbers = ("" + result).toCharArray();
	   
	   //Если количество элементов в массиве 3, то результат сложения = 100
	   if (s.length() == 3) {
		   resultRome = "C";
	   }
	   
	   // Если количество элементов в массиве 1, то это число до 10
	   if (s.length() == 1) {
		   switch(result){
		   case 1 :  resultRome = "I";
		   break;
		   case 2 : resultRome = "II";
		   break;
		   case 3 : resultRome = "III";
		   break;
		   case 4 : resultRome = "IV";
		   break;
		   case 5 : resultRome = "V";
		   break;
		   case 6: resultRome = "VI";
		   break;
		   case 7 : resultRome = "VII";
		   break;
		   case 8 : resultRome = "VIII";
		   break;
		   case 9 : resultRome = "IX";
		   break;
		   case 0 : resultRome = "0";
		   break;
		   }
	   }
	   
	   //Если элементов в массиве 2
	   if (s.length() == 2) {
	     // Определяем первое и второе число	   
		  String num1 = Character.toString(listOfNumbers[0]), num2 = Character.toString(listOfNumbers[1]);
		  String first = "", second = "";
		  switch (num1) {
		  case "1" : first = "X";
		  break;
		  case "2" : first = "XX";
		  break;
		  case "3" : first = "XXX";
		  break;
		  case "4" : first = "XL";
		  break;
		  case "5" : first = "L";
		  break;
		  case "6" : first = "LX";
		  break;
		  case "7" : first = "LXX";
		  break;
		  case "8" : first = "LXXX";
		  break;
		  case "9" : first = "XC";
		  break;
		  }
		  switch (num2) {
		  case "1" : second = "I";
		  break;
		  case "2" : second = "II";
		  break;
		  case "3" : second = "III";
		  break;
		  case "4" : second = "IV";
		  break;
		  case "5" : second = "V";
		  break;
		  case "6" : second = "VI";
		  break;
		  case "7" : second = "VII";
		  break;
		  case "8" : second = "VIII";
		  break;
		  case "9" : second = "IX";
		  break;
		  
	   }
	
	   resultRome = resultRome + first + second;
	}

	   System.out.println(resultRome);

	}	
}
