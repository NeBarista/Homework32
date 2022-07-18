public class Main {
    public static int playerNumber = 1;
    public static int playerNumber1countSteps = 0;
    public static void main(String[] args) {
        doStep(1, "step1");
        doStep(2, "step2");
        doStep(1, "step3");
        doStep(2, "step4");
        doStep(1, "step5");
        doStep(2, "step6");
        doStep(1, "step7");
        doStep(2, "step8");

    }
    private static void doStep(int playerNumber1, String step) {
        if(playerNumber1 == playerNumber) {
            if(playerNumber1 == 1) {
                if (playerNumber1countSteps == 0) {
                    playerNumber1countSteps++;
                    System.out.println(step);
                } else if (playerNumber1countSteps == 1) {
                    playerNumber1countSteps = 0;
                    System.out.println(step);
                    playerNumber = 2;
                }
            }else {
                System.out.println(step);
                playerNumber =1;
            }

        }
    }

}
