package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    private String[] userUsernames = new String[0];

    public ClearState(ClearState copy) {
        this.userUsernames = copy.userUsernames;
    }

    public ClearState() {
    }

    public String[] getUserUsernames() {
        return userUsernames;
    }
}
