package mydomain.model;

import javax.jdo.annotations.*;

@PersistenceCapable(detachable="true", table="person")
public class Person
{
    @PrimaryKey
    Long id;

    Integer integer;

    public Person(long id, Integer integer)
    {
        this.id = id;
        this.integer = integer;
    }

    public Integer getInteger()
    {
        return integer;
    }

    public void setInteger(Integer integer)
    {
        this.integer = integer;
    }

    public Long getId()
    {
        return id;
    }
}
