package Implemtor;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.cert.Certificate;

import javax.crypto.SecretKey;

public class myInplemntor extends Implementor {
	         

    
    
    public myInplemntor(String params) throws  ImplementorExcption {
    	//TODO genrate constractor		 
	}
	
	

	@Override
	public Certificate genrateKeyPair(String dName) throws  ImplementorExcption {
		//TODO genrate ke pair 
	    return null; 		
	}


	@Override
	public boolean installSecertKey(SecretKey key) throws  ImplementorExcption {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean installTrustCert(Certificate cert) throws  ImplementorExcption {

		//TODO install trust cert 
		return false ; 
	}



	@Override
	public SecretKey genrateSecertKey(String alg) throws ImplementorExcption {
		// TODO Auto-generated method stub
		return null;
	}
	


}
