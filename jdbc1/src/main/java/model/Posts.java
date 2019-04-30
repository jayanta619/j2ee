package model;
public class Posts {

	private int id;

	private String post_body;

	public Posts() {

	}

	public Posts(int id,  String post_body) {
		this.id = id;
	
		this.post_body = post_body;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	


	public String getpost_Body() {
		return post_body;
	}

	public void setpost_Body(String post_body) {
		this.post_body = post_body;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", post_body=" + post_body + "]";
	}

}