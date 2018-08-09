package util.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class IOUtil {

	private BufferedReader inpRead;
	private BufferedReader fileRead;

	public IOUtil(String dicFilePath) throws Exception {
		inpRead=new BufferedReader(new InputStreamReader(System.in));
		fileRead=new BufferedReader(new FileReader(new File(dicFilePath)));
	}
	
	public ArrayList<String>fetchFromDic() throws Exception {
		ArrayList<String>list=new ArrayList<>();
		String str;
		while((str=fileRead.readLine())!=null)
			list.add(str);
		return list;
	}
	
	public String getInputFromUser() throws Exception {
		return inpRead.readLine();
	}
	
	
	
}
