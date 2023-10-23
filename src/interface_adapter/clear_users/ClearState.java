package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    private String[] userUsernames = null;

    public ClearState(ClearState copy) {
        this.userUsernames = copy.userUsernames;
    }

    public ClearState() {
    }

    public void setUserUsernames(String[] userUsernames) {
        this.userUsernames = userUsernames;
    }

    public String[] getUserUsernames() {
        return userUsernames;
    }
}
