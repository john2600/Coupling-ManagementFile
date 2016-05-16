package co.com.managmentFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo {
	public static void main(String [] args ) throws IOException{
		File f = new File("datos.txt");
		if(f.exists()){
			FileReader fr = new FileReader(f);
			@SuppressWarnings("resource")
			BufferedReader bf = new BufferedReader(fr);
			String cad;
			//while((cad=bf.readLine())!=null){
				//System.out.println(cad);
			//}
			int ca;
			while((ca=bf.read())!=-1){
				System.out.print(ca);
			}
			
			
		}else{
			System.out.println(" El archivo no existe ");
		}
		
	}

}
