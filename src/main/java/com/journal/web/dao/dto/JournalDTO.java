package com.journal.web.dao.dto;

import java.util.Date;

public class JournalDTO {
    private String journalId;

    private String journalSize;

    private String journalTag;

    private String journalTheme;

    private Date createTime;

    private Date modifyTime;

    private String journalContent;

    public String getJournalId() {
        return journalId;
    }

    public void setJournalId(String journalId) {
        this.journalId = journalId == null ? null : journalId.trim();
    }

    public String getJournalSize() {
        return journalSize;
    }

    public void setJournalSize(String journalSize) {
        this.journalSize = journalSize == null ? null : journalSize.trim();
    }

    public String getJournalTag() {
        return journalTag;
    }

    public void setJournalTag(String journalTag) {
        this.journalTag = journalTag == null ? null : journalTag.trim();
    }

    public String getJournalTheme() {
        return journalTheme;
    }

    public void setJournalTheme(String journalTheme) {
        this.journalTheme = journalTheme == null ? null : journalTheme.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getJournalContent() {
        return journalContent;
    }

    public void setJournalContent(String journalContent) {
        this.journalContent = journalContent == null ? null : journalContent.trim();
    }
}