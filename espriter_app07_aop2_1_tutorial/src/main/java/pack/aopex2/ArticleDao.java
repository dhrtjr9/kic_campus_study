package pack.aopex2;

public class ArticleDao implements ArticleInter{
	
	@Override
	public void selectAll() {
		System.out.println("db 자료 읽기 수행");
	}
}
