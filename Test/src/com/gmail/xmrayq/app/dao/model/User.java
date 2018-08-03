package com.gmail.xmrayq.app.dao.model;

public class User {

    private long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    private User(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.password = builder.password;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public static Builder newBuilder() {

        return new Builder();
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {

        return password;
    }


    public String getFirstName() {

        return firstName;
    }


    public String getLastName() {

        return lastName;
    }


    public static final class Builder {
        private long id;
        private String email;
        private String password;
        private String firstName;
        private String lastName;

        private Builder() {
        }

        public Builder withId(Long value) {
            id = value;
            return this;
        }

        public Builder withEmail(String value) {
            email = value;
            return this;
        }

        public Builder withPassword(String value) {
            password = value;
            return this;
        }

        public Builder withFirstName(String value) {
            firstName = value;
            return this;
        }

        public Builder withLastName(String value) {
            lastName = value;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
