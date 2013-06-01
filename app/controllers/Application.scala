package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Your new application TADSDSAKLJDASLDJASJDLAD is ready."))
  }
  
  def newPage = Action { 
	  Ok(views.html.index("Test123"))
  }
  
  def tasks = TODO
  
}