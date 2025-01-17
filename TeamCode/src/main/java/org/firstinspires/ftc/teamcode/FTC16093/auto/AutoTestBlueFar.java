package org.firstinspires.ftc.teamcode.FTC16093.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
public class AutoTestBlueFar extends AutoMaster {
    @Override
    public void runOpMode() throws InterruptedException{

        startSide = DISTAL;
        side_color = BLUE;

        initHardware();
        spikeMarkDump();
        putOnSpikeMark();
        DistalBackDropDump();
        sleep(300);
        upper.setArmPosition(1950);
        sleep(wait_time);

        upper.grab2_open(); //yellow
        upper.setArmPosition(1870);
        sleep(200);
        upper.grab2_close();

        backDrop_move();
        sleep(sleep_2);
        putOnBackDrop_grab1();
        sleep(sleep_3);
        setUpAuto();
        sleep(2500);
        parking(2);
    }
}

