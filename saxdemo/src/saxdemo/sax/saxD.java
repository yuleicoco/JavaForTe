package saxdemo.sax;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public class saxD {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		// sax ����
		
		// ������������
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		//�õ�������
		SAXParser saxParser = factory.newSAXParser();
		
		// �õ���д��
		XMLReader xmlReader = saxParser.getXMLReader();
		
		// �����ڴ洦����
		xmlReader.setContentHandler(new listHandler());
		
		
		// ��ȡxml�ĵ�����
		xmlReader.parse("src/exam.xml");
		
		
	}
}

class listHandler implements ContentHandler{
	
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
		// TODO Auto-generated method stub
		// ��ȡ��ǩ
		System.out.println("< " + qName + ">");
		
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("---------" + new String(ch,start,length));
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
	
		System.out.println("< " + qName + ">");
	}
	
		
	@Override
	public void setDocumentLocator(Locator locator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startPrefixMapping(String prefix, String uri) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endPrefixMapping(String prefix) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	





	@Override
	public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processingInstruction(String target, String data) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void skippedEntity(String name) throws SAXException {
		// TODO Auto-generated method stub
		
	}
	
	
}




























