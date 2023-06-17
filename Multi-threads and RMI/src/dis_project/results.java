package dis_project;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Map;

public class results {
    String text;
    Search access;

    public results(String text, Search access) {
        this.text = text;
        this.access = access;
    }

    public int getCount(String text,Search access) throws RemoteException {
        return access.count(text);
    }
    public String getLongest(String text,Search access) throws RemoteException {
        return access.longest(text);
    }
    public String getShortest(String text,Search access) throws RemoteException {
        return access.shortest(text);
    }
    public ArrayList getRepeatedWords(String text, Search access) throws RemoteException {
        return access.repeatedwords(text);
    }

    public Map getRepeatedWordsAndCounts(String text, Search access) throws RemoteException {
        return access.Repeat(text);
    }

}
