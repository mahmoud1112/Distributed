package dis_project;

// Creating a Search interface
import java.rmi.*;
import java.util.ArrayList;
import java.util.Map;
public interface Search extends Remote
{
	// Declaring the method prototype
        
        public int count(String string)throws RemoteException;
        public ArrayList repeatedwords(String str)throws RemoteException;
        public String longest(String search) throws RemoteException;
        public String shortest(String search) throws RemoteException;
        public Map Repeat(String search) throws RemoteException;




}
