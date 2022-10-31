# Java Tips
## インターフェース
#### Iterable<E> Interface
- 何かたくさんが集まったもの=「集合体」を表す
- E: 型パラメータ

```java
public interface Iterable<E>{
    public abstract Iterator<E> iterator();
}
```

#### Iterator<E> Interface
- 一つ一つの要素の処理を繰り返すためのもの
```java
public interface Iterator<E>{
    public abstract boolean hasNext();
    public abstract E next();
}
```

## toStringについて
- 最上位クラスのObjectクラス(暗黙の親クラス)のメソッドの一つ
- Instance 5大操作
  
|   Method   |    Action    | Class  |
|   ------   |    ------    | ------ |
| toString() | 文字列表現を得る| Object |
| equals()   | 等価判定を行う  | Object |
| hashCode() | hash値を得る   | Object |
| compareTo()| 大小判定を行う  | Comparable |
| clone()    | 複製する       | Object, Cloneable |
- System.out.println()命令は引数として、インスタンスを渡すと、そのtoString()メソッドを呼び出して、文字列表現を取り出し、画面に表示する(ref.スッキリわかるJava入門:実践編P113)
- 新たなクラスを開発したときは、toString()をオーバーライドして、意図した文字列を得るようにしておく