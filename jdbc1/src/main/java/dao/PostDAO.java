package dao;

import java.util.List;

import model.Posts;

public interface PostDAO {
	
	int insert(Posts post);
	int update(Posts post);
	int delete(int id);
	List<Posts> view();
	Posts view(int id);

}