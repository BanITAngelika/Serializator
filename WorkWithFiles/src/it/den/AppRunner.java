package it.den;
import java.io.File;

import it.den.model.Item;
import it.den.service.ItemFileManager;


public class AppRunner {
	
	public static void main(String[] args) {
		
		String sep = System.getProperty("file.separator");
		String appDir = "C:"+sep+"test"; 
	
		String filePath = appDir+sep+"test.txt";
	
	Item item= ItemFileManager.readItemFromFile(filePath); 
	File file = item.getImg();
		
		ItemFileManager.saveFile(file, appDir+sep+"newFile.002");
		
			
	}

}
