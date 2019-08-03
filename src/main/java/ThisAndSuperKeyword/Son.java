package ThisAndSuperKeyword;

public class Son extends Father {


        void message()
        {
            System.out.println("son extends father");
        }

      public   void display()
        {
            // will invoke or call current class message() method
          this.message();

            // will invoke or call parent class message() method
            super.message();
        }
    }
