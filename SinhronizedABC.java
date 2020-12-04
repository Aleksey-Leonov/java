public  class SinhronizedABC {
    private int count = 5;
    private String currentLetter = "A";

    public void printA (){
        synchronized (this) {
            for (int i = 0; i < count; i++) {
                while (!currentLetter.equals("A")) {
                    try {
                        wait();   //пока currentLetter не равно А, будем ждать.
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                    System.out.print("A");
                    currentLetter = "B";
                    notifyAll();
            }
        }
    }

    public void printB (){
        synchronized (this) {
            for (int i = 0; i < count; i++) {
                while (!currentLetter.equals("B")) {
                    try {
                        wait();   //пока currentLetter не равно А, будем ждать.
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("B");
                currentLetter = "C";
                notifyAll();
            }
        }
    }

    public void printC (){
        synchronized (this) {
            for (int i = 0; i < count; i++) {
                while (!currentLetter.equals("C")) {
                    try {
                        wait();   //пока currentLetter не равно А, будем ждать.
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("C");
                currentLetter = "A";
                notifyAll();
            }
        }
    }

}