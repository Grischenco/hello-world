образец упаковки ;

import  javafx.application.Application ;
import  javafx.fxml.FXMLLoader ;
импорт  javafx.scene.Parent ;
import  javafx.scene.Scene ;
import  javafx.stage.Stage ;

import  java.io.DataInputStream ;
import  java.io.DataOutputStream ;
import  java.io.IOException ;
import  java.net.Socket ;
import  java.util.Scanner ;

открытый  класс  Main  extends  Application {

    @Override
    public  void  start ( Stage  primaryStage ) выдает  исключение {
        Родительский корень =  FXMLLoader . load (getClass () . getResource ( " sample.fxml " ));
        primaryStage . setTitle ( " Сетевой чат " );
        primaryStage . setScene ( новая  сцена (корень, 300 , 275 ));
        primaryStage . показывать();
    }


    public  static  void  main ( String [] args ) {
        запуск (аргументы);
    }
}



/ * --module-path
"C: \ Program Files \ Java \ javafx-sdk-11.0.2 \ lib"
--add-modules
javafx.controls, javafx.fxml, javafx.base, javafx.graphics, javafx.web
--add-export
javafx.graphics/com.sun.javafx.sg.prism=ALL-UNNAMED * /
