package entity;

import javax.persistence.*;

/**
 * Created by Joe on 3/24/2017.
 */
@Entity
@Table(name = "alignment", schema = "team_project", catalog = "")
public class Alignment {
    private int alignmentId;
    private String lawfulChaotic;
    private String goodEvil;

    /**
     * This is the getter for alignmentId
     * @return alignmentId
     */
    @Id
    @Column(name = "Alignment_Id", nullable = false)
    public int getAlignmentId() {
        return alignmentId;
    }

    /**
     * This is the setter for alignmentId. It would never be used.
     * @param alignmentId
     */
    public void setAlignmentId(int alignmentId) {
        this.alignmentId = alignmentId;
    }

    /**
     * This is the getter for lawfulChaotic
     * @return lawfulChaotic
     */
    @Basic
    @Column(name = "Lawful_Chaotic", nullable = true, length = 255)
    public String getLawfulChaotic() {
        return lawfulChaotic;
    }

    /**
     * This is the setter for lawfulChaotic
     * @param lawfulChaotic
     */
    public void setLawfulChaotic(String lawfulChaotic) {
        this.lawfulChaotic = lawfulChaotic;
    }

    /**
     * This is the getter for goodEvil
     * @return goodEvil
     */
    @Basic
    @Column(name = "Good_Evil", nullable = true, length = 255)
    public String getGoodEvil() {
        return goodEvil;
    }

    /**
     * This is the setter for goodEvil
     * @param goodEvil
     */
    public void setGoodEvil(String goodEvil) {
        this.goodEvil = goodEvil;
    }

    /**
     * This method overrides the equals
     * @param o comparing object
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Alignment alignment = (Alignment) o;

        if (alignmentId != alignment.alignmentId) return false;
        if (lawfulChaotic != null ? !lawfulChaotic.equals(alignment.lawfulChaotic) : alignment.lawfulChaotic != null)
            return false;
        if (goodEvil != null ? !goodEvil.equals(alignment.goodEvil) : alignment.goodEvil != null) return false;

        return true;
    }

    /**
     * Overrides the hashCode method
     * @return
     */
    @Override
    public int hashCode() {
        int result = alignmentId;
        result = 31 * result + (lawfulChaotic != null ? lawfulChaotic.hashCode() : 0);
        result = 31 * result + (goodEvil != null ? goodEvil.hashCode() : 0);
        return result;
    }
}
