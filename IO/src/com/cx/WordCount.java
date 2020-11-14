package com.cx;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class WordCount {
	@Test
	public void testWordCount() {
		FileReader fr = null;
		BufferedWriter bw = null;
		try {
			//创建map集合
			Map<Character, Integer> map = new HashMap<>();
			File frFile = new File("test.txt");
			fr = new FileReader(frFile);
			int c = 0;
			while ((c = fr.read()) != -1) {
				char ch = (char) c;
				if (map.get(ch) == null) {
					map.put(ch, 1);
				} else {
					map.put(ch, map.get(ch) + 1);
				}
			}
		
			bw = new BufferedWriter(new FileWriter("wordcount.txt"));
			Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
			for (Entry<Character, Integer> entry : entrySet) {
				switch (entry.getKey()) {
				case ' ':
					bw.write("空格=" + entry.getValue());
					break;
				case '\t':
					bw.write("tab键=" + entry.getValue());
					break;
				case '\n':
					bw.write("换行=" + entry.getValue());
					break;
				case '\r':
					bw.write("回车=" + entry.getValue());
					break;
				default:
					bw.write(entry.getKey() + "=" + entry.getValue());
					break;
				}
				bw.newLine();
			} 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//关闭流资源
			try {
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			try {
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}
