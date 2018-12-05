import com.company.task2.Person;
import com.google.gson.Gson;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;


class TestEquals {
    @Test
    void equalsContract() {
        Person person = new Person(1, "dew");
        Gson gson = new Gson();
        String res = gson.toJson(person);
        System.out.println(res);


        Person person2 = gson.fromJson(res, Person.class);
        System.out.println(person2.toString());
        EqualsVerifier.forClass(TestEquals.class).verify();
    }
}
