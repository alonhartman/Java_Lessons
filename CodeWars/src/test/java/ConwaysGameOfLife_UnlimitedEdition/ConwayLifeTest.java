package ConwaysGameOfLife_UnlimitedEdition;

import org.junit.Test;

public class ConwayLifeTest{

    @Test
    public void testGlider() {
        int[][][] gliders = {
                {{1,0,0},
                        {0,1,1},
                        {1,1,0}},
                {{0,1,0},
                        {0,0,1},
                        {1,1,1}}
        };
        System.out.println("Glider");
//        LifeDebug.print(gliders[0]);
        int[][] res = ConwayLife.getGeneration(gliders[0], 1);
//        assertTrue("Got \n" + LifeDebug.htmlize(res) + "\ninstead of\n" + LifeDebug.htmlize(gliders[1]), LifeDebug.equals(res, gliders[1]));
    }

}