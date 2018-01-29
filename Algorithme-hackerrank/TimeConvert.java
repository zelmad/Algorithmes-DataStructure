import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConvert {

    static String timeConversion(String s) {
        // Complete this function
		String[] searchAMPM = s.split(":");
		String timeConverted = "";
	    if(searchAMPM[searchAMPM.length-1].charAt(searchAMPM[searchAMPM.length-1].length()-2) == 'P' && Integer.parseInt(searchAMPM[0]) != 12){
			int search = Integer.parseInt(searchAMPM[0]) + 12;
			searchAMPM[0] = ""+search;
			timeConverted = searchAMPM[0]+":"+searchAMPM[1]+":"+searchAMPM[2].charAt(0)+""+searchAMPM[2].charAt(1);
		}
		else if(searchAMPM[searchAMPM.length-1].charAt(searchAMPM[searchAMPM.length-1].length()-2) == 'P' && Integer.parseInt(searchAMPM[0]) == 12){
			searchAMPM[0] = "12";
			timeConverted = searchAMPM[0]+":"+searchAMPM[1]+":"+searchAMPM[2].charAt(0)+""+searchAMPM[2].charAt(1);
		}
		else if(searchAMPM[searchAMPM.length-1].charAt(searchAMPM[searchAMPM.length-1].length()-2) == 'A' && Integer.parseInt(searchAMPM[0]) == 12){
			searchAMPM[0] = "00";
			timeConverted = searchAMPM[0]+":"+searchAMPM[1]+":"+searchAMPM[2].charAt(0)+""+searchAMPM[2].charAt(1);
		}
		else{
			timeConverted = searchAMPM[0]+":"+searchAMPM[1]+":"+searchAMPM[2].charAt(0)+""+searchAMPM[2].charAt(1);
		}
		return timeConverted;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
