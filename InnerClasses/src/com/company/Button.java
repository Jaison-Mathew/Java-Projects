package com.company;

public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    //method sets OnClickListener
    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    //method passing information that the button was clicked
    public void onClick(){
        this.onClickListener.onClick(this.title);
    }

    public interface OnClickListener{
        public void onClick(String title);
    }
}
