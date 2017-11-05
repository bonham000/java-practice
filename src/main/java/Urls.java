import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class Urls implements Iterable<String>{
    private LinkedList<String> urls = new LinkedList<String>();

    private class UrlIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < urls.size();
        }

        @Override
        public String next() {
            StringBuilder sb = new StringBuilder();
            try {
                URL url = new URL(urls.get(index));
                try {
                    BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                    String line = null;
                    while ( (line = br.readLine()) != null) {
                        sb.append(line);
                        sb.append("\n");
                    }
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            index++;
            return sb.toString();
        }

        @Override
        public void remove() {

        }
    }

    public Urls() {
        urls.add("https://www.google.com");
        urls.add("https://www.facebook.com");
        urls.add("https://www.github.com");
    }

    @Override
    public Iterator<String> iterator() {
        return new UrlIterator();
    }

}
