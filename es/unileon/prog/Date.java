package es.unileon.prog.
public class Date() {
	int dia;
	int mes;
	int anio;
	this.dia =0;
	this.mes = 0;
	this.anio= 0;
}


public class Date (int dia, int mes) throws DateException{
	String Buffer mensaje = new StringBugger()
	if ((dia>31) || (dia < 0)){
		mensaje.append("Error en el dia");
	}
	if ((mes>12) || (mes < 0)){
		mensaje.append("Error en el mes");
	}
	if (anio <0){
		mensaje.append("Error en el anio");
	}
	if (mensaje.length()!=0){
	thorw new DateException(mensaje.toString());
	} else {
		this.dia = dia;
		this.mes = mes;
		this.anio= anio;
	}

	boolean isSame(Date another){
	return (isSameYear(another) && isSameMonth(another) && isSameDay(another));
	}




}









