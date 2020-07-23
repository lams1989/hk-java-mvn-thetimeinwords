package com.lams1989.thetimeinwords;

public class TimeInWords {

	public static String timeInWords(int h, int m) {
		int min = m;
		int hrs = h;
		String msjHrs = "";
		String msjMin = "";
		String txtMin = "";
		String msjResult = "";

		msjHrs = hrsAnalizer(hrs);

		if (min == 0 || min == 15 || min == 30 || min == 45) {
			msjResult = espcialCase(min, hrs);

		}
		else if (min < 10 && min > 0) {
			txtMin = "minute past ";
			msjMin = minAnalizer(min);
			msjResult = msjMin + txtMin + msjHrs;
		}

		else if (min < 30 && min > 9) {
			txtMin = "minutes past ";
			msjMin = minAnalizer(min);
			msjResult = msjMin + txtMin + msjHrs;
		}
		else if (min > 30 && min < 60) {
			msjHrs= hrsAnalizer(hrs+1);
			txtMin = "minutes to ";
			msjMin = minAnalizer(min);
			msjResult = msjMin + txtMin + msjHrs;
		}

			return msjResult;

	}

	public static String espcialCase(int min, int hrs) {
		String txtMin = "";
		String msjHrs= hrsAnalizer(hrs);
		if (min == 0) {
			txtMin = msjHrs + "o' clock ";
		}

		if (min == 15) {
			txtMin = "quarter past " + msjHrs;
		}
		if (min == 30) {
			txtMin = "half past " + msjHrs;
		}
		if (min == 45) {
			if(hrs == 12) {
				hrs = 1;
				msjHrs= hrsAnalizer(hrs);
				txtMin = "quarter to " + msjHrs;
			}else
				msjHrs= hrsAnalizer(hrs + 1);
			txtMin = "quarter to " + msjHrs;
		}

		return txtMin;
	}

	public static String hrsAnalizer(int hrs) {
		String msjHrs = "";
		switch (hrs) {
		case 1:
			msjHrs = "one ";
			break;

		case 2:
			msjHrs = "two ";
			break;

		case 3:
			msjHrs = "three ";
			break;

		case 4:
			msjHrs = "four ";
			break;

		case 5:
			msjHrs = "five ";
			break;

		case 6:
			msjHrs = "six ";
			break;

		case 7:
			msjHrs = "seven ";
			break;

		case 8:
			msjHrs = "eight ";
			break;

		case 9:
			msjHrs = "nine ";
			break;

		case 10:
			msjHrs = "ten ";
			break;

		case 11:
			msjHrs = "eleven ";
			break;

		case 12:
			msjHrs = "twelve ";
			break;

		default:
			break;
		}
		return msjHrs;
	}

	public static String minAnalizer(int min) {

		String msjMin = "";

		switch (min) {
		case 1:
		case 59:
			msjMin = "one ";
			break;

		case 2:
		case 58:
			msjMin = "two ";
			break;

		case 3:
		case 57:
			msjMin = "three ";
			break;

		case 4:
		case 56:
			msjMin = "four ";
			break;

		case 5:
		case 55:
			msjMin = "five ";
			break;

		case 6:
		case 54:
			msjMin = "six ";
			break;

		case 7:
		case 53:
			msjMin = "seven ";
			break;

		case 8:
		case 52:
			msjMin = "eight ";
			break;

		case 9:
		case 51:
			msjMin = "nine ";
			break;

		case 10:
		case 50:
			msjMin = "ten ";
			break;

		case 11:
		case 49:
			msjMin = "eleven ";
			break;

		case 12:
		case 48:
			msjMin = "twelve ";
			break;

		case 13:
		case 47:
			msjMin = "thirteen ";
			break;

		case 14:
		case 46:
			msjMin = "fourteen ";
			break;

		case 16:
		case 44:
			msjMin = "sixteen ";
			break;

		case 17:
		case 43:
			msjMin = "seventeen ";
			break;

		case 18:
		case 42:
			msjMin = "eighteen ";
			break;

		case 19:
		case 41:
			msjMin = "nineteen ";
			break;

		case 20:
		case 40:
			msjMin = "twenty ";
			break;

		case 21:
		case 39:
			msjMin = "twenty one ";
			break;

		case 22:
		case 38:
			msjMin = "twenty two ";
			break;

		case 23:
		case 37:
			msjMin = "twenty three ";
			break;

		case 24:
		case 36:
			msjMin = "twenty four ";
			break;

		case 25:
		case 35:
			msjMin = "twenty five ";
			break;

		case 26:
		case 34:
			msjMin = "twenty six ";
			break;

		case 27:
		case 33:
			msjMin = "twenty seven ";
			break;

		case 28:
		case 32:
			msjMin = "twenty eigth ";
			break;

		case 29:
		case 31:
			msjMin = "twenty nine ";
			break;

		default:
			break;
		}
		return msjMin;
	}

}
