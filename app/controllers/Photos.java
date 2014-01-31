package controllers;

import play.mvc.*;
import static play.data.Form.*;

import java.util.*;

import models.*;

import views.html.*;
import views.html.photos.*;

/**
 * Manage projects related operations.
 */
@Security.Authenticated(Secured.class)
public class Photos extends Controller {
  
    /**
     * Display the dashboard.
     */
    public static Result index() {
        return ok(
            photoviewer.render(Photo.page(0, 12, "", null, ""))
            );
    }

    // -- Photos

    /**
     * Add a project.
     */
    public static Result add() {
        Photo newPhoto = Photo.create(
            "New Photo", 
            "url"
        );
        return ok(item.render(newPhoto));
    }


    /**
     * Update a photo.
     */
    public static Result update(Long photo) {
        Photo newPhoto = Photo.create(
            "New Photo",
            "url_update" 
        );
        return ok(item.render(newPhoto));
    }
    
    /**
     * Rename a project.
     */
    public static Result rename(Long photo) {
        if(Secured.isMemberOf(photo)) {
            return ok(
                Photo.rename(
                    photo, 
                    form().bindFromRequest().get("name")
                )
            );
        } else {
            return forbidden();
        }
    }
    
  
}

