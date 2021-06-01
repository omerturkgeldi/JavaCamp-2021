package eCommerceHW.core;

import eCommerceHW.google.GoogleManager;

public class GoogleAuthManagerAdapter implements GoogleAuthService {

	@Override
	public void register(String message) {

		GoogleManager googleManager = new GoogleManager();
		googleManager.send(message);
	}

}
