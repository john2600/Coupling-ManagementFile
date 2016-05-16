package co.com.managmentFile;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class GrabaArray {
	public static void main(String [] args) throws IOException{
		String content="";
		File file = new File("datos.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		FileOutputStream fo = new FileOutputStream(file,true);
		//DataOutputStream ds = new DataOutputStream(fo);
		int[] m = {5,10,3,6};
		for(int i=0; i<m.length; i++){
			//ds.writeInt(m[i]);
			content = content+m[i]+"\n";
		}
		byte[] contentInBytes = content.getBytes();
		fo.write(contentInBytes);
		
		fo.close();
		
		
	}
}
