package entity;

import javax.persistence.*;

/**
 * Created by Joe on 3/24/2017.
 */
@Entity
@Table(name = "classes", schema = "team_project", catalog = "")
public class CharacterClass {
    private String className;
    private String pfsrdLink;

    /**
     * Getter for className
     * @return className
     */
    @Id
    @Column(name = "class_name", nullable = false, length = 25)
    public String getClassName() {
        return className;
    }

    /**
     * Setter for className
     * @param className
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * Getter for pfsrdLink
     * @return pfsrdLink
     */
    @Basic
    @Column(name = "pfsrd_link", nullable = true, length = 200)
    public String getPfsrdLink() {
        return pfsrdLink;
    }

    /**
     * Setter for pfsrdLink
     * @param pfsrdLink
     */
    public void setPfsrdLink(String pfsrdLink) {
        this.pfsrdLink = pfsrdLink;
    }

    /**
     * Override for the equals method
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CharacterClass that = (CharacterClass) o;

        if (className != null ? !className.equals(that.className) : that.className != null) return false;
        if (pfsrdLink != null ? !pfsrdLink.equals(that.pfsrdLink) : that.pfsrdLink != null) return false;

        return true;
    }

    /**
     * Override for the hashCode method
     * @return
     */
    @Override
    public int hashCode() {
        int result = className != null ? className.hashCode() : 0;
        result = 31 * result + (pfsrdLink != null ? pfsrdLink.hashCode() : 0);
        return result;
    }
}
