package com.dgz.tracking.dto;

public class Item {
	
	private String owner;
	private String process;
	private String item;
	private String step;
	private String stage;
	private String stagetime;
	private String createDateTime;
	
	
	public String getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(String createDateTime) {
		this.createDateTime = createDateTime;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getProcess() {
		return process;
	}
	public void setProcess(String process) {
		this.process = process;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getStep() {
		return step;
	}
	public void setStep(String step) {
		this.step = step;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getStagetime() {
		return stagetime;
	}
	public void setStagetime(String stagetime) {
		this.stagetime = stagetime;
	}
	
	@Override
	public String toString() {
		return "Item [owner=" + owner + ", process=" + process + ", item="
				+ item + ", step=" + step + ", stage=" + stage + ", stagetime="
				+ stagetime + ", createDateTime=" + createDateTime + "]";
	}
	
	
	

}
