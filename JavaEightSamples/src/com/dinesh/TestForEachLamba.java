package com.dinesh;

import java.util.ArrayList;
import java.util.List;

public class TestForEachLamba {

	public static void main(String[] args) {

		List<String> stateList=new ArrayList<String>();
		stateList.add("IL");
		stateList.add("SD");
		stateList.add("WV");
		stateList.add("MI");
		stateList.add("WI");
		stateList.forEach(state -> System.out.println(state));
	}

}
