package com.hunhot.nideshop.utils;

import java.util.List;

/**
 * ClassName: 列表分页类
 * @param <T>
 */
public class PageList<T> {

    private List<T> list;
    private int pageIndex;
    private int pageSize;
    private int total;
    private int pageCount;

    private void setPageList(List<T> list, int pageSize){
        this.list = list;
        this.pageSize = pageSize;
        this.total = list.size();
        this.pageCount = total % pageSize == 0 ? total / pageSize : total / pageSize + 1;
    }

    public PageList(List<T> list) {
        setPageList(list, 500);
    }

    public PageList(List<T> list, int pageSize) {
        setPageList(list, pageSize);
    }

    public List<T> getPageList(int pageIndex) {
        this.pageIndex = pageIndex;
        int fromIndex = pageIndex * pageSize;
        int toIndex = (pageIndex == pageCount - 1)? total : (pageIndex + 1) * pageSize;

        return list.subList(fromIndex, toIndex);
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getTotal() {
        return total;
    }

    public int getPageCount() {
        return pageCount;
    }
}
