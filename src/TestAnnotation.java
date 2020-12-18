public class TestAnnotation {

    @BeforeSuite
    private void firstMethod(){
        System.out.println("БифорСвит");
    }


    @Test(priority = 1)
    private void doTestMethod1(){
        System.out.println("Тест метод1");
    }

    @Test(priority = 3)
    private void doTestMethod3(){
        System.out.println("Тест метод3");
    }

    @Test(priority = 2)
    private void doTestMethod2(){
        System.out.println("Тест метод2");
    }

    @Test(priority = 6)
    private void doTestMethod6(){
        System.out.println("Тест метод6");
    }

    @Test(priority = 9)
    private void doTestMethod9(){
        System.out.println("Тест метод9");
    }

    @AfterSuite
    private void doFinalMethod (){
        System.out.println("Final method");
    }






}
