package main;
import lexicalAnalyzer.*;
import token.Token;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class Main {
	public static void main(String[] args) throws IOException {
		String inFile = "src/SampleOriginal.in";
		int x = 0;
		Reader reader = new FileReader( inFile );
		ToyLexer lexer = new ToyLexer(reader);
		while(x  < 100) {
		lexer.yylex();
		x++;	
		}
		}
}