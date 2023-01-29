public class Publisher {
    
    public static ArrayList<Book> publishSet() {

        int size = 20;

        ArrayList<Book> set = new ArrayList<Book>(size);

        String[] titles = new String[size];

        String[] subjects = new String[size];

        // create a list of possible book titles
        for(int i = 0; i < titles.length; i++) {
            titles[i] = "Book" + (i+1);
        }

        // create a list of possible book subjects
        for(int i = 0; i < subjects.length; i++) {
            if(i >= 0 && i <= 3){
                subjects[i] = "Programming";
            }
            else if(i >= 4 && i <= 7){
                subjects[i] = "Data Structures";
            }
            else if(i >= 8 && i <= 11){
                subjects[i] = "Algorithms";
            }
            else if(i >= 12 && i <= 15){
                subjects[i] = "Operating Systems";
            }
            else if(i >= 16 && i <= 19){
                subjects[i] = "Gaming";
            }
            else subjects[i] = "Undefined";
        }

        int minYear = 1980;
        int maxYear = 2019;
        int year;
        int pages;
        double rating;

        // instantiate each book in the set
        for(int i = 0; i < size; i++) {
            do {
                year = (int)(Math.random() * (maxYear - minYear + 1) + minYear);
            } while(checkYear(year, set));
            pages = (int)(Math.random() * 951) + 50;
            rating = Math.random() * 9.9 + 0.1;
            rating = Math.round(rating * 10) / 10.0;
            Book book = new Book(titles[i], subjects[i], year, pages, rating);
            set.add(book);
        }
        return set;
    }

    // check if a year has already been used
    public static boolean checkYear(int year, ArrayList<Book> set) {
        for(int i = 0; i < set.getSize(); i++) {
            if(set.get(i).toString().contains("Year: " + year)) {
                return true;
            }
        }
        return false;
    }
}