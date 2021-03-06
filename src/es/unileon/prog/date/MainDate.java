package src.es.unileon.prog.date;
//Clase main Date
import java.*;
import src.es.unileon.prog.date.*;
public class MainDate{
	public static void main(String[] args) {
		try{

			Date fecha1 = new Date (5, 4, 2016);
			Date fecha2 = new Date (6, 4, 2016);
			//the year of fecha1 is same year than fecha 2
			if (fecha1.isSameYear(fecha2)){
				System.out.println("The two Dates have the same year");
			}
			//the month of fecha1 is same year than fecha 2
			if (fecha1.isSameMonth(fecha2)){
				System.out.println("The two Dates have the same month");
			}
			//the day of fecha1 is same year than fecha 2
			if (fecha1.isSameDay(fecha2)){
				System.out.println("The two Dates have the same day");
			}
			//get month name para fecha1 y fecha2
			System.out.println("The name of the month of fecha1 = " +fecha1.getMonthName());
			System.out.println("The name of the month of fecha2 = " + fecha2.getMonthName());

			//check day para fecha1 y fecha2
			System.out.println("The day of fecha 1 is right = " + fecha1.checkDay());
			System.out.println("The day of fecha 2 is right = " + fecha2.checkDay());

			//get month season para fecha1 y fecha2
			System.out.println("The month season of fecha 1 = " + fecha1.getMonthSeason());
			System.out.println("The month season of fecha 2 = " + fecha2.getMonthSeason());

			/*get months left para fecha1 y fecha2
			System.out.println("The months left of fecha 1 until the end of the year = " + fecha1.getMonthsLeft());
			System.out.println("The months left of fecha 2 until the end of the year = " + fecha2.getMonthsLeft()); */

			//print date
			System.out.println("The date of fecha 1 = " + fecha1.printDate());
			System.out.println("The date of fecha 2 = " + fecha2.printDate());

			/*print all dates de fecha1 y fecha2
			System.out.println("The all dates of fecha 1 until the end of the month = " + fecha1.printAllDates());
			System.out.println("The all dates of fecha 2 until the end of the month = " + fecha2.printAllDates()); */

			/*For a date, print the months with the same number of days as the month of this date.
			System.out.println("The months with the same number of days are(fecha 1)= " + fecha1.printMonthsWithSameNumberOfDays());
			System.out.println("The months with the same number of days are(fecha 2) = " + fecha2.printMonthsWithSameNumberOfDays()); */

			//For a date, count the number of days since the first day of the year (do not consider leap years)
			System.out.println("The number of days since the first day of the year (fecha 1) = " + fecha1.countDays());
			System.out.println("The number of days since the first day of the year (fecha 2) = " + fecha2.countDays());

			//number Of Attemps To Generate Random Date con el while
			System.out.println("The number Of Attemps To Generate Random Date (fecha 1) = " + fecha1.numberOfAttempsToGenerateRandomDate());
			System.out.println("The number Of Attemps To Generate Random Date (fecha 2) = " + fecha2.numberOfAttempsToGenerateRandomDate());

			//number Of Attemps To Generate Random Date con el do while
			System.out.println("The number Of Attemps To Generate Random Date (fecha 1) = " + fecha1.numberOfAttempsToGenerateRandomDate2());
			System.out.println("The number Of Attemps To Generate Random Date (fecha 2) = " + fecha1.numberOfAttempsToGenerateRandomDate2());

			/*show the day of the week of the given date.
			System.out.println("The day of the week of fecha 1 = " + fecha1.showTheDayOfTheWeek("Tuesday"));
			System.out.println("The day of the week of fecha 2 = " + fecha2.showTheDayOfTheWeek("Sunday")); */

			System.out.println("Terminando programa"); //probando a ver si esto lo immprimia
		} catch (Exception DateException) {
			System.err.println("Date error");
		}

	}
}


