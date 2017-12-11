package saxdemo.sax;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import saxdemo.sax.book;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class bookSax {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		//�õ�������
		SAXParser saxParser = factory.newSAXParser();
		
		// �õ���д��
		XMLReader xmlReader = saxParser.getXMLReader();
		
		// �����ڴ洦����
		bookHander bookHander = new bookHander();
		xmlReader.setContentHandler(bookHander);
		
		// ��ȡxml�ĵ�����
		xmlReader.parse("src/exam.xml");
		
		List<book> list = bookHander.getList();
		System.out.println(list);
		
	}
}

class bookHander extends DefaultHandler{
	
	// 
	private List list  = new ArrayList();
	private String curentName;
	private book book;
	
	
	
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		curentName = qName; // ��ס��ǰ��ǩ
		if ("Student".equals(curentName)) {
			  book = new book();
			 
		}
		
	}

	

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
	
		if ("name".equals(curentName)) {
			String string = new String(ch,start,length);
			book.setName(string);
		}
		if ("location".equals(curentName)) {
			String string = new String(ch,start,length);
			book.setAuthor(string);
		}
		
		if ("grade".equals(curentName)) {
			String string = new String(ch,start,length);
			book.setPrivce(string);
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		
		if (qName.equals("Student")) {
			list.add(book);
			book = null;
		}
		curentName = null;
	
		
	}


	public List getList() {
		return list;
	}
	
}
