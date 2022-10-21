package Model;


public class user {

    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private int active;
    private int id_domain;
    private int is_admin;
    private String birthday ;
    public user(){

    }
    public user(int id, String nom, String prenom, String email, String password,int active,int id_domain,String birthday,int is_admin) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.active = active;
        this.id_domain=id_domain;
        this.birthday=birthday;
        this.is_admin=is_admin;
    }
   
	  public user(int id, String nom, String prenom, String email, String password,int active) {
	        this.id = id;
	        this.nom = nom;
	        this.prenom = prenom;
	        this.email = email;
	        this.password = password;
	        this.active = active;
	    }

	  public user(String nom, String prenom, String email, String password ,String birthday) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.email = email;
	        this.password = password;
	        this.birthday = birthday;
	    }
		  public user(int id, String nom, String prenom,String email,String password, int active,String birthday) {
		    	this.id = id;
		    	this.nom = nom;
		        this.prenom = prenom;
		        this.email = email;
		        this.password = password;
		        this.active = active;
		        this.birthday = birthday;
		     
		    }
	
    public user(int id, String Email,String password, String nom, String prenom, String birthday) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = Email;
        this.password = password;
        this.birthday=birthday;
        
    }
    public user(int id, String email,String nom, String prenom, String birthday) {
    	this.id = id;
    	this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.birthday = birthday;
     
    }
    public String getbirthday() {
        return birthday;
    }

    public void setbirthday (String birthday) {
        this.birthday = birthday;
    }
    public int getid_domain() {
        return id_domain;
    }

    public void setid_domain(int id_domain) {
        this.id_domain = id_domain;
    }
    public int getis_admin() {
        return is_admin;
    }

    public void setis_admin(int is_admin) {
        this.is_admin = is_admin;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getactive() {
        return active;
    }

    public void setactive(int active) {
        this.active = active;
    }


 
	
}
