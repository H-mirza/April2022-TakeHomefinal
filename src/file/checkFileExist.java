package file;

	

	public static void main(String[] args) {
		
		
		String path = "/homefinal/src/file/fruit.txt";
		doesFileExist(path);

	
	}

	 public static doesFileExist(String path) {
 } 
	
	{
		String path;
		File f = new File(path);
		BufferedReader br = new BufferedReader (new FileReader(f));
		String line;
		while ((line = br.readLine())!= null) {
			String[] words = line.split("-|\\,");
			for (int i = 0; i < words.length; i++) {
				System.out.println(words[i]);
				
				
			}
		
		}
		br.close();
		
	} catch (FileNOTFoundException ex) {
	   System.out.println("File does not exist");	
		
	}
   
  }
 
