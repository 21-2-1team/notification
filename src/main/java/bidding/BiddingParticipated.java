package bidding;

import java.util.Date;

public class BiddingParticipated extends AbstractEvent {

    private Long id;
    private String noticeNo;
    private String participateNo;
    private String companyNo;
    private String companyNm;
    private Date participateDate;
    private Integer offerPrice;
    private String offerContents;
    private Boolean feePaymentFlag;

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
    public String getParticipateNo() {
        return participateNo;
    }

    public void setParticipateNo(String participateNo) {
        this.participateNo = participateNo;
    }
    public String getCompanyNo() {
        return companyNo;
    }

    public void setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
    }
    public String get조달업체명() {
        return companyNm;
    }

    public void set조달업체명(String companyNm) {
        this.companyNm = companyNm;
    }
    public Date get입찰일시() {
        return participateDate;
    }

    public void set입찰일시(Date participateDate) {
        this.participateDate = participateDate;
    }
    public Integer get제안가격() {
        return offerPrice;
    }

    public void set제안가격(Integer offerPrice) {
        this.offerPrice = offerPrice;
    }
    public String get제안내용() {
        return offerContents;
    }

    public void set제안내용(String offerContents) {
        this.offerContents = offerContents;
    }
    public Boolean get수수료납부여부() {
        return feePaymentFlag;
    }

    public void set수수료납부여부(Boolean feePaymentFlag) {
        this.feePaymentFlag = feePaymentFlag;
    }
}