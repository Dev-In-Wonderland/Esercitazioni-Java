package controller;



import model.User;




public class MainProject {
Persistence.create
	public static void main (String[] args) {
	User u = new User();
	u.setName("Mario");
	u.setlastname("Rossi");
	u.setemail("Rossi");
}
	

public static adduser(User  u) { 
	
	em.getTransaction().begin();
	em.getTransaction().commit();
	
	
	
	
}





public static User findUser(int id) {
    em.getTransaction().begin();
    User u = em.find(User.class, id);
    em.getTransaction().commit();
    return u;
}




}
