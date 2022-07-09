package employee_Wage;

public class method {
	public static final int part_Time = 1;
	public static final int full_time = 2;
	public static final int emp_Rate_per_Hour = 20;
	public static final int number_of_Working_Day = 2;
	public static final int max_Hour_in_Month = 10;
	
	
	public static int employee_Wage() {
		
		int empHrs = 0;
		int total_Emp_Hrs = 0;
		int total_Workign_Day = 0;
		
		while (total_Emp_Hrs <= max_Hour_in_Month && total_Workign_Day < number_of_Working_Day) {
			total_Workign_Day++;
			
			int emp_Check = (int) (Math.floor(Math.random()*10) % 3);
			switch (emp_Check) {
				
			case part_Time:
				empHrs = 4;
				break;
			case full_time:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			total_Emp_Hrs += empHrs;
			System.out.println("Day#: "+total_Workign_Day+ "Empolyee Hours: "+empHrs);
		}
		int total_Emp_Wage = total_Emp_Hrs * emp_Rate_per_Hour;
		System.out.println("Total Employee Wage: "+total_Emp_Wage);
		return total_Emp_Wage;
	}

}
