package cmmntmodel;


public class Comments {

	private int id;

	private String comment_body;

	public void Comments() {

	}

	public Comments(int id,  String comment_body) {
		this.id = id;
	
		this.comment_body = comment_body;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	


	public String getcomment_Body() {
		return comment_body;
	}

	public void setpost_Body(String comment_body) {
		this.comment_body = comment_body;
	}

	@Override
	public String toString() {
		return "comment [id=" + id + ",comment_body=" + comment_body + "]";
	}

}