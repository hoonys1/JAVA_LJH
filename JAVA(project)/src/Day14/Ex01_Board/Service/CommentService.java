package Day14.Ex01_Board.Service;

import java.util.List;

import Day14.Ex01_Board.DTO.Comment;

public interface CommentService {

		// 게시글 목록
		List<Comment> list();
		List<Comment> list(int boardNo);
		
		// 게시글 조회
		Comment select(int commentNo);
		
		// 게시글 추가
		int insert(Comment Comment);
		
		// 게시글 수정
		int update(Comment comment);
		
		// 게시글 삭제
		int delete(int commentNo);
	
}
