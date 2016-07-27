package test;

import org.junit.Test;
import br.ufal.ic.MethodStats;
import java.util.*;
//Importacao da Lib OpenCSV
import br.ufal.ic.CsvReader;
import br.ufal.ic.CsvWriter;

//Importacao da propria API
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.List;

public class MineratorTest {

	@Test
	public void test() throws IOException{
		List<MethodStats> methodsProject = new ArrayList<MethodStats>();
		MethodStats  method1 = new MethodStats("print()");
		method1.put(5);
		method1.put(10);
		method1.put(11);
		method1.put(40);
		methodsProject.add(method1);
		
		MethodStats  method2 = new MethodStats("run()");
		method2.put(5);
		method2.put(13);
		method2.put(15);
		methodsProject.add(method2);
		
		for(int i = 0; i< methodsProject.size() ; i++){
			System.out.print(methodsProject.get(i).getId() + ",");
			methodsProject.get(i).printNumberOfStatments();
		}
		 CsvWriter writer = new CsvWriter("D:\\arq.csv");
		 writer.write(methodsProject);
	     //objTests.readCSV();
	     //objTests.fill();
	     //objTests.writeCSV(methodsProject.toString());
				
	}
}
