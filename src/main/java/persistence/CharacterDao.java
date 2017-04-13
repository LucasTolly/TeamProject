package persistence;

import entity.*;
import org.hibernate.Session;

import java.util.ArrayList;

/**
 * Created by David on 3/30/2017.
 * This class will work with all of the tables to generate the output
 */
public class CharacterDao {

    /**
     * Generates a new character using the class Math's random method
     * @return the new character
     */
    public GeneratedCharacter generateCharacter() {
        GeneratedCharacter character = new GeneratedCharacter();

        character.setCharacterClass(getRandomCharacterClass());
        character.setAlignment(getRandomAlignment());
        character.setDescription(getRandomDescription());
        character.setOrigin(getRandomOrigin());
        character.setQuirk(getRandomQuirk());
        character.setRace(getRandomRace());

        return character;
    }

    /**
     * Randomly generates a new alignment out of all the options
     * quired for.
     * @return a random alignment
     */
    public Alignment getRandomAlignment(){
        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        ArrayList<Alignment> allRecords = (ArrayList<Alignment>) session.createCriteria(Alignment.class).list();

        return  allRecords.get((int) Math.floor(Math.random() * allRecords.size()));
    }

    /**
     * Randomly generates a new character class out of all the options
     * quired for.
     * @return a random character class
     */
    public CharacterClass getRandomCharacterClass() {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        ArrayList<CharacterClass> allRecords = (ArrayList<CharacterClass>) session.createCriteria(CharacterClass.class).list();

        return allRecords.get((int) Math.floor(Math.random() * allRecords.size()));
    }

    /**
     * Randomly generates a new description out of all the options
     * quired for.
     * @return a random description
     */
    public Description getRandomDescription() {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        ArrayList<Description> allRecords = (ArrayList<Description>) session.createCriteria(Description.class).list();

        return  allRecords.get((int) Math.floor(Math.random() * allRecords.size()));
    }

    /**
     * Randomly generates a new origin out of all the options
     * quired for.
     * @return a random origin
     */
    public Origin getRandomOrigin(){
        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        ArrayList<Origin> allRecords = (ArrayList<Origin>) session.createCriteria(Origin.class).list();

        return  allRecords.get((int) Math.floor(Math.random() * allRecords.size()));
    }

    /**
     * Randomly generates a new quirk out of all the options
     * quired for.
     * @return a random quirk
     */
    public Quirk getRandomQuirk(){
        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        ArrayList<Quirk> allRecords = (ArrayList<Quirk>) session.createCriteria(Quirk.class).list();

        return  allRecords.get((int) Math.floor(Math.random() * allRecords.size()));
    }

    /**
     * Randomly generates a new race out of all the options
     * quired for.
     * @return a random race
     */
    public Race getRandomRace(){
        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        ArrayList<Race> allRecords = (ArrayList<Race>) session.createCriteria(Race.class).list();

        return  allRecords.get((int) Math.floor(Math.random() * allRecords.size()));
    }

}