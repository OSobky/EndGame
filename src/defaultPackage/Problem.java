package defaultPackage;

import java.util.Collection;

public interface Problem {
	
	public Object getInitialState(String grid);
    public boolean isGoal(Object state);
    public Collection<Object> getActions(Object state);
    public Object getNextState(Object state,Object action);
    public double getStepCost(Object start, Object action, Object dest);

}
