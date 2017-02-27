package com.sgs.vision.api.util.converter;

import org.modelmapper.ModelMapper;

import com.sgs.vision.storage.model.Issue;
import com.sgs.vision.storage.model.history.IssueHist;

public class IssueConverter {

	public static IssueHist convertEntityToHistoryDto(Issue issue){
		if(issue == null) return null;
		ModelMapper mm = new ModelMapper();
		IssueHist issueHist = mm.map(issue, IssueHist.class);
		return issueHist;
	}
}
