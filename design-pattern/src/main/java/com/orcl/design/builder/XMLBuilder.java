package com.orcl.design.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class XMLBuilder implements Builder {
    private String filename = "Untitled.xml";
    // StringはImmutableクラスであるため、+するたびにインスタンスを破棄/生成させる
    // 文字列連結ではString Builderを使うのが吉
    private StringBuilder sb = new StringBuilder();
    
    @Override
    public void makeTitle(String title){
        filename = title + ".xml";
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8 \"standalone=\"no\"?>");
        sb.append("\n");
        sb.append("<sample>");
        sb.append("<title>");
        sb.append(title);
        sb.append("</title>\n\n");
    }

    @Override
    public void makeString(String str){
        sb.append("<text>");
        sb.append(str);
        sb.append("</text>\n\n");
    }

    @Override
    public void makeItems(String[] items){
        sb.append("<items>");
        for(String s: items){
            sb.append("<item>");
            sb.append(s);
            sb.append("</item>");
        }
        sb.append("</items>");
    }

    @Override
    public void close(){
        sb.append("</sample>\n");
        try{
            Writer writer = new FileWriter(filename);
            writer.write(sb.toString());
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public String getHTMLResult(){
        return filename;
    }

}