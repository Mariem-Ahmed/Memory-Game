package com.example.marim.memorygame;

import android.widget.Button;

/**
 * Created by Marim on 21-Apr-16.
 */
public class Card {
    public int x;
    public int y;
    public Button button;

    public Card(Button button, int x,int y) {
        this.x = x;
        this.y=y;
        this.button=button;
    }
}
