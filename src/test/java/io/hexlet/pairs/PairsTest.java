package io.hexlet.pairs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PairsTest {
  @Test
  void testPairs() {
    Pair pair1 = Pair.cons(1, 4);
    assertThat(Pair.car(pair1)).isEqualTo(1);
    assertThat(Pair.cdr(pair1)).isEqualTo(4);

    Pair pair2 = Pair.cons("one", "four");
    assertThat(Pair.car(pair2)).isEqualTo("one");
    assertThat(Pair.cdr(pair2)).isEqualTo("four");

    Pair pair3 = Pair.cons("number", 10);
    assertThat(Pair.car(pair3)).isEqualTo("number");
    assertThat(Pair.cdr(pair3)).isEqualTo(10);
  }

  @Test
  void testPairToString() {
    Pair pair1 = Pair.cons(1, 4);
    assertThat(Pair.pairToString(pair1)).isEqualTo("(1, 4)");

    Pair pair2 = Pair.cons("one", "four");
    assertThat(Pair.pairToString(pair2)).isEqualTo("(one, four)");

    Pair pair3 = Pair.cons("number", 10);
    assertThat(Pair.pairToString(pair3)).isEqualTo("(number, 10)");
  }

  @Test
  void testIsPair() {
    Pair pair = Pair.cons(1, 4);
    assertThat(Pair.isPair(pair)).isTrue();

    String text = "some text";
    assertThat(Pair.isPair(text)).isFalse();

    int number = 10;
    assertThat(Pair.isPair(number)).isFalse();
  }
}
