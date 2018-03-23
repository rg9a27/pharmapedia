package in.ac.miet.decoders.pharmapedia;

/**
 * Created by Rahul Gupta on 16-03-2018.
 */

public class Contacts {

    private String term,count;

    public Contacts(String term, String count) {
        this.setTerm(term);
        this.setCount(count);

    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
