package src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import src.config.AppConfig;
import src.model.Comic;
import src.service.BorrowImpl;

public class ComicTest {
	
	public static void main (String[]args) throws Exception{
		
		System.out.println("tess");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		BorrowImpl borrow =  (BorrowImpl) context.getBean("borrowBean");
		Comic comic = (Comic) borrow.getComic();
		System.out.println(comic.getTitle());
		
	}

}
