/**
 * File      : DAOManager.java		31/05/23
 * Penulis   : Erlan Irhab Ghalib (24060121140166)
 * Deskripsi : Pengelola DAO dalam program
 * 
 */

public class DAOManager{
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}