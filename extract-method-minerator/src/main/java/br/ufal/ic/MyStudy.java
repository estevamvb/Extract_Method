package br.ufal.ic;

import br.com.metricminer2.MetricMiner2;
import br.com.metricminer2.RepositoryMining;
import br.com.metricminer2.Study;
import br.com.metricminer2.persistence.csv.CSVFile;
import br.com.metricminer2.scm.GitRepository;
import br.com.metricminer2.scm.commitrange.Commits;

public class MyStudy implements Study{
	
	
	public static void main(String[] args) {
		new MetricMiner2().start(new MyStudy());
	}
	
	public void execute() {
		new RepositoryMining()
		.in(GitRepository.singleProject("D:\\Acadêmico\\Mestrado\\Dissertação\\AnaliseProjetos\\sweethome3d-swt"))
		.through(Commits.all())
		.process(new DevelopersVisitor(), new CSVFile("C:\\Users\\ESTEVAM\\Desktop\\result.csv"))
		.mine();
	}
	
}
