import  java.io. * ;
import  java.net. * ;
import  java.util.Scanner ;

public  class  Main {
    public  static  void  main ( String [] args ) {

        попробуйте {
            FileReader reader =  новый  FileReader ( " C: \\ java \\ test.txt " );
            int c;
            Строка ip =  " " ;
            Строка port =  " " ;
            Строка прокси =  " " ;
            while ((c = reader . read ()) ! =  - 1 ) {
                если (c == 13 ) продолжить ;
                else  if (c ==  10 ) {
                    ip = прокси . split ( " : " ) [ 0 ];
                    порт = прокси . сплит ( " : " ) [ 1 ];
                    прокси =  " " ;
                    Строка finalIp = ip;
                    Строка finalPort = порт;
                    Thread thread =  new  Thread ( new  Runnable () {
                        @Override
                        public  void  run () {
                            Строка result = checkProxy (finalIp, Integer . ParseInt (finalPort));
                            если (результат . равно ( " ошибка " ))
                                Система . из . println (finalIp + « не работает » );
                            else {
                                Система . из . println (finalIp +  " работает " );
                            }
                        }
                    });
                    нить . Начало();

                }
                else  if (c ! =  9 ) {
                    прокси + = ( char ) c;
                } else {
                    прокси + =  " : " ;
                }
            }
        } catch ( IOException e) {
            е . printStackTrace ();
        }
        / * try {
            FileWriter writer = новый FileWriter ("C: \\ java \\ test.txt", true);
            String text = "Привет, мир";
            писатель.write (текст);
            писатель.append ("\ п");
            writer.write ("Привет, МИР");
            писатель.flush ();
        } catch (IOException e) {
            e.printStackTrace ();
        } * /
    }

    static  String  checkProxy ( String  ip , int  port ) {
        HttpURLConnection connection =  null ;
        попробуйте {
            Прокси- прокси =  новый  прокси ( прокси . Тип . HTTP , новый  InetSocketAddress (ip, порт));
            URL url =  новый  URL ( « https://vozhzhaev.ru/test.php » );
            connection = ( HttpURLConnection ) url . openConnection (прокси);
            InputStream это = соединение . getInputStream ();
            BufferedReader rd =  новый  BufferedReader ( новый  InputStreamReader (есть));
            StringBuilder response =  новый  StringBuilder (); // или StringBuffer, если Java версии 5+
            Строка строки;
            while ((line = rd . readLine ()) ! =  null ) {
                ответ . добавить (строка);
                ответ . добавить ( ' \ r ' );
            }
            рд . Закрыть();
            ответный ответ . нанизывать();
        } catch ( Exception e) {
            вернуть  « ошибку » ;
        } finally {
            if (соединение ! =  null ) {
                подключение . Отключить();
            }
        }
    }
}
