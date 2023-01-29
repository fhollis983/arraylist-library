public class Library {

    // return only books of a certain subject
    public static ArrayList<Book> filterSubject(ArrayList<Book> data, String subject) {
        ArrayList<Book> result = new ArrayList<Book>();
        String check = "";
        for(int i = 0; i < data.getSize(); i++) {
            check = "Subject: " + subject;
            if(data.get(i).toString().toLowerCase().contains(check.toLowerCase())) {
                result.add(data.get(i));
            }
        }
        return result;
    }

    // check if data is sorted by a specified attribute
    public static boolean isSorted(ArrayList<Book> data, String attr) {
        
        if(attr.equals("year")) {
            for(int i = 0; i < data.getSize()-1; i++) {
                if(data.get(i).getYear() > data.get(i+1).getYear()){
                    return false;
                }
            }
            return true;
        }

        if(attr.equals("length")) {
            for(int i = 0; i < data.getSize()-1; i++) {
                if(data.get(i).getLength() > data.get(i+1).getLength()){
                    return false;
                }
            }
            return true;
        }

        if(attr.equals("rating")) {
            for(int i = 0; i < data.getSize()-1; i++) {
                if(data.get(i).getRating() < data.get(i+1).getRating()){
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    // ascending
    public static ArrayList<Book> sortYear(ArrayList<Book> data) {
        Book temp;
        do { // bubble sort
            for(int i = 0; i < data.getSize()-1; i++) {
                if(data.get(i).getYear() > data.get(i+1).getYear()) {
                    temp = data.get(i);
                    data.set(i, data.get(i+1));
                    data.set(i+1, temp);
                }
            }
        } while(isSorted(data, "year")!=true);
        return data;
    }

    // ascending
    public static ArrayList<Book> sortLength(ArrayList<Book> data) {
        Book temp;
        // bubble sort
        do {
            for(int i = 0; i < data.getSize()-1; i++) {
                if(data.get(i).getLength() > data.get(i+1).getLength()) {
                    temp = data.get(i);
                    data.set(i, data.get(i+1));
                    data.set(i+1, temp);
                }
            }
        } while(isSorted(data, "length")!=true);
        return data;
    }

    // descending
    public static ArrayList<Book> sortRating(ArrayList<Book> data) {
        Book temp;
        // bubble sort
        do {
            for(int i = 0; i < data.getSize()-1; i++) {
                if(data.get(i).getRating() < data.get(i+1).getRating()) {
                    temp = data.get(i);
                    data.set(i, data.get(i+1));
                    data.set(i+1, temp);
                }
            }
        } while(isSorted(data, "rating")!=true);
        return data;
    }

    // search for a book by title
    public static String search(ArrayList<Book> data, String title) {
        for(int i = 0; i < data.getSize(); i++) {
            if(data.get(i).getTitle().toLowerCase().equals(title.toLowerCase())){
                return(data.get(i).toString()+"\n");
            }
        }
        return("No book found with title " + title + "\n");
    }

}