package com.javaio;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;

public class Filereadlines {

public static void main(String[] args) throws IOException   {
		
		Path p1 = Paths.get("data2.txt");
		String s = " This is data2.txt File ";
		Path write1 = Files.write(p1, s.getBytes(), StandardOpenOption.WRITE);
		System.out.println(write1.toUri().getPath());
		
		System.out.println("----------------");
		Path p2 = Paths.get("data3.txt");
		List<String> names = new LinkedList<>();
		names.add("Adarsh");
		names.add("Anush");
		names.add("Ajay");
		Path write2 = Files.write(p2, names, Charset.forName("UTF-8"), StandardOpenOption.WRITE);
		System.out.println(write2.toUri().getPath());
		
	}
}
