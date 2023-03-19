package MyPack;

import java.util.Date;

public class JobTypes {

	private int id;
	private String jobType;
	private Date postDate;
	
	public JobTypes() {
		super();
	}

	public JobTypes(int id) {
		super();
		this.id = id;
	}

	public JobTypes(String jobType) {
		super();
		this.jobType = jobType;
	}

	public JobTypes(Date postDate) {
		super();
		this.postDate = postDate;
	}

	public JobTypes(int id, String jobType) {
		super();
		this.id = id;
		this.jobType = jobType;
	}

	public JobTypes(String jobType, Date postDate) {
		super();
		this.jobType = jobType;
		this.postDate = postDate;
	}

	public JobTypes(int id, String jobType, Date postDate) {
		super();
		this.id = id;
		this.jobType = jobType;
		this.postDate = postDate;
	}

	@Override
	public String toString() {
		return "JobTypes [id=" + id + ", jobType=" + jobType + ", postDate=" + postDate + "]";
	}
	
}
