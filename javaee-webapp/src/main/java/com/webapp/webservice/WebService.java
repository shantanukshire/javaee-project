package com.webapp.webservice;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.webapp.bean.Book;


@Path("/webservice")
public class WebService {
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Object getResponse(){  
    	List<Book> bookList = new ArrayList<Book>();
    	    	
    	Book book1 = new Book("Wings Of Fire","Arun Tiwari",1000);
    	Book book2 = new Book("Into the Water","Paula Hawkins",500);
    	Book book3 = new Book("Blood Communion","Anne Rice",2000);
    	
    	bookList.add(book1);
    	bookList.add(book2);
    	bookList.add(book3);
    	
    	
        //firstName,LastName,Age,Id
        Gson gson = new GsonBuilder().create();
        return gson.toJson(bookList);
    }

}
