package use_case.clear_users;


public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessInterface;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary userPresenter) {
        this.userDataAccessInterface = userDataAccessInterface;
        this.userPresenter = userPresenter;
    }

    @Override
    public void execute() {
        String[] userUsernames = userDataAccessInterface.getUserUsernames();

        userDataAccessInterface.delete();

        ClearOutputData clearOutputData = new ClearOutputData(userUsernames, false);
        userPresenter.prepareSuccessView(clearOutputData);
   }
}

