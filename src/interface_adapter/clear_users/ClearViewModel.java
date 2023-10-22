package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;

public class ClearViewModel extends ViewModel {
    private ClearState state = new ClearState();

    public ClearViewModel() {
        super("");  //TODO
    }

    @Override
    public void firePropertyChanged() {

    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    }
}
