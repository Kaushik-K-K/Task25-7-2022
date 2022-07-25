package com.javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Fileread {

	public static void main(String[] args) {
//		ReadEveryLines();
		newBufferedReader();	
		
	}

	private static void newBufferedReader() {
		// TODO Auto-generated method stub
		Path path = Paths.get("data.txt");
		try {
			BufferedReader bufferedReader = Files.newBufferedReader(path);
			Stream<String> lines = bufferedReader.lines();
			lines.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void ReadEveryLines() {
		Path path = Paths.get("data.txt");
		try {
//			List<String> readAllLines = Files.readAllLines(path);
			List<String> readAllLines = Files.readAllLines(path,Charset.forName("UTF-8"));
			for(String line : readAllLines) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
