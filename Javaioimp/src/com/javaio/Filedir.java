package com.javaio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Filedir {

	public static void main(String[] args) {
		Stream<Path> list = null;
		try {
			 list = Files.list(Paths.get("."));
			list.forEach(System.out::println);
			
			} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(list != null)
				list.close();
		}
	}

}
