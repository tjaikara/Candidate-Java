package autopilot;

public interface INavigator {
    Coordinate[] route(Coordinate spaceshipPosition, Coordinate[] destinations);
}
