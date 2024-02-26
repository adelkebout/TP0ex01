import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class PersonneTest {
    @Test
    public void GetfullnameTest(){
        Personne person= new Personne("KEBOUT", "Adel", 23);
        String fullname = person.getFullName();
        Assertions.assertEquals("KEBOUT Adel", fullname);
    }
    @Test
    public void idAdultShouldReturnTrueIfAgeIsGreaterThanOrEqualto18FalseIFAgeIsLessTHhan18(){
        Personne person= new Personne("KEBOUT", "Adel", 23);
        Boolean Age = person.isAdult();
        Assertions.assertTrue(Age);

    }
}
