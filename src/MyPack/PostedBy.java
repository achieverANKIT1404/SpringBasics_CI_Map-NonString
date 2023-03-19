package MyPack;

public class PostedBy {

	private int id;
	private String name;
	private String email;
	
	public PostedBy() {
		super();
	}

	public PostedBy(int id) {
		super();
		this.id = id;
	}

	public PostedBy(String name) {
		super();
		this.name = name;
	}

	public PostedBy(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "PostedBy [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
}
