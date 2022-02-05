package state.pattern;

public interface State {
    void onEnterState();
    void observe();
}
