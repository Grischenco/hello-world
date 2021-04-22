 сервер пакетов ;

import  java.io.DataOutputStream ;
import  java.io.IOException ;
import  java.net.Socket ;
import  java.util.UUID ;

public  class  User {
    private  String userName;
    частный  сокет Socket ;
    частный  UUID uuid;

    общедоступный  пользователь ( String  userName , Socket  socket ) {
        это . userName = имя пользователя ;
        это . socket = сокет;
    }
    public  String  getUserName () { return userName;}
    общедоступный  сокет  getSocket () { возвратный сокет; }
    public  void  sendMessage ( String  msg ) {
        попробуйте {
            DataOutputStream out =  новый  DataOutputStream ( this . Socket . GetOutputStream ());
            из . writeUTF (сообщение);
        } catch ( IOException e) {
            е . printStackTrace ();
        }
    }
}
