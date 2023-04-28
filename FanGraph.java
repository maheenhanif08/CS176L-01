import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FanGraph {
	
	public static void main (String args[]) throws IOException {
		
		Document doc = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2020&month=0&season1=2020&ind=0").timeout(6000).get();
		Elements body = doc.select("tbody");
		
		Document doc2 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2021&month=0&season1=2021&ind=0").timeout(6000).get();
		Elements body2 = doc2.select("tbody");
		
		Document doc3 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2022&ind=0").timeout(6000).get();
		Elements body3 = doc3.select("tbody");
		
		ArrayList<String> names2020 = new ArrayList<String>();
		ArrayList<String> names2021 = new ArrayList<String>();
		ArrayList<String> names2022 = new ArrayList<String>();
		

		int counter = 0;
		
		//for 2020 
		for (Element e : body.select("td.grid_line_regular")) {
			String name = e.select("a").text();

			if (name != "" && name.length() > 3) 
				names2020.add(name);
		}
		
		
		//for 2021
		for (Element e : body2.select("td.grid_line_regular")) {
			String name2 = e.select("a").text();

			if (name2 != "" && name2.length() > 3) 
				names2021.add(name2);
		}
		
		//for 2023
		for (Element e : body3.select("td.grid_line_regular")) {
			String name3 = e.select("a").text();

			if (name3 != "" && name3.length() > 3) 
				names2022.add(name3);
		}
		
		//print lines
		//System.out.println(names2020);
		//System.out.println(names2021);
		//System.out.println(names2022);
		
		System.out.println("Top 10 Batting Leaders for 2020:");
		for (int i = 0; i < 10; ++i) {
	         System.out.println(i + 1 + ": " + names2020.get(i));
	         
		}
		
		System.out.println("");
		System.out.println("Top 10 Batting Leaders for 2021:");
		for (int i = 0; i < 10; ++i) {
	         System.out.println(i + 1 + ": " + names2021.get(i));
		}
		
		System.out.println("");
		System.out.println("Top 10 Batting Leaders for 2022:");
		for (int i = 0; i < 10; ++i) {
	         System.out.println(i + 1 + ": " + names2022.get(i));
		}
	}
}


