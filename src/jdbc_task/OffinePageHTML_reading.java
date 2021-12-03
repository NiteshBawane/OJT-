package jdbc_task;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class OffinePageHTML_reading {
public static void main(String[] args) throws Exception {
	Document htmlfile=null;
	try {
		htmlfile=Jsoup.parse("file:///C:/Users/91814/Desktop/selenium/Offline%20Website/Offline%20Website/pages/examples/operators.html");
		System.out.println("connection established");
		System.out.println(htmlfile);
		 Elements rows=htmlfile.getElementsByTag("th");
			
			System.out.println("Number of elements are :- " + rows.size());
			
			
			for(int i=1;i<rows.size();i++)
			{
				Element row=rows.get(i);
				
				Elements cols=row.select("td");
				System.out.println(cols);
			}
	} 
			catch (Exception e) {
	e.printStackTrace();
	}
		
	}}
	
	
/*	
Document doc;
try {
	doc=Jsoup.connect("http://google.com/").get();
	String title=doc.title();
	System.out.println();
} catch (Exception e) {
e.printStackTrace();
}
	*/
	
	
	


/*	Connection con=Jsoup.connect("https://viblo.asia");
	Document doc =con.userAgent("Chome").get();
	Elements elements = doc.getElementsByClass("post-feed").get(0).children();
	Elements list=new Elements();
	Elements string=new Elements();
	for (Element element : elements) {
		if (element.hasClass("post-feed-item")) {
			list.add(element);
			Elements e=element.children().get(1).children().get(1).children();
			if (e.text().matches("^.*?(Docker|docker|DOCKER).*$")){
				string.addAll(e);
			}
		
	}
}
	<html>
 <head></head>
 <body>
  file:///C:/Users/91814/Desktop/selenium/Offline%20Website/Offline%20Website/pages/examples/operators.html
 </body>
</html>
Number of elements are :- 0

}	

}
*/
