package com.juniad.one;


public class MarkSheet {

	int average;
	static int total,sub1,sub2,sub3,sub4,sub5,sub6;


	public static int getTotal(int sub1,int sub2,int sub3,int sub4,int sub5,int sub6)
	{
		return total  = sub1+ sub2 + sub3 +sub4 +sub5 + sub6;
	}
	public void getAverage(int total)
	{
		average = total/6;
	}
	public void getMarks()
	{
		sub1= 50;
		sub2= 50;
		sub3= 50;
		sub4= 50;
		sub5= 50;
		sub6= 50;
	}

	public static void main(String[] args) {
		MarkSheet m1 = new MarkSheet();
		
		//getMarks() is used to get marks of each subject
		m1.getMarks();
		
		//getAverage() is used to get average of student
		m1.getAverage(getTotal(sub1,sub2,sub3,sub4,sub5,sub6));

		if(m1.average >90 && m1.average<=100)
		{
			System.out.println("Scored A with an average of "+m1.average);
			
		}else if (m1.average >80 && m1.average<=90) 
		{
			System.out.println("Scored B with an average of "+m1.average);
			
		}else if (m1.average >70 && m1.average<=80) 
		{
			System.out.println("Scored C with an average of "+m1.average);
			
		}else if (m1.average >60 && m1.average<=70) 
		{
			System.out.println("Scored D with an average of "+m1.average);
			
		}else if (m1.average >50 && m1.average<=60) 
		{
			System.out.println("Scored E with an average of "+m1.average);
			
		}else 
		{
			System.out.println("Scored F with an average of "+m1.average);
			
		}
	}

}
