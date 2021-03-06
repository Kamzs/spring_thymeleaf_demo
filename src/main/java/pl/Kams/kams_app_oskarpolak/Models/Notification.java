package pl.Kams.kams_app_oskarpolak.Models;

public class Notification
{
    String name;
    String surname;
    String email;
    String data;

    public Notification(){};

    public Notification(Builder builder)
    {
        name = builder.name;
        surname = builder.surname;
        email = builder.email;
        data = builder.data;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    public class Builder
    {

        String name;
        String surname;
        String email;
        String data;

        public Builder(String name)
        {
            this.name = name;
        }

        public Builder surname( String surname)
        {
            this.surname = surname;
            return this;
        }

        public Builder email ( String email )
        {
            this.email = email ;
            return this;
        }

        public Builder data ( String data)
        {
            this.data = data ;
            return this;
        }

        public Notification build ()
        {
            return new Notification(this);
        }

    }
}
