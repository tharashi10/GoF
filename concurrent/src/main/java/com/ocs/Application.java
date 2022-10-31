package com.ocs;

//import com.ocs.concurrent.Printer;
import com.ocs.concurrent.singleThreaded.Gate;
import com.ocs.concurrent.singleThreaded.UserThread;

/**
 * Main
 */
public class Application 
{
    public static void main( String[] args )
    {
        /**
         * 新しいスレッドを起動させる
         * 逐次(Sequential):複数の仕事を順番に
         * 並列(Paralell):複数の仕事を同時に
         * 並行(concurrent):どんな順序で処理してもOK複数の作業(逐次+並列)
         */
        // 最も基本的なThreadの書き方(Hoge/Goodの混在表示)
        //PrintThread th = new PrintThread("hoge");
        //th.start();
        //for(int i=0;i<100; i++){
        //    System.out.print( "Good" );
        //}

        /*
         * UserThread Class
         */
        System.out.println("Testing Gate, hit Ctrl+C to exit;");
        Gate gate = new Gate();
        new UserThread(gate, "Alice", "Alaska").start();
        new UserThread(gate, "Bob", "Brazil").start();
        new UserThread(gate, "Chris", "Canada").start();
    }
}
