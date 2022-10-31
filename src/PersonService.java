public class PersonService {
//anemic model example?
    public boolean isAdult(Person person){
        return person.getAge() > 18;
    }
}
