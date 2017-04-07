package controllers;

import java.util.List;

import models.Admin;
import models.Post;
import play.data.validation.Required;
import play.mvc.Controller;

public class AdminController extends Controller{
	
	public static void LoginForm() {
		render("@Application.adminLogin");
	}
	public static void Login(@Required String adminName, @Required String password) {
		
		Admin admin=Admin.find("adminName=?",  adminName).first();
		
		if(admin!=null && admin.password.equals(password)){
			List<Post> list = Post.findAll();
			renderArgs.put("post", list);
			render("@Application.admin");
		}
		else{
			render("@Application.post");
		}
		
	}
	public static void postForm() {
		render("@Application.post");
	}
	
}
