package chapter10;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class MainReadXml {

	public static void main(String[] args) throws Exception
	{
		//読み込みストリーム
		InputStream is = new FileInputStream("/Users/hoge/hogehoge/Chapter10/SampleXML.xml");
		//XMLファイルの文書全体を取得
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
		//一番外側のhumanタグを取得
		Element human = doc.getDocumentElement();
		//その中のitemタグを取得
		Element item = findChildByTag(human, "item");
		//その中のcolorタグを取得
		Element color = findChildByTag(item, "color");
		//その中の文字情報を取得
		String strValue = color.getTextContent();
	}

	private static Element findChildByTag(Element self, String name) throws Exception
	{
		//全ての子を取得
		NodeList children = self.getChildNodes();
		for( int i = 0; i < children.getLength(); i++)
		{
			if( children.item(i) instanceof Element)
			{
				Element e = (Element) children.item(i);
				if( e.getTagName().equals(name))
				{
					return e;
				}
			}
		}
		return null;
	}
}
