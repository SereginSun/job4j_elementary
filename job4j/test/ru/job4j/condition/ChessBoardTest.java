package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ChessBoardTest {

    @Test
    public void wayIs5() {
        ChessBoard grid = new ChessBoard();
        int way = grid.way(6, 7, 1, 2);
        assertThat(way, is(5));
    }

    @Test
    public void wayIs7() {
        ChessBoard grid = new ChessBoard();
        int way = grid.way(7, 0, 0, 7);
        assertThat(way, is(7));
    }

    @Test
    public void wayIs0() {
        ChessBoard grid = new ChessBoard();
        int way = grid.way(2, 6, 4, 1);
        assertThat(way, is(0));
    }

    @Test
    public void wayIs3() {
        ChessBoard grid = new ChessBoard();
        int way = grid.way(3, 7, 0, 4);
        assertThat(way, is(3));
    }
}