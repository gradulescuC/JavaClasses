public class Test {
    int anFabricatie;
    String model;
    final int MAXSPEED = 150;
    int kilometraj;
    int actualSpeed;

    public void accelerate(int speed) {
        System.out.println("Vruum");
        actualSpeed += speed; // am crescut viteza initiala cu valoarea vitezei data ca parametru.
        if (actualSpeed > MAXSPEED) {
            System.out.println("Ai depasit limita de viteza");
            actualSpeed = MAXSPEED;
        } else if (actualSpeed < 0) {
            System.out.println("Error!");
        }
    }

        public void franare(){
            while (actualSpeed != 0) {
                actualSpeed--;
            }
            System.out.println("Stop!");
        }
}