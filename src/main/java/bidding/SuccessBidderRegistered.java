
package bidding;

public class SuccessBidderRegistered extends AbstractEvent {

    private Long id;
    private String noticeNo;
    private String title;
    private String demandOrgNm;
    private String succBidderNm;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNoticeNo() {
        return noticeNo;
    }
    public void setNoticeNo(String noticeNo) {
        this.noticeNo = noticeNo;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDemandOrgNm() {
        return demandOrgNm;
    }
    public void setDemandOrgNm(String demandOrgNm) {
        this.demandOrgNm = demandOrgNm;
    }
    public String getSuccBidderNm() {
        return succBidderNm;
    }
    public void setSuccBidderNm(String succBidderNm) {
        this.succBidderNm = succBidderNm;
    }

    
}

