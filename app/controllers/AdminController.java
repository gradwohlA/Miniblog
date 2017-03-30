package controllers;

import play.data.validation.Required;
import play.mvc.Controller;

public class AdminController extends Controller{
	
	public static void LoginForm() {
		render("@Application.adminLogin");
	}
	public static void Login() {
		render("@Application.admin");
	}
	public static void postForm() {
		render("@Application.post");
	}
	
}
