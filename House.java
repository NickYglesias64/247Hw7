public abstract class House {

    /**
     * Preps the foundation and builds all the houses
     */
    public final void prepFoundation() {
        System.out.println("Foundation: Adding a crawlspace, and a strong backbone.");
        createFrame();
        installDrywall();
        addWindows();
        addElectrical();
        addPlumbing();
    }

    /**
     * These are the various steps that are used to build the house
     */
    public abstract void createFrame();

    public void installDrywall(){
        System.out.println("Drywall: Creating hte interior walls.");
    }

    public void addWindows() {
        System.out.println("Windows: Putting in the glass for windows.");
    }
    public void addElectrical() {
        System.out.println("Electrical: Running all the wires and hooking up the power.");
    }
    public void addPlumbing() {
        System.out.println("Plumbing: Letting water run through the house.");
    }

}
