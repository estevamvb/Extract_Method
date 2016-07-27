package br.ufal.ic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MethodStats {

	private String id;
	
	private ArrayList<Integer> statementsPerCommit = new ArrayList<Integer>();
	
	public MethodStats(String id) {
		this.id = id;
	}
	
	public void put(Integer numberOfStatements) {
		statementsPerCommit.add(numberOfStatements);
	}
	
	
	public String getId(){
		return id;
	}
	
	public void printNumberOfStatments(){
		for(int i = 0 ; i < statementsPerCommit.size() ; i++){
			System.out.print(this.statementsPerCommit.get(i) + ",");
		}
		System.out.println("");
	}
	
}