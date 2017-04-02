package forum.controllers;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import forum.models.Post;
import forum.models.PostDao;

@Controller
public class PostController {
	
	 @RequestMapping("/post")
	  @ResponseBody
	  public String post(long id, String content){
		  Post post = null;
		  try{
			  post = new Post(id,content);
			  postDao.save(post);
			  
		  }catch(Exception e){
			  e.printStackTrace();
			  return "error thrown while tryint to add post: " + e.getMessage();
		  }
		  return "post added successfully";
	  }
	  
	 @RequestMapping("/fetchallposts")
	 @ResponseBody
	 public List<Post> fetchAllPosts(){
		// JSONArray jarray = null;
		 try{
			 List<Post> posts = postDao.findAll();
			 return posts;
		 }catch(Exception e){
			 e.printStackTrace();
			 return null;
		 }
	 }
	  @Autowired
	  private PostDao postDao;

	  /* @RequestMapping("/getposts")
	  @ResponseBody
	  public String getPosts(){
		  
	  }
	  */

}
