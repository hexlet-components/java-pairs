# java-pairs

![publish](https://github.com/ShafigullinIK/java-pairs/workflows/publish/badge.svg)
![package](https://github.com/ShafigullinIK/java-pairs/workflows/package/badge.svg)

## Functions for working with Pairs

```java
import static io.hexlet.pairs.Pair.car;
import static io.hexlet.pairs.Pair.cdr;
import static io.hexlet.pairs.Pair.cons;
import static io.hexlet.pairs.Pair.pairToString;
import static io.hexlet.pairs.Pair.isPair;
```

## Usage examples

```java
var pair = cons(1, 2);

var one = car(pair); // one = 1;
var two = cdr(pair); // two = 2;

var isPair = isPair(pair); // isPair == true;

var result = pairToString(pair); // pair = "(1, 2)";
```

[![Hexlet Ltd. logo](https://raw.githubusercontent.com/Hexlet/hexletguides.github.io/master/images/hexlet_logo128.png)](https://ru.hexlet.io/pages/about?utm_source=github&utm_medium=link&utm_campaign=php-eloquent-blog)

This repository is created and maintained by the team and the community of Hexlet, an educational project. [Read more about Hexlet (in Russian)](https://ru.hexlet.io/pages/about?utm_source=github&utm_medium=link&utm_campaign=php-eloquent-blog).

