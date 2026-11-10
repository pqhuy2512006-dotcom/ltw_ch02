package murach.business;

import java.io.Serializable;
import java.time.LocalDate;

public class Survey extends User implements Serializable {
    private LocalDate dob;
    private String hearFrom;
    private String wantsAnnouncements;
    private String wantsSpecialOffers;
    private String contactMethod;

    public Survey(){
        super();
        dob = null;
        hearFrom = "";
        wantsAnnouncements = "";
        wantsSpecialOffers = "";
        contactMethod = "";
    }
    public LocalDate getDob() { return dob; }
    public void setDob(LocalDate dob) { this.dob = dob; }

    public String getHearFrom() { return hearFrom; }
    public void setHearFrom(String hearFrom) { this.hearFrom = hearFrom; }

    public String getWantsAnnouncements() { return wantsAnnouncements; }
    public void setWantsAnnouncements(String wantsAnnouncements) { this.wantsAnnouncements = wantsAnnouncements; }

    public String getWantsSpecialOffers() { return wantsSpecialOffers; }
    public void setWantsSpecialOffers(String wantsSpecialOffers) { this.wantsSpecialOffers = wantsSpecialOffers; }

    public String getContactMethod() { return contactMethod; }
    public void setContactMethod(String contactMethod) { this.contactMethod = contactMethod; }
}
