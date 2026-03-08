package javacourse;

public class Book {
    public String name;
    public String author;
    public int pubdatae;

    public int last_page_number;
    public int current_page;
    public boolean is_open;

    public Book(String n, String a, int pdatae, int lpage) {
        this.name = n;
        this.author = a;
        this.last_page_number = lpage;
        this.pubdatae = pdatae;
        this.is_open = false;
    }

    void OpenBook() {
        if (is_open)
            System.out.println("is open");

        else is_open = true;
    }
    public void CloseBook() {
        if (is_open)
        {
            this.is_open=false;
            this.current_page=0;
        }
        else
            System.out.println("Is Close");
    }

    public boolean MoveToPage(int page)
    {
      if (!is_open)
          return false;
      if (page>=this.last_page_number||(page<1))
          return false;
      this.current_page=page;
      return true;
    }


    public void printBookInfo()
    {
        System.out.println("book name:"+this.name);
        System.out.println("book author:"+this.author);
        System.out.println("Page Count:"+this.last_page_number);

    }

}
