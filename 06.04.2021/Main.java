public  class  Main {
    public  static  void  main ( String [] args ) {
        Person katya =  new  Person ( " Екатерина " , 70 , null , null );
        Лицо oleg =  новое  Лицо ( " Олег " , 45 , null , null );
        Человек olga =  новый  Человек ( " Ольга " , 47 , катя, null );
        Person igor =  new  Person ( " Игорь " , 20 , ольга, олег);

        // System.out.println (igor.getMother (). GetName ());
        ольга . получить информацию();
    }
}
// У человека не может бытьь более 100 едениц здоровья
class  Person {
    частное  строковое имя;
    частный  int age;
    частное  int hp;
     мать частного лица ;
     отец частного лица ;
    public  Person ( String  name , int  age , Person  mother , Person  Father ) {
        это . name = name;
        это . age = возраст;
        это . hp =  100 ;
        это . мать = мать;
        это . отец = отец;
    }
    public  Person  getMother () {
        вернуть мать;
    }

    public  Person  getFather () {
        вернуть отца;
    }
    void  setHp ( int  hp ) {
        если ( this . hp + hp > = 100 ) this . hp =  100 ;
        еще  это . hp + = hp;
    }
    int  getHp () { вернуть  это . hp;}

    public  String  getName () {
        возвращаемое имя;
    }

    public  void  setName ( String  name ) {
        это . name = name;
    }

    public  int  getAge () {
        возвратный возраст;
    }

    public  void  setAge ( int  age ) {
        это . age = возраст;
    }

    public  void  getInfo () {
        Строка info =  " " ;
        info + =  " Меня зовут " + это . name + " \ n " +
                « Мне » + это . возраст + " лет \ п " ;
        if ( this . mother ! =  null ) {
            info + =  " Мою маму зовут "  +  это . мать . имя +  " \ п " ;
            если ( это . мать . мать ! =  ноль )
                info + =  " Бабушку по маминой линии зовут "  +  this . мать . мать . имя +  " \ п " ;
        }
        если ( это . отец ! =  NULL ) Информация + =  " Моего папу зовут " + это . отец . имя + " \ п " ;
        Система . из . println (информация);
    }
}
