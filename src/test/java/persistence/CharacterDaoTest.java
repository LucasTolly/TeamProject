package persistence;

import entity.GeneratedCharacter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tolly on 4/12/2017.
 */
public class CharacterDaoTest {

    CharacterDao dao;

    @Before
    public void setup() { dao = new CharacterDao(); }

    @Test
    public void createNewCharacter() throws Exception {
        GeneratedCharacter newCharacter = dao.generateCharacter();
    }
}
