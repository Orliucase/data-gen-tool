package cn.jaspter;

import cn.jaspter.constance.DaoConstance;

public class MemberTemp {
    private String serno;
    private String partationId;
    private String firstName;
    private String lastName;


    public String getSerno() {
        return serno;
    }

    public void setSerno(String serno) {
        this.serno = serno;
    }

    public String getPartationId() {
        return partationId;
    }

    public void setPartationId(String partationId) {
        this.partationId = partationId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String write2String(){
        StringBuilder sb = new StringBuilder();
        sb.append(serno).append(DaoConstance.fieldTerminated)
                .append(partationId).append(DaoConstance.fieldTerminated)
                .append(firstName).append(DaoConstance.fieldTerminated)
                .append(lastName).append(DaoConstance.lineTerminatedBe).append(DaoConstance.lineTerminatedAf);
        return sb.toString();
    }
}
