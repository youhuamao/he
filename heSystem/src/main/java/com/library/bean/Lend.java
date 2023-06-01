package com.library.bean;

import java.io.Serializable;
import java.util.Date;

public class Lend implements Serializable {

    private long ser_num;
    private long eat_id;
    private long reader_id;
    private Date collection_date;
    private Date back_date;

    public void setCollection_date(Date collection_date) {
        this.collection_date = collection_date;
    }

    public Date getCollection_date() {
        return collection_date;
    }

    public long getReaderId() {
        return reader_id;
    }

    public void setReaderId(long reader_id) {
        this.reader_id = reader_id;
    }

    public long getBookId() {
        return eat_id;
    }

    public void setBookId(long book_id) {
        this.eat_id = book_id;
    }

    public void setSer_num(long ser_num) {
        this.ser_num = ser_num;
    }

    public Date getBackDate() {
        return back_date;
    }

    public void setBackDate(Date back_date) {
        this.back_date = back_date;
    }


    public long getSer_num() {
        return ser_num;
    }
}
