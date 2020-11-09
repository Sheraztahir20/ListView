package com.example.listview;

public class MyListData {
    public String descripton;
    public int imageId;

    public MyListData(String descripton,int imageId){
        this.descripton = descripton;
        this.imageId = imageId;
    }
    public String getDescripton(){
        return descripton;
    }
    public void setDescripton(String descripton){
        this.descripton = descripton;
    }
    public int getImageId(){
        return imageId;
    }
    public void setImageId(int imageId){
        this.imageId = imageId;
    }
}
