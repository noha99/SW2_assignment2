
package Ass2;


import java.util.Date;

public class Block {

	public String hash;
	public String previousHash;
	private String data;
	private long timeStamp;
	private int nonce;

	//Block Constructor.  
		public Block(String data,String previousHash ) {
			this.data = data;
			this.previousHash = previousHash;
			this.timeStamp = new Date().getTime();
			
                }		}
public static String applySha256(String input){
			
			try {
				MessageDigest digest = MessageDigest.getInstance("SHA-256");
		        
				//Applies sha256 to our input, 
				byte[] hash = digest.digest(input.getBytes("UTF-8"));
		        
				StringBuffer hexString = new StringBuffer(); // This will contain hash as hexidecimal
                 
} 
