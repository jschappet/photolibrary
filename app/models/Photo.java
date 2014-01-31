package models;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import play.db.ebean.Model;

import java.util.*;


import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class Photo extends Model {
        
        
    public static Model.Finder<Long,Photo> find = new Model.Finder<Long,Photo>(Long.class, Photo.class);

        
        @Id
        public Long id;        
        
        public Date load_date;
        public String year        ;
        public String month;
        public String day;
        public String location;
        public String name;
        public String url;


    public Photo(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public static Photo create(String name, String url) {
        Photo photo = new Photo(name,url);
        photo.save();
        return photo;
    }

    public static String rename(Long photoId, String name) {
        Photo photo = Photo.find.ref(photoId);
        photo.name = name;
        photo.update();
	return name;
    }

    public String toString() {
        return "Photo(" + id + ") name:" +  name;
    }


   /**
     * Return a page of Photos
     *
     * @param page Page to display
     * @param pageSize Number of computers per page
     * @param sortBy Computer property used for sorting
     * @param order Sort order (either or asc or desc)
     * @param filter Filter applied on the name column
     */
    public static Page<Photo> page(int page, int pageSize, String sortBy, String order, String filter) {
        return 
            find.where()
               // .ilike("name", "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .findPagingList(pageSize)
                .setFetchAhead(false)
                .getPage(page);
    }

}
