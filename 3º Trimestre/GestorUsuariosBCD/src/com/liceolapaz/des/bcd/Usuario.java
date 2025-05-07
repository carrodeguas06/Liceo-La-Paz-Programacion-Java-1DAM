package com.liceolapaz.des.bcd;

public class Usuario
{
    private int id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;

    @Override
    public String toString() {
        return "    {" +
                "       \"id\":" + id + ",\n" +
                "       \"email\":" + "\""+email + "\"" + "\n" +
                "       \"first_name\":" + "\"" + first_name + "\"" + "\n" +
                "       \"last_name\":" + "\"" + last_name + "\"" + "\n" +
                "       \"avatar\":" + "\"" + avatar + "\"" + "\n" +
                "   },";
    }

    public Usuario(int id, String email, String first_name, String last_name, String avatar) {
        this.id = id;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.avatar = avatar;
    }
}
