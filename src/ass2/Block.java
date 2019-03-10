
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
                 
} 
