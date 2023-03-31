package board.dto.reqeuset.board;

public class PostBoardDto {

		private String title;
		private String content;
		private String boardImageUrl;
		private String writerEmail;
		
		public PostBoardDto() {
		}
		public PostBoardDto(String title, String content, String boardImageUrl, String writerEmail) {
			this.title = title;
			this.content = content;
			this.boardImageUrl = boardImageUrl;
			this.writerEmail = writerEmail;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getBoardImageUrl() {
			return boardImageUrl;
		}
		public void setBoardImageUrl(String boardImageUrl) {
			this.boardImageUrl = boardImageUrl;
		}
		public String getWriterEmail() {
			return writerEmail;
		}
		public void setWriterEmail(String writerEmail) {
			this.writerEmail = writerEmail;
		}
		@Override
		public String toString() {
			return "PostBoardDto [title=" + title + ", content=" + content + ", boardImageUrl=" + boardImageUrl
					+ ", writerEmail=" + writerEmail + "]";
		}
		
		public boolean vaild() {
			boolean result = 
					this.title.isBlank()||
					this.content.isBlank();
			return result;
		}

		public boolean auth() {
			boolean result = this.writerEmail.isBlank();
			return result;
		}
		
}
