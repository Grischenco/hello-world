public  class  Hotel {
    Комната [] freeRooms;
    int [] usedRooms;
    Гостиница ( Комната [] комнаты ) {
        это . freeRooms =   комнаты;
        это . usedRooms =  new  int [rooms . длина];
    }
    void  getFreeRooms () {
        Комната [] rooms =  this . freeRooms;
        Система . из . println ( " --Список свободных комнат-- " );
        for ( int i =  0 ; i < rooms . length; i ++ ) {
            if (rooms [i] . roomNumber == 0 ) {
                продолжить ;
            }
            Система . из . println ( " Комната № " + rooms [i] . roomNumber);
        }
        Система . из . println ( " --Конец списка-- " );
    }
    void  getUsedRooms () {
        int [] rooms =  это . usedRooms;
        Система . из . println ( " --Список занятых комнат-- " );
        for ( int i =  0 ; i < rooms . length; i ++ ) {
            if (rooms [i] == 0 ) {
                продолжить ;
            }
            Система . из . println ( " Комната № " + комнаты [i]);
        }
        Система . из . println ( " --Конец списка-- " );
    }
    void  reservedRoom ( int  needRoom ) {
        Комната [] freeRooms =  это . freeRooms; // 3
        for ( int i =  0 ; i < freeRooms . length; i ++ ) {
            if (needRoom == freeRooms [i] . roomNumber) {
                freeRooms [i] . roomNumber =  0 ;
                это . usedRooms [i] = needRoom;
                Система . из . println ( " Комната номер " + needRoom + " свободна " );
                перерыв ;
            } else  if (i + 1 == freeRooms . length) {
                Система . из . println ( " Такой комныты не найдено " );
            }
        }
    }
    void  getRoomsWithEat () {
        Комната [] rooms =  this . freeRooms;
        for ( int i =  0 ; i < rooms . length; i ++ ) {
            if (rooms [i] . eat && rooms [i] . roomNumber ! = 0 ) {
                Система . из . println ( " Комната с едой " + rooms [i] . roomNumber);
            }
        }
    }
}
© 2021 GitHub, Inc.
