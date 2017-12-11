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
		
		// sax 解析
		
		// 创建解析工厂
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		//得到解析器
		SAXParser saxParser = factory.newSAXParser();
		
		// 得到读写器
		XMLReader xmlReader = saxParser.getXMLReader();
		
		// 设置内存处理器
		xmlReader.setContentHandler(new listHandler());
		
		
		// 读取xml文档内容
		xmlReader.parse("src/exam.xml");
		
		
	}
}

class listHandler implements ContentHandler{
	
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
		// TODO Auto-generated method stub
		// 获取标签
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




























