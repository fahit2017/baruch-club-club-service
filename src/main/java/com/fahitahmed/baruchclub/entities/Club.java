package com.fahitahmed.baruchclub.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clubs")
public class Club {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "clubId")
	private int clubId;
	private String clubName;
	private String clubDescription;
	private String clubEmail;
	
	public int getClubId() {
		return clubId;
	}
	public void setClubId(int clubId) {
		this.clubId = clubId;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getClubDescription() {
		return clubDescription;
	}
	public void setClubDescription(String clubDescription) {
		this.clubDescription = clubDescription;
	}
	public String getClubEmail() {
		return clubEmail;
	}
	public void setClubEmail(String clubEmail) {
		this.clubEmail = clubEmail;
	}
	@Override
	public String toString() {
		return "Club [clubId=" + clubId + ", clubName=" + clubName + ", clubDescription=" + clubDescription
				+ ", clubEmail=" + clubEmail + "]";
	}
} 