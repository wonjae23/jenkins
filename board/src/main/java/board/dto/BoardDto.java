package board.dto;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class BoardDto {
	
	private int boardIdx;
	private String title;
	private String contents;
	private int hitCnt;
	private String creatorId;
	private Timestamp createdDatetiem;
	private String updaterId;
	private Timestamp updateDatetime;
	public int getBoardIdx() {
		return boardIdx;
	}
	public void setBoardIdx(int boardIdx) {
		this.boardIdx = boardIdx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getHitCnt() {
		return hitCnt;
	}
	public void setHitCnt(int hitCnt) {
		this.hitCnt = hitCnt;
	}
	public String getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}
	
	public String getUpdaterId() {
		return updaterId;
	}
	public void setUpdaterId(String updaterId) {
		this.updaterId = updaterId;
	}
	public Timestamp getCreatedDatetiem() {
		return createdDatetiem;
	}
	public void setCreatedDatetiem(Timestamp createdDatetiem) {
		this.createdDatetiem = createdDatetiem;
	}
	public Timestamp getUpdateDatetime() {
		return updateDatetime;
	}
	public void setUpdateDatetime(Timestamp updateDatetime) {
		this.updateDatetime = updateDatetime;
	}
	@Override
	public String toString() {
		return "BoardDto [boardIdx=" + boardIdx + ", title=" + title + ", contents=" + contents + ", hitCnt=" + hitCnt
				+ ", creatorId=" + creatorId + ", createdDatetiem=" + createdDatetiem + ", updaterId=" + updaterId
				+ ", updateDatetime=" + updateDatetime + ", getBoardIdx()=" + getBoardIdx() + ", getTitle()="
				+ getTitle() + ", getContents()=" + getContents() + ", getHitCnt()=" + getHitCnt() + ", getCreatorId()="
				+ getCreatorId() + ", getUpdaterId()=" + getUpdaterId() + ", getCreatedDatetiem()="
				+ getCreatedDatetiem() + ", getUpdateDatetime()=" + getUpdateDatetime() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

	
	
}
