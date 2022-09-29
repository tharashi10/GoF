## Java Tips
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