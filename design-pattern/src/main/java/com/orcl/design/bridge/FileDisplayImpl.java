package com.orcl.design.bridge;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// 文字列を表示するクラス
public class FileDisplayImpl extends DisplayImpl{
    private String filename;
    
    public FileDisplayImpl(String filename){
        this.filename = filename;
    }

    @Override
    public void rawOpen() {
        System.out.println("===[" + filename + "]===");
    }

    @Override
    public void rawPrint() {
        try{
            for (String line: Files.readAllLines(Path.of(filename))){
                System.out.print(">>");
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void rawClose() {
        System.out.println("==================");
    }
    
}
