public  class  MultiThread {
    public  static  void  main ( String [] args ) {
        / *
        Способ 1
        MyThread t1 = новый MyThread ();
        MyThread t2 = новый MyThread ();
        t1.task = "Стираем белье";
        t2.task = "Моем посуду";
        t1.start ();
        t2.start (); * /
        / *
        Способ 2
        Тема t1 = новая тема (new MyRunnableClass ("Моем посуду"));
        Тема t2 = новая тема (new MyRunnableClass ("Стираем белье"));
        t1.start ();
        t2.start (); * /
        Тема t1 =  новая  тема ( new  Runnable () {
            @Override
            public  void  run () {
                for ( int i =  0 ; i <  200 ; i ++ ) {
                    Система . из . println (i + " стираем белье " );
                }
            }
        });
        Тема t2 =  новая  тема ( new  Runnable () {
            @Override
            public  void  run () {
                for ( int i =  0 ; i <  200 ; i ++ ) {
                    Система . из . println (i + " моем посуду " );
                }
            }
        });
        t1 . Начало();
        t2 . Начало();
    }
}

class  MyRunnableClass  реализует  Runnable {
    Строковая задача;

    общественный  MyRunnableClass ( Строка  задача ) {
        это . задача = задача;
    }

    @Override
    public  void  run () {
        for ( int i =  0 ; i <  200 ; i ++ ) {
            Система . из . println (я + "  " + это . задача);
        }
    }
}

class  MyThread  расширяет  Thread {
    Строковая задача;
    @Override
    public  void  run () {
        for ( int i =  0 ; i <  200 ; i ++ ) {
            Система . из . println (я + "  " + это . задача);
        }
    }
}
© 2021 GitHub, Inc.
