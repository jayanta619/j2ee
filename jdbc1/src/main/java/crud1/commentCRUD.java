package crud1;
import java.util.List;
import java.util.Scanner;

import dao1.commentDAOImpl ;
import cmmntmodel.Comments;

public class commentCRUD {

	public static void main(String[] args) {

		commentDAOImpl dao = new commentDAOImpl();

		Scanner s = new Scanner(System.in);

		int doFlag = -1;

		do {
			System.out.println("1.Insert\n2.Update\n3.Delete\n4.View All comments\n5.Search a comment");
			int ch = s.nextInt();
			s.nextLine();
			switch (ch) {
			case 1:
				System.out.println("Enter comment  body");
				Comments comment = new Comments(0, s.nextLine());

				int res = dao.insert(comment);

				System.out.println("Rows inserted=" + res);

				break;

			case 2:
				System.out.println("Enter id of the comments to be updated");
				int id = s.nextInt();
				s.nextLine();
				System.out.println("Enter  body of the comments to be updated");

				res = dao.update(new Comments(id, s.nextLine()));

				System.out.println("Rows updated=" + res);
				break;

			case 3:
				System.out.println("Enter id of the comments to be deleted");
				id = s.nextInt();
				s.nextLine();
				res = dao.delete(id);
				System.out.println("Rows deleted=" + res);
				break;

			case 4:

				List<Comments> list = dao.view();

				for (Comments p : list) {
					System.out.println(p);
				}

				break;

			case 5:
				System.out.println("Enter id of the Post to be searched");
				id = s.nextInt();
				s.nextLine();
				comment = dao.view(id);
				System.out.println(comment);
				break;

			default:
				System.out.println("Invalid Input Choice");
			}

			System.out.println("RE RUN ? 1.YES\t2.NO");
			doFlag = s.nextInt();
			s.nextLine();

		} while (doFlag == 1);

	}

}