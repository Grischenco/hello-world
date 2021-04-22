сервер пакетов ;

import  java.io.DataInputStream ;
import  java.io.DataOutputStream ;
import  java.io.IOException ;
import  java.net.ServerSocket ;
import  java.net.Socket ;
import  java.util.ArrayList ;

public  class  Server {
    public  static  void  main ( String [] args ) { // Основной поток
        ArrayList < Пользователь > пользователи =  новый  ArrayList <> (); // Коллекция пользователей
            попробуйте {
                ServerSocket serverSocket =  новый  ServerSocket ( 8188 );
                Система . из . println ( " Сервер запущен " );
                while ( true ) {
                    Сокет socket = serverSocket . принимать(); // Ожидаем клиента
                    Система . из . println ( « Клиент подключился » );
                    Thread thread =  new  Thread ( new  Runnable () { // Поток для клиента
                        @Override
                        public  void  run () {
                            попробуйте {
                                DataOutputStream out =  новый  DataOutputStream (сокет . GetOutputStream ());
                                DataInputStream in =  новый  DataInputStream (socket . GetInputStream ());
                                из . writeUTF ( " Введите имя: " );
                                Строка userName = in . readUTF ();
                                Пользователь пользователь =  новый  пользователь (имя пользователя , сокет);
                                пользователей . Добавить пользователя);
                                из . writeUTF (userName + " добро пожаловать на сервер! " );
                                while ( true ) {
                                    Строковый запрос = в . readUTF (); // Ждём сообщение от клиента
                                    Система . из . println (userName + " : " + запрос);
                                    для ( Пользователь user1 : пользователи) {
                                        user1 . sendMessage (userName + " : " + запрос);
                                    }
                                }
                            } catch ( Exception e) {
                                е . printStackTrace ();
                            }
                        }
                    });
                    нить . Начало();
                }



            } catch ( IOException e) {
                е . printStackTrace ();
            }

    }
