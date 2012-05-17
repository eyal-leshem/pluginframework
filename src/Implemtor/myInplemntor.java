package Implemtor;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.cert.Certificate;

import javax.crypto.SecretKey;

public class myInplemntor extends Implementor {
	         

    
    
    public myInplemntor(String params) throws  Exception {
    	//TODO genrate constractor

		 
	}
	
	

	@Override
	public Certificate genrateKeyPair(String dName){
		//TODO genrate ke pair 
	    return null; 
		
	}




	@Override
	public SecretKey genrateSecertKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean installSecertKey(SecretKey key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean installTrustCert(Certificate cert) {

		//TODO install trust cert 
		return false ; 
	}
	


}
