package com.it5.firebasedemo.analytics;

/**
 * Created by IT5 on 2016/11/22.
 */
public class ImageInfo {
    public final int image;

    public final int title;
    public final int id;

    /**
     * Create a new ImageInfo.
     *
     * @param image resource of image
     * @param title resource of title
     * @param id resource of id
     */
    public ImageInfo(int image, int title, int id) {
        this.image = image;
        this.title = title;
        this.id = id;
    }

}
