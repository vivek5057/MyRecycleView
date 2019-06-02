package com.example.acerpc.myrecyclevieww;

public class DemoClass {
    private String imageName;
    private String info;
    private Integer image;

    public DemoClass(String imageName, String info, Integer image) {
        this.imageName=imageName;
        this.info=info;
        this.image=image;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "DemoClass{" +
                "imageName='" + imageName + '\'' +
                ", info='" + info + '\'' +
                ", image=" + image +
                '}';
    }
}
