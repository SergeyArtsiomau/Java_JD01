package drim.strim.sout;

public class HomeworkLesson2 {

	public static void main(String[] args) {
		int pervayaPeremennaya = 2;
		int vtorayaPeremennaya = 3;
		int tretyaPeremennaya = 4;
		int rezult = sredneeArifmeticheskoe(pervayaPeremennaya, vtorayaPeremennaya, tretyaPeremennaya);
		System.out.println("rezult = " + rezult);
		iCanDoIt();
		int x = 5;
		int y = 6;
		int rez = triChisla(x, y);
		System.out.println("rez = " + rez);
	}

	static int sredneeArifmeticheskoe(int firstNumber, int secondNumber, int thirdNumber) {
		int result = (firstNumber + secondNumber + thirdNumber) / 3;
		return result;
	}

	static void iCanDoIt() {
		System.out.println("I can do it!");
	}

	static int triChisla(int firstNumber, int secondNumber) {
		int dopPeremennaya = firstNumber + secondNumber;
		firstNumber *= secondNumber;
		int rez = (dopPeremennaya + firstNumber);
		return rez;
	}
}
