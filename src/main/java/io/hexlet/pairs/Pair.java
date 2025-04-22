package io.hexlet.pairs;

import java.util.function.Function;

public interface Pair<L, R, T>
       extends Function<Function<L, Function<R, T>>, T> {

    static <L, R, T> Pair<L, R, T> cons(L left, R right) {
        return f -> f.apply(left).apply(right);
    }

    static <L, R> L car(Pair<L, R, L> pair) {
        return pair.apply(left -> right -> left);
    }

    static <L, R> R cdr(Pair<L, R, R> pair) {
        return pair.apply(left -> right -> right);
    }

    static String pairToString(Pair pair) {
        return "(" + car(pair) + ", " + cdr(pair) + ")";
    }

    static boolean isPair(Object o) {
        return o instanceof Pair;
    }
}
