package com.journal.web.entity.request.journal;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

import com.journal.web.entity.BaseRequest;

@Getter
@Setter
public class GetJournalByIdRequest extends BaseRequest implements Serializable{

	private static final long serialVersionUID = 179450851008520186L;
	
	private String id;

}
