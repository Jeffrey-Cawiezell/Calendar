import java.util.Scanner;
public class Calendar{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);
        int day = 1;
        int y, x, m, d;
            y = year - (14 - month) / 12;
            x = y + y/4 - y/100 + y/400;
            m = month + 12 * ((14 - month) / 12) - 2;
            d = (day + x + (31 * m)/ 12) % 7;
    	System.out.println("---------------------");
        System.out.print("    ");
    	switch(month){
    		case 1:
    			System.out.print("January");
    			break;
    		case 2:
    			System.out.print("February");
    			break;
    		case 3:
    			System.out.print("March");
    			break;
    		case 4:
    			System.out.print("April");
    			break;
    		case 5:
    			System.out.print("May");
    			break;
    		case 6:
    			System.out.print("June");
    			break;
    		case 7:
    			System.out.print("July");
    			break;
    		case 8:
    			System.out.print("August");
    			break;
    		case 9:
    			System.out.print("September");
    			break;
    		case 10:
    			System.out.print("October");
    			break;
    		case 11:
    			System.out.print("November");
    			break;
    		case 12:
    			System.out.print("December");
    			break;
    	}
        System.out.println(" " + year);
		System.out.println("---------------------");
		System.out.println(" Su Mo Tu We Th Fr Sa");
        int max_Day = 31;
        boolean leapYear = false;
        if(((year % 4) == 0)&&(year % 100 != 0)||((year % 400) == 0)){
	            leapYear = true;}
            switch (month){
            	case 1:
            		max_Day = 31;
            		break;
            	case 2:
            		if(leapYear == true){
            			max_Day = 29;
            		}
            		else{
            			max_Day = 28;
            		}
            		break;
            	case 3:
            		max_Day = 31;
            		break;
            	case 4:
            		max_Day = 30;
            		break;
            	case 5:
            		max_Day = 31;
            		break;
            	case 6:
            		max_Day = 30;
            		break;
            	case 7:
            	case 8:
            		max_Day = 31;
            		break;
            	case 9:
            		max_Day = 30;
            		break;
            	case 10:
            		max_Day = 31;
            		break;
            	case 11:
            		max_Day = 30;
            		break;
            	case 12:
            		max_Day = 31;
            		break;   

            }
            int col = 0;
            while(col < d){
             System.out.printf("   ");
             col++;
            }
            for(day = 1; day <= max_Day; ++day){
                System.out.printf(" %2d", day);
                if(col != 0 && col % 6 == 0){
                    System.out.println();
                    col = 0;
                }
                else{
                    col++;
                }
            }
            if(col != 0 && col % 6 == 0){
                System.out.println("\n---------------------");
                System.out.println();
            }
            else if(col == 3){
                System.out.print("\n");
                System.out.print("---------------------");
                System.out.println();
            }
            else if(col == 4){
                System.out.print("\n");
                System.out.print("---------------------");
                System.out.println();
            }
            else if(col == 2){
                System.out.print("\n");
                System.out.print("---------------------");
                System.out.println();
            }
            else if(col == 1){
                System.out.print("\n");
                System.out.print("---------------------");
                System.out.println();}
            else{
                System.out.println("---------------------");
                System.out.println();
            }
		return;
	}
}
