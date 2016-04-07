package es.unileon.prog.
public class Date() {

	private int year;
	private int month;
	private int day;

	public Date () {

		this.day =0;
		this.month = 0;
		this.year= 0;
	}

	public class Date (int day, int month, int year) throws DateException{

		String Buffer mensaje = new StringBugger();

		if ((day>31) || (day < 0)){
			mensaje.append("Day error. Day value must be between 0 and 31.");
		}
		if ((month>12) || (month < 0)){
			mensaje.append("Month error. Day value must be between 1 and 12.");
		}
		if (year <0){
			mensaje.append("Year error. Year value must be between 0 and infinite.");
		}
		if (mensaje.length()!=0){
		thorw new DateException(mensaje.toString());
		} else {
			this.setDay(day);
			this.setMonth(month);
			this.setYear(year);
		}

	}

	//get y sets de day
	int getDay(){
		return this.day;
	}

	void setDay(int day){
		this.day = day;
	}

	//get y sets de month
	int getMonth(){
		return this.Month;
	}

	void setMonth(int month){
		this.month = month;
	}

	//get y sets de year
	int getYear(){
		return this.Year;
	}

	void setYear(int year){
		this.year = year;
	}


		//metodo is same year
		boolean isSameYear(Date otherDate){ // ejercicio if con is Same en clase 2
			boolean result = false;
			if (this.year==otherDate.getYear()){
				result =true;
			}
			return result;
		}
		//metodo is same month
		boolean isSameMonth(Date otherDate){ // ejercicio if con is Same en clase 2
			boolean result = false;
			if (this.month==otherDate.getMonth()){
				result =true;
			}
			return result;
		}
		//metodo is same day
		boolean isSameDay(Date otherDate){ // ejercicio if con is Same en clase 2
			boolean result = false;
			if (this.day==otherDate.getDay()){
				result = true;
			} 
			return result;
		}
		//metodo is same
		boolean isSameDay(Date otherDate){ // ejercicio if con is Same en clase 2
			return (isSameYear(otherDate) && isSameMonth(otherDate) && isSameDay(otherDate));
		}


		//SWITCH A method that prints the name of the month
		String getMonthName(this.getMonth){
			String month = new String ();
				switch (month) {
				case 1: month = "Enero";
				break;
				case 2: month = "Febrero";
				break;
				case 3: month = "Marzo";
				break;
				case 4: month = "Abril";
				break;
				case 5: month = "Mayo";
				break;
				case 6: month = "Junio";
				break;
				case 7: month = "Julio";
				break;
				case 8: month = "Agosto";
				break;
				case 9: month = "Septiembre";
				break;
				case 10: month = "Octubre";
				break;
				case 11: month = "Noviembre";
				break;
				case 12: month = "Diciembre";
				break;
				}

			return month;
		}
		//A method that checks if the day of the month is right
		String checkDay(this.getDay){
			boolean checkeoday = true;
				switch (month) {
				case 2:
					if (day>28) {
						
				break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (day>30) {
				
				break;





		//A method that prints the season of this month
		String getMonthSeason(this.getMonth){
			String season = new String ();
				switch (month) {
				case 1: 
				case 2:
				case 3: month = "It is Winter";
				break;
				case 4: 
				case 5: 
				case 6: month = "It is Spring";
				break;
				case 7:
				case 8: 
				case 9: month = "It is Summer";
				break;
				case 10:
				case 11:
				case 12: month = "It is Autumn";
				break;
				}
			return month;
		}






}
