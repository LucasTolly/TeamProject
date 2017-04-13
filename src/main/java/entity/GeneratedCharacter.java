package entity;


/**
 * Created by Joe on 3/24/2017.
 * Represents a generated character
 */
public class GeneratedCharacter {

    private CharacterClass characterClass;
    private Description description;
    private Origin origin;
    private Quirk quirk;
    private Race race;
    private Alignment alignment;

    /**
     * Getter for characterClass
     * @return
     */
    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    /**
     * Setter for characterClass
     * @param characterClass
     */
    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    /**
     * Getter for description
     * @return
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Setter for description
     * @param description
     */
    public void setDescription(Description description) {
        this.description = description;
    }

    /**
     * Getter for origin
     * @return
     */
    public Origin getOrigin() {
        return origin;
    }

    /**
     * Setter for origin
     * @param origin
     */
    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    /**
     * Getter for quirk
     * @return
     */
    public Quirk getQuirk() {
        return quirk;
    }

    /**
     * Setter for quirk
     * @param quirk
     */
    public void setQuirk(Quirk quirk) {
        this.quirk = quirk;
    }

    /**
     * Getter for race
     * @return
     */
    public Race getRace() {
        return race;
    }

    /**
     * Setter for race
     * @param race
     */
    public void setRace(Race race) {
        this.race = race;
    }

    /**
     * Getter for alignment
     * @return
     */
    public Alignment getAlignment() {
        return alignment;
    }

    /**
     * Setter for alignment
     * @param alignment
     */
    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }
}