package MyPack;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Jobs {

	private int srNo;
	private String jobName;
	private Map<JobTypes, PostedBy> jobType;
	
	public Jobs() {
		super();
	}

	public Jobs(int srNo) {
		super();
		this.srNo = srNo;
	}

	public Jobs(String jobName) {
		super();
		this.jobName = jobName;
	}

	public Jobs(Map<JobTypes, PostedBy> jobType) {
		super();
		this.jobType = jobType;
	}

	public Jobs(int srNo, String jobName) {
		super();
		this.srNo = srNo;
		this.jobName = jobName;
	}

	public Jobs(String jobName, Map<JobTypes, PostedBy> jobType) {
		super();
		this.jobName = jobName;
		this.jobType = jobType;
	}

	public Jobs(int srNo, String jobName, Map<JobTypes, PostedBy> jobType) {
		super();
		this.srNo = srNo;
		this.jobName = jobName;
		this.jobType = jobType;
	}
	
	public void JobsInfo(){
		
		System.out.println("Serial No : "+srNo);
		System.out.println("Job Name : "+jobName);
		System.out.println("Available Jobs...");
		
		Set<Entry<JobTypes, PostedBy>> set = jobType.entrySet();
		
		Iterator<Entry<JobTypes, PostedBy>> itr = set.iterator();
		while(itr.hasNext()){
			
			Entry<JobTypes, PostedBy> entry = itr.next();
			
			JobTypes jbt = entry.getKey();
			PostedBy pst = entry.getValue();
			
			System.out.println("Job Types : "+jbt);
			System.out.println("Posted By : "+pst);
		}
	}
}
