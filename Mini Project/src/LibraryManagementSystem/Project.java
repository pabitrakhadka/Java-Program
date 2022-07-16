package LibraryManagementSystem;


import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        char r;
        do {
            System.out.println("Library Management System:");
            System.out.println("Press>> 1 to Book");
            System.out.println("Press >> 2 to issue a book");
            System.out.println("Press >> 3 Return a Book");
            System.out.println("Press  >>4 Print Complete issue details");
            System.out.println("Press >>5 to exist:");
          Scanner oj1 = new Scanner(System.in);
            System.out.println("Enter any Number:");
            int a = oj1.nextInt();
            switch (a)
            {
                case 1:

                    Library aa = new Library();
                    aa.add();
                    break;

                case 2:

                    Library ab = new Library();
                    ab.iss();
                    break;

                case 3:

                    Library abc = new Library();
                    abc.ret();
                    break;

                case 4:

                    Library bcd = new Library();
                    bcd.details();
                    break;
                case 5:

                    Library bca = new Library();
                    bca.exit();
                    break;
                default:
                    System.out.println("Invalid Number !!Please Valid Number:");
            }
            System.out.println("You want To select Next Option Y/N");
            r = oj1.next().charAt(0);

        }
        while (r == 'Y' || r == 'y') ;
        if (r == 'n' || r == 'N') {
            Library z = new Library();
            z.exit();
        }

    }

    }


class Library {
   static String str,b,date;
   static int c,a;
    void add()
    {
        System.out.println("Enter book Name,Price and Book_no");
        Scanner obj2=new Scanner (System.in);
        String str=obj2.nextLine();
        float price=obj2.nextInt();
        int book_number=obj2.nextInt();
        System.out.println("Your details is   "+str+price+book_number);
    }
    void iss()
    {


            Scanner obj3=new Scanner(System.in);
            System.out.println("Book Name");
            str=obj3.nextLine();
            System.out.println("Book Id");
            a=obj3.nextInt();
            obj3.nextLine();
            System.out.println("Issue Date");
            b=obj3.nextLine();
            System.out.println("Total Number of Book Issued");
            c=obj3.nextInt();
            obj3.nextLine();
            System.out.println("Return Books");
            date=obj3.nextLine();
//        }



    }
    //void get()
    int get()
    {
        return a;
    }
    void ret()
    {
        System.out.println("Enter Student_Name & Book_id:");
        Scanner c=new Scanner(System.in);
        String name=c.nextLine();
        int book_id=c.nextInt();
        if(a==book_id)
        {
            System.out.println("Total Details:");
            System.out.println("Book Name::"+Library.str);
            System.out.println("Book ID :: "+Library.a);
            System.out.println("Issued Date::"+Library.b);
            System.out.println("Total Number Book Issued::"+c);
            System.out.println("Return Date::"+Library.date);
        }
        else
        {
            System.out.println("Wrong Is, Please Enter Correct Id");
        }
    }
    void details()
    {
        System.out.println("Book Name::"+Library.str);
        System.out.println("Book ID :: "+Library.a);
        System.out.println("Issued Date::"+Library.b);
        System.out.println("Total Number Book Issued::"+c);
        System.out.println("Return Date::"+Library.date);
    }
    void exit()
    {
        System.exit(0);
    }
}
