package calculator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
    Scanner scan = new Scanner(System.in);
    //Для считывания введенных данных создаем переменную типа String
    String expretion, number1 = "", number2 = "", romChifrs = "";
    char operator = '+';
    int first, second, result, count = 0, count1 = 0, count2 = 0, indexOfOper = 0;
    expretion = scan.nextLine();
   //Для хранения введеных данных создаем массив, в котором будут храниться каждый символ отдельно 
    char[] array = new char[expretion.length()];
    array = expretion.toCharArray();
    
    // Проверяем наличие предусмотренных задачей операторов (+ - / *) и сохраняем его индекс в переменной indexOfOper
    for (int a = 0; a < array.length; a++) {
    	
    	if(array[a] == '+' || array[a] == '-' || array[a] == '*' || array[a] == '/') {
    		count++;
    		indexOfOper = a;
    	}
    	else if (count != 1 && a == array.length - 1) {
    		System.out.println("Ошибка. Не введены предусмотренные задачей виды операторов.");
		throw new Exception();}	
    }
    
    // Проверяем на наличие цифр арабских и латинских, при наличии обоих выбрасываем исключение
    for (int a = 0; a < array.length; a++) {
    	if(array[a] == 'I' ||  array[a] == 'V' || array[a] == 'X') {
    		count1++;
    	}
    	if(array[a] == '1' ||  array[a] == '2' || array[a] == '3' || array[a] == '4' || array[a] == '5' || array[a] == '6' || array[a] == '7' || array[a] == '8' || array[a] == '9') {
    		count2++;
    	}
    	if (count1 > 0 && count2 > 0) {
    		System.out.println("Ошибка. Содержатся арабские и латинские цифры.");
		throw new Exception();}	
    }
    
    // При наличии римских цифр, выделяем их и преобразовываем в арабские. В переменную operator сохраняем символ оператора
   
    	if(count1 > 0) {
    	operator = array[indexOfOper];
    	 if (array.length > 9) {
    			System.out.println("Ошибка. Введено черезмерное количество символов.");
    		throw new Exception();}	
    		for (int a = 0; a < indexOfOper; a++) {
    			String str = Character.toString(array[a]);
    			number1 = number1+str;
    		}
    		for (int a = indexOfOper+1; a < array.length; a++) {
    			String str = Character.toString(array[a]);
    			number2 = number2+str;
    		}
    	// передаем классу Converter полученные римские цифры путем создания объекта для перевода в арабские цифры
    		Converter conv = new Converter (number1, operator, number2);
    		
    	}
    	 // При наличии только арабских цифр (определяется значением count1), определяем какое действие необходимо сделать путем поиска оператора
    if(count1 == 0) {	
    count = 0;
    if (array.length > 5) {
		System.out.println("Ошибка. Введено черезмерное количество символов.");
	throw new Exception();}	
    for (int a = 0; a < array.length; a++) {
    	if (array[a] == '+') {
    		count++;
    		Addition add = new Addition (array);
    	}
    	if (array[a] == '-') {
    		count++;
    		Subtraction sub = new Subtraction (array);
    	}
    	if (array[a] == '*') {
    		count++;
    		Multiplication mult = new Multiplication (array);
    	}
    	if (array[a] == '/') {
    		count++;
    		Division div = new Division (array);
    	}
    	if (a == array.length - 1 && count == 0) {
    	// Если отсутствуют предусмотренные задачей операторы выбрасывается исключение
    		System.out.println("Ошибка. Не введены предусмотренные задачей виды операторов");
    		throw new Exception();
    	}
    }
    
	}
	}

}
