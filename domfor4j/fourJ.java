package domfor4j;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class fourJ {
	public static void main(String[] args) throws DocumentException {
		
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File("src/exam.xml"));
		Element rootElement = document.getRootElement();
		Element book =	(Element) rootElement.elements("Student").get(1);
		String text = book.element("name").getText();
		System.out.println(text);
	}
	
}
