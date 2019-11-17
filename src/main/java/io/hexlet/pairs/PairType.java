package io.hexlet.pairs;
import java.util.function.*;

enum Messages {
    CAR,
    CDR
}

interface PairType<T> extends Function<Messages, T> {};
