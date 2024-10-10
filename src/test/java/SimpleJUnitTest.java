import org.junit.jupiter.api.*;


public class SimpleJUnitTest {
    int result;
    @BeforeAll
    static void beforeAll(){
        System.out.println("###    beforeAll()\n");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("###    afterAll()");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("###    beforeEach");
        result = getResult();
    }
    @AfterEach
    void afterEach(){
        int result = getResult();
        System.out.println("###    afterEach()\n");
        result = 0;
    }
    private  int getResult(){
        return 3;
    }

    @Test
    void firstTest() {
        System.out.println("###    firstTest()");
        Assertions.assertTrue(result>2);
    }
    @Test
    void secondTest() {
        System.out.println("###    secondTest()");
        Assertions.assertTrue(result>2);
    }
    @Test
    void thirdTest() {
        System.out.println("###    thirdTest()");
        Assertions.assertTrue(result>2);
    }

}
