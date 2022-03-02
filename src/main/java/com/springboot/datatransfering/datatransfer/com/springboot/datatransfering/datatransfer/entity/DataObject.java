package com.springboot.datatransfering.datatransfer.com.springboot.datatransfering.datatransfer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.Nullable;

import lombok.Data;

@Entity
@Data
public class DataObject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "match_id")
	private String matchId;

	@Column(name = "market_id")
	private String marketId;

	@Column(name = "outcome_id")
	private String outcomeId;

	@Column(name = "specifiers")
	@Nullable
	private String specifiers;

	@Column(name = "date")
	private String date;

}
