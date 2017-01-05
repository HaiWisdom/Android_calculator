package ca.uwaterloo.ms8lcalculator;

import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.robotium.solo.Solo;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Wisdom H Jiang on 2016-09-25.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);
    private Solo solo;

    @Before
    public void setUp() throws Exception {
        //setUp() is run before a test case is started.
        //This is where the solo object is created.
        solo = new Solo(InstrumentationRegistry.getInstrumentation(), mActivityRule.getActivity());
    }

    @After
    public void tearDown() throws Exception {
        //tearDown() is run after a test case has finished.
        //finishOpenedActivities() will finish all the activities that have been opened during the test execution.
        solo.finishOpenedActivities();
    }

    @Test
    public void testSingleInput() throws Exception {
        //Unlock the lock screen
        solo.unlockScreen();
        solo.assertCurrentActivity("Expected Main Activity", MainActivity.class);
        //test input with single digit
        solo.clickOnView(solo.getView(R.id.zero));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.c));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.one));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.c));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.two));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.c));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.three));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.c));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.four));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.c));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.five));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.c));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.six));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.c));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.seven));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.c));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.eight));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.c));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.nine));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.c));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.c));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.squareRoot));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.percent));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.plus));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.minus));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.multiply));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.divide));
        solo.sleep(1000);
        solo.clickOnView(solo.getView(R.id.backSpace));
    }

    @Test
    public void testMultipleInput() throws Exception {
        solo.unlockScreen();
        solo.assertCurrentActivity("Expected Main Activity", MainActivity.class);
        //zero at the beginning
        solo.clickOnView(solo.getView(R.id.zero));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.one));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.two));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.c));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.zero));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.zero));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.three));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.four));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.five));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.c));
        solo.sleep(500);

        //zero not at the beginning
        solo.clickOnView(solo.getView(R.id.six));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.seven));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.eight));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.nine));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.c));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.six));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.point));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.eight));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.nine));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.c));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.six));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.point));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.point));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.zero));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.c));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.one));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.zero));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.one));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.zero));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.point));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.one));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.zero));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.c));
        solo.sleep(500);
    }

    @Test
    public void testOperation() throws Exception {
        solo.unlockScreen();
        solo.assertCurrentActivity("Expected Main Activity", MainActivity.class);

        //plus
        solo.clickOnView(solo.getView(R.id.one));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.plus));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.two));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.zero));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.plus));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.nine));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);


        solo.clickOnView(solo.getView(R.id.five));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.six));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.plus));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.two));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.three));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.one));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.point));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.four));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.plus));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.two));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);

        //minus
        solo.clickOnView(solo.getView(R.id.one));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.minus));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.two));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.zero));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.minus));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.nine));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);


        solo.clickOnView(solo.getView(R.id.five));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.six));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.minus));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.two));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.three));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.one));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.point));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.four));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.minus));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.two));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);

        //multiply
        solo.clickOnView(solo.getView(R.id.one));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.multiply));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.two));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.zero));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.multiply));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.nine));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);


        solo.clickOnView(solo.getView(R.id.five));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.six));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.multiply));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.two));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.three));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.one));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.point));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.four));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.multiply));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.two));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);


        //divide
        solo.clickOnView(solo.getView(R.id.one));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.divide));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.two));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.zero));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.divide));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.nine));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);


        solo.clickOnView(solo.getView(R.id.five));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.six));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.divide));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.two));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.three));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.one));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.point));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.four));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.divide));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.two));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.one));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.point));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.four));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.divide));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.zero));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);


        //multiple operators
        solo.clickOnView(solo.getView(R.id.four));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.plus));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.five));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.plus));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.three));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.four));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.minus));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.five));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.minus));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.three));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.four));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.multiply));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.five));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.multiply));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.three));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.four));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.divide));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.five));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.divide));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.three));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);

        //multiple complex operators
        solo.clickOnView(solo.getView(R.id.four));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.plus));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.five));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.minus));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.three));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.four));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.multiply));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.five));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.minus));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.three));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.four));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.plus));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.five));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.divide));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.three));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.four));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.multiply));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.five));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.divide));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.three));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);

        //percent
        solo.clickOnView(solo.getView(R.id.five));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.six));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.percent));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.five));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.six));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.point));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.seven));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.eight));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.percent));
        solo.sleep(500);

        //squareRoot
        solo.clickOnView(solo.getView(R.id.five));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.six));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.squareRoot));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.five));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.six));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.point));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.seven));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.eight));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.squareRoot));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.zero));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.squareRoot));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.minus));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.six));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.squareRoot));
        solo.sleep(500);

        solo.clickOnView(solo.getView(R.id.minus));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.six));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.equal));
        solo.sleep(500);
        solo.clickOnView(solo.getView(R.id.squareRoot));
        solo.sleep(500);
    }
}
