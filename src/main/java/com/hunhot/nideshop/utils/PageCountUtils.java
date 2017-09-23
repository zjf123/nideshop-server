package com.hunhot.nideshop.utils;

/**
 * TODO 描述
 * Created by bd007 on 2017/9/22.
 */
public class PageCountUtils {

    public static int getPageFrom(int page, int size) {
        if (page <= 0 || size <= 0) {
            return 0;
        }

        return (page - 1) * size;
    }

    public static int getPageTo(int page, int size) {
        if (page <= 0 || size <= 0) {
            return 0;
        }

        return page* size;
    }
}
