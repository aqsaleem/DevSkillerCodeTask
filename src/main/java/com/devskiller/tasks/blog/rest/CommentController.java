package com.devskiller.tasks.blog.rest;

import com.devskiller.tasks.blog.model.dto.CommentDto;
import com.devskiller.tasks.blog.model.dto.NewCommentDto;
import com.devskiller.tasks.blog.service.CommentService;
import com.devskiller.tasks.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class CommentController {

	private final CommentService commentService;

	public CommentController(CommentService commentService) {
		this.commentService = commentService;
	}

	@PostMapping(value ="/{id}/comments")
	@ResponseStatus(HttpStatus.CREATED)
	public String addComment(@PathVariable String id, @RequestBody NewCommentDto newCommentDto) {
		return commentService.addComment(newCommentDto);
	}

	@GetMapping(value = "{id}/comments")
	public List<CommentDto> getComments(@PathVariable String id) {
		return commentService.getCommentsForPost(id);
	}

}
