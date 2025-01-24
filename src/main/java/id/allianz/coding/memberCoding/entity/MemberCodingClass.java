package id.allianz.coding.memberCoding.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "azli_member_coding_class")
public class MemberCodingClass {

    @Id
    private int memberId;
    private String memberName;
    @Column(name = "MEMBER_DOB")
    private Date memberDOB;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId() {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName() {
        this.memberName = memberName;
    }

    public Date getMemberDOB() {
        return memberDOB;
    }

    public void setMemberDOB() {
        this.memberDOB = memberDOB;
    }
}