package co.com.managmentFile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Grabacion {
	public static void main(String[] args) throws IOException{
		String[] nombres = {"ana","rosa","jorge","manuel","maria"};
		FileWriter fw = new FileWriter("datos.txt", true);
		PrintWriter out = new PrintWriter(fw);
		
		for(int i=0; i<nombres.length; i++){
			out.println(nombres[i]);
		}
		out.flush();
		out.close();
		
	}
}
