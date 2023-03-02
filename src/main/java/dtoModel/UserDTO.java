package dtoModel;

public class UserDTO {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public UserDTO(String name, String password, Long id) {
        this.name = name;
        this.password = password;
        this.id = id;
    }

    private String name;
    private String password;
    private Long id;


}
