package com.orcl.design.proxy;
/*
 * Printerの代理人クラス
 */
public class PrinterProxy implements Printable {
    private String name;            // 名前
    //private Printer real;           // 「本人」
    private Printable real;
    private String className;

    // コンストラクタ
    public PrinterProxy(String className) {
        this.name = "No Name";
        this.real = null;
        this.className = className;
    }

    // コンストラクタ（名前指定）
    public PrinterProxy(String name,String className) {
        this.name = name;
        this.real = null;
        this.className = className;
    }

    // 名前の設定
    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            // 「本人」にも設定する
            real.setPrinterName(name);
        }
        this.name = name;
    }

    // 名前の取得
    @Override
    public String getPrinterName() {
        return name;
    }

    // 表示
    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    // 「本人」を生成
    private synchronized void realize() {
        if (real == null) {
            try{
                real = (Printable)Class.forName(className).getDeclaredConstructor().newInstance();
                real.setPrinterName(name);
            }catch (ClassNotFoundException e){
                System.out.println("クラス"+className+"が見つかりません.");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
