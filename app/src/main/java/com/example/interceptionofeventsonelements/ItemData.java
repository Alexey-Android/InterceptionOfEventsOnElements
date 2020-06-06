package com.example.interceptionofeventsonelements;
import android.graphics.drawable.Drawable;
import android.widget.Button;

public class ItemData {

    private Drawable image;
    private String title;
    private String subtitle;
    //private boolean checked;
    private Button button;

    public ItemData(Drawable image, String title, String subtitle, Button button) {
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
        this.button = button;
    }
   /* public ItemData(Drawable image, String title, String subtitle, Button button) {
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
        this.checked = checked;

    }*/

    public Drawable getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public Button getButton() {
        return button;
    }


}
