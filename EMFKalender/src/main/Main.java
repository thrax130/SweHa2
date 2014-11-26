package main;

import emfKalender.Day;
import emfKalender.EmfKalenderFactory;
import emfKalender.MonthEnum;
import emfKalender.Week;
import emfKalender.Year;
import emfKalender.impl.EmfKalenderFactoryImpl;

public class Main {

	private static String ueberschrift = "KW   Mo Di Mi Do Fr Sa So";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmfKalenderFactory fac = new EmfKalenderFactoryImpl();
		Year y = fac.createYear(2015);
		System.out.println(printYear(y));
	}
	
	private static String printYear(Year year) {
		MonthEnum aktMonth = null;
		String ausgabe = "### "+year.getDate()+" ";
		for(int i = ausgabe.length(); i < ueberschrift.length();i++) {
			ausgabe += "#";
		}
		for(Week w : year.getWeeks()) {
			Day d = w.getDays().get(0); // first day of week
				if(aktMonth != d.getMonth()) { // new month
					//new month
					ausgabe += printMonthHeader(d.getMonth());
					aktMonth = d.getMonth();
				}
				ausgabe += "\n"+printWeek(w,aktMonth);
				//check whether last day of week belongs to current month
				MonthEnum lastDayOfWeekMonth = w.getDays().get(w.getDays().size()-1).getMonth();
				if( lastDayOfWeekMonth != aktMonth) {
					//current week has days of the next month, so start new month printing
					aktMonth = lastDayOfWeekMonth;
					ausgabe += printMonthHeader(aktMonth);
					//and print last week again
					ausgabe += "\n"+printWeek(w,aktMonth);
				}
			}
		return ausgabe;
	}
	
	private static String printWeek(Week week, MonthEnum aktMonth) {
		String ausgabe = "";
		ausgabe += String.format("%02d",week.getWeekNumber())+":  ";
		//print empty space for missing days in a week
		for(int i = 1; i < week.getDays().get(0).getWeekDay().getValue(); i++) {
			ausgabe += "   ";
		}
		for(Day d : week.getDays()) {
			if(aktMonth == d.getMonth()) {
				ausgabe += String.format("%02d", d.getDayNumber())+" ";
			} else {
				ausgabe += "   ";
			}
		}
		return ausgabe;
	}
	
	private static String printMonthHeader(MonthEnum month) {
		String header = "\n\n*** "+month.getLiteral()+" ";
		for(int i = header.length()-2; i < ueberschrift.length();i++) {
			header += "*";
		}
		header += "\n"+ueberschrift;
		return header;
	}

}
