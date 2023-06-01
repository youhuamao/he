package com.library.controller;

import com.library.bean.Book;
import com.library.bean.ReaderInfo;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

@Service
public class StringToUTF8 {

    //通过post方式从jsp页面传过来的string类型参数，出现乱码问题，将ISO-8859-1编码格式转为UTF-8
    public Book transferBookToUTF8(Book book) throws UnsupportedEncodingException {
        String name = new String(book.getName().getBytes("ISO-8859-1"),"UTF-8");
        String author = new String(book.getAuthor().getBytes("ISO-8859-1"),"UTF-8");
        String ingredients = new String(book.getIngredients().getBytes("ISO-8859-1"),"UTF-8");
        String population = new String(book.getPopulation().getBytes("ISO-8859-1"),"UTF-8");
        String cookingmethod = new String(book.getCookingmethod().getBytes("ISO-8859-1"),"UTF-8");
        String introduction = new String(book.getIntroduction().getBytes("ISO-8859-1"),"UTF-8");
        book.setName(name);
        book.setAuthor(author);
        book.setIngredients(ingredients);
        book.setIntroduction(introduction);
        book.setPopulation(population);
        book.setCookingmethod(cookingmethod);
        return book;
    }

    public ReaderInfo transferReaderToUTF8(ReaderInfo readerInfo) throws UnsupportedEncodingException {
        String name = new String(readerInfo.getName().getBytes("ISO-8859-1"),"UTF-8");
        String sex = new String(readerInfo .getSex().getBytes("ISO-8859-1"),"UTF-8");
        String address = new String(readerInfo.getAddress().getBytes("ISO-8859-1"),"UTF-8");
        readerInfo.setName(name);
        readerInfo.setSex(sex);
        readerInfo.setAddress(address);
        return readerInfo;
    }
}
