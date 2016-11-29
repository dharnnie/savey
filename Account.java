
public class Account{

	private String account;
	private String username;
	private String password;
	private int index = 0;
	private int saveAt = 0;

	public Account(String acct){ // Constructor for retrieving
		account = acct;
	}

	public Account(String acct, String uName, String pass){// constructor for creating a repo
		account = acct;
		username = uName;
		password = pass;
	}

	public String getAccountName(){
		return account;
	}
	public String getUsername(){
		return username;
	}
	public String getPassword(){
		return password;
	}

	public static void main(String[] args) {
		Account account = new Account("Facebook", "danny@booty.com", "myPass");
		account.addDetails();
		
	}
}