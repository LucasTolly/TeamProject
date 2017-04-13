package entity;

import javax.persistence.*;

/**
 * Created by Joe on 3/24/2017.
 */
@Entity
@Table(name = "description", schema = "team_project", catalog = "")
public class Description {
    private int descriptionId;
    private String descriptionString;

    /**
     * Getter for descriptionId
     * @return
     */
    @Id
    @Column(name = "Description_Id", nullable = false)
    public int getDescriptionId() {
        return descriptionId;
    }

    /**
     * Setter for descriptionId. Should never be used.
     * @param descriptionId
     */
    public void setDescriptionId(int descriptionId) {
        this.descriptionId = descriptionId;
    }

    /**
     * Getter for descriptionString
     * @return descriptionSTring
     */
    @Basic
    @Column(name = "Description_String", nullable = true, length = 255)
    public String getDescriptionString() {
        return descriptionString;
    }

    /**
     * Setter for descriptionString
     * @param descriptionString
     */
    public void setDescriptionString(String descriptionString) {
        this.descriptionString = descriptionString;
    }

    /**
     * Override for equals method
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Description that = (Description) o;

        if (descriptionId != that.descriptionId) return false;
        if (descriptionString != null ? !descriptionString.equals(that.descriptionString) : that.descriptionString != null)
            return false;

        return true;
    }

    /**
     * Override for hashCode method
     * @return
     */
    @Override
    public int hashCode() {
        int result = descriptionId;
        result = 31 * result + (descriptionString != null ? descriptionString.hashCode() : 0);
        return result;
    }
}
