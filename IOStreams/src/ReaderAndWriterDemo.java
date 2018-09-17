


import java.io.FileReader;
import java.io.FileWriter;

public class ReaderAndWriterDemo {

	public static void main(String[] args) throws Exception {

		FileReader fr = null;
		FileWriter fw = null;

		fr = new FileReader("/D:/projectA/myfile");
		fw = new FileWriter("/D:/projectA/newFile");

		int ch;

		while ((ch = fr.read()) != -1) {

			fw.write(ch);

		}

		fr.close();
		fw.close();

	}

}
