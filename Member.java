import java.util.Date;

public class Member {
    private int memberId;
    private String name;
    private int issuedBookId = -1; // -1 means no book issued
    private Date issueDate;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    // Getters and Setters
    public int getMemberId() { return memberId; }
    public String getName() { return name; }
    public int getIssuedBookId() { return issuedBookId; }
    public void setIssuedBookId(int id) { this.issuedBookId = id; }
    public Date getIssueDate() { return issueDate; }
    public void setIssueDate(Date date) { this.issueDate = date; }
}