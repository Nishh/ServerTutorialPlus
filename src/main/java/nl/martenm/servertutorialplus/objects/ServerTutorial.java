package nl.martenm.servertutorialplus.objects;

import nl.martenm.servertutorialplus.points.ServerTutorialPoint;

import java.util.ArrayList;
import java.util.List;

/**
 * The ServerTutorial class represents a single sever tutorial. It contains all the data about the tutorial.
 * The object contains a List which contains TutorialPoints. These points store the unique data for each point.
 * @author MartenM
 * @since 5-3-2017.
 */
public class ServerTutorial {

    public ServerTutorial(String id){
        this.id = id;
        this.points = new ArrayList<>();
        this.rewards = new ArrayList<>();
    }

    public ServerTutorial(String id, List<ServerTutorialPoint> points){
        this.id = id;
        this.points = points;
        this.rewards = new ArrayList<>();
    }

    public ServerTutorial(String id, List<ServerTutorialPoint> points, List<String> rewards){
        this.id = id;
        this.points = points;
        this.rewards = rewards;
    }

    private String id;

    /**
     * Public variable for tracking plays.
     */
    public int plays;

    public boolean invisiblePlayer;

    /**
    * The list of TutorialPoints for this tutorial.
     */
    public List<ServerTutorialPoint> points;

    /**
     * List of rewards that are given when the tutorial is completed for the first time.
     */
    private List<String> rewards;

    /**
     * If the user should have the permission 'servertutorialplus.tutorial.ID to play this tutorial.
     */
    private boolean needsPermission;

    /**
    * The unique id of the server tutorial.
    * @return id
     */
    public String getId() {
        return id;
    }

    /**
    * Sets the unique id of a server tutorial.
    * USE WITH CAUTION!
     * @param id The new ID.
     */
    public void setId(String id) {
        this.id = id;
    }

    public List<String> getRewards() {
        return rewards;
    }

    public void setRewards(List<String> rewards) {
        if(rewards == null) this.rewards = new ArrayList<>();

        this.rewards = rewards;
    }

    /**
     * Gets if you need permission to play this tutorial.
     * @return If permission is needed.
     */
    public boolean getNeedsPermission() {
        return needsPermission;
    }

    /**
     * Sets if you need permission to play this tutorial.
     * @param needsPermission true means permission is needed.
     */
    public void setNeedsPermission(boolean needsPermission) {
        this.needsPermission = needsPermission;
    }
}