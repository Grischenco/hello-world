пакетный  клиент ;

import  java.io.DataInputStream ;
import  java.io.DataOutputStream ;
import  java.io.IOException ;
import  java.net.Socket ;
import  java.util.Scanner ;

public  class  Client {
    public  static  void  main ( String [] args ) {
        попробуйте {
            Socket socket =  новый  Socket ( " 192.168.1.77 " , 8188 );
            DataInputStream in =  новый  DataInputStream (socket . GetInputStream ());
            DataOutputStream out =  новый  DataOutputStream (сокет . GetOutputStream ());
            Thread thread =  new  Thread ( new  Runnable () {
                @Override
                public  void  run () {
                    while ( true ) {
                        Строковый ответ =  null ; // Читаем ответ сервера
                        попробуйте {
                            ответ = в . readUTF ();
                            Система . из . println (ответ);
                        } catch ( IOException e) {
                            е . printStackTrace ();
                        }
                    }

                }
            });
            нить . Начало();
            while ( true ) {
                Сканер Сканер =  новый  Сканер ( System . In);
                Строковый запрос = сканер . nextLine ();
                из . writeUTF (запрос); // Отправляем сообщение серверу
            }
        } catch ( IOException e) {
            е . printStackTrace ();
        }
    }

}
© 2021 GitHub, Inc.
