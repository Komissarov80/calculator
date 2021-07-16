package calculator;

public class Subtraction {

	char [] arrayAdd;
	static int result = 0;
	int index;
	int first, second;
public Subtraction (char[] arrayAdd) throws Exception{
	this.arrayAdd = arrayAdd;

for (int a = 0; a < arrayAdd.length; a++) {
	String s = null;
	if (arrayAdd[a] == '-') {
	if (a - 1 > 0) {
		s = Character.toString(arrayAdd[0])+Character.toString(arrayAdd[1]);
		first = Integer.parseInt(s);
	}
	else {first = Character.getNumericValue(arrayAdd[a - 1]);}
	if (a + 1 < arrayAdd.length - 1) {
	s = Character.toString(arrayAdd[a+1])+Character.toString(arrayAdd[a+2]);
	second = Integer.parseInt(s);
	}
	else {second = Character.getNumericValue(arrayAdd[a+1]);}
	//Проверяем не превышают ли числа заданных ограничений (10)
	if (first > 10 || second > 10) {
		System.out.println("Введенные вами числа превышают 10");
		throw new Exception();
	}
	result = first - second;
	System.out.println(result);
	}
}
}
	
}
