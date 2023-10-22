package use_case.clear_users;

// TODO Complete me  -- Done --

public class ClearOutputData {
    private final String[] userUsernames;

    private boolean useCaseFailed;

    public ClearOutputData(String[] userUsernames, boolean useCaseFailed) {
        this.userUsernames = userUsernames;
        this.useCaseFailed = useCaseFailed;
    }

    public String[] getUsers() {return userUsernames; }
}
