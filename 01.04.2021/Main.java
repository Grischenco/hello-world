import  java.util.Scanner ;

public  class  Main {
    public  static  void  main ( String [] args ) {
        Сканер Сканер =  новый  Сканер ( System . In);
        Hotel marriott =  новый  отель ( новый  номер []
                {
                        новая  комната ( 2 , истина , истина , ложь , ложь , 11 ),
                        новая  комната ( 2 , истина , истина , ложь , ложь , 12 ),
                        новая  комната ( 3 , истина , истина , истина , ложь , 13 ),
                        новая  комната ( 3 , правда , правда , правда , правда , 21 ),
                        новая  комната ( 4 , истина , истина , ложь , ложь , 22 ),
                        новая  комната ( 2 , ложь , ложь , ложь , ложь , 23 ),
                        новая  комната ( 2 , ложь , истина , ложь , ложь , 31 ),
                        новая  комната ( 1 , ложь , истина , истина , истина , 32 ),
                        новая  комната ( 1 , правда , правда , правда , правда , 33 )
                });
        while ( true ) {
            Система . из . println ( " Введите команду " );
            Строковая команда = сканер . nextLine ();
            if (command . equals ( " есть " )) {
                marriott . getRoomsWithEat ();
            } else  if (command . equals ( " freeRooms " )) {
                marriott . getFreeRooms ();
            }
        }
        / * Person oleg = new Person ("Олег", 35);
        System.out.println (oleg.name);
        Лицо игорь = новое Лицо («Игорь», 23);
        igor.sayHi (oleg.name); * /
    }
}

class  Person {
    Имя строки ;
    int age;
    int hp; // здоровье не может быть больше 100
    Человек ( String  name , int  age ) {
        это . name = name;
        это . age = возраст;
        это . hp =  100 ;
    }
    void  sayHi ( String  name ) {
        Система . из . println ( « Привет »  + имя + « Я » + это . имя);
    }
}
