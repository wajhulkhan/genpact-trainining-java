package com.org.gen.col;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee em1, Employee em2) {
		// TODO Auto-generated method stub
		if(em1.getAge()>em2.getAge())
			return 1;
			else if(em1.getAge()==em2.getAge()) {
				if(em1.getDate()==em2.getDate())
					return 1;
				else
					return 0;
				
				
			}else
				return -1;
	}

}
