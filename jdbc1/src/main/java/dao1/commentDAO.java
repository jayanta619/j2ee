package dao1;



import java.util.List;

import cmmntmodel.Comments;

public interface commentDAO {
	
	int insert(Comments comment);
	int update(Comments comment);
	int delete(int id);
	List<Comments> view();
	Comments view(int id);

}