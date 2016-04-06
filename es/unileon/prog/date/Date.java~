package es.unileon.prog.
public class Date() {

	private int year;
	private int month;
	private int day;
}
	public Date () {

		this.day =0;
		this.month = 0;
		this.year= 0;
}
//get
int getDay(){
	return this.day;
}

int getMonth(){
	return this.Month;
}

int getYear(){
	return this.Year;
}
//set
void setDay(){
	this.day = day;
}

void setMonth(){
	this.month = month;
}

void setYear(){
	this.year = year;
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
		this.day = day;
		this.month = month;
		this.year= year;
	}
}
	boolean isSame(Date another){ // ejercicio if con is Same en clase 1
		return (isSameYear(another) && isSameMonth(another) && isSameDay(another));
	}
	
	boolean isSameYear(DateotherDate){ // ejercicio if con is Same en clase 2
		boolean result = false;
		if (this.year==otherDate.getYear()){
			return =true;
		}else {
			return result;
		}
	}





