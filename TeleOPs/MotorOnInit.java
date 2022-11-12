package org.firstinspires.ftc.teamcode;

// Import stuff
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

// tells the app that it is a TeleOP 
@TeleOp
// the word after class it needs to be the same name as 
//the file name that you are creating
public class MotorOnInit extends LinearOpMode {


  // maka a var for the Motors so that the java robot can add the thing into a var which we can use for later
  private DcMotor Motor1;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    // Make sure the robot config  
    Motor1 = hardwareMap.dcMotor.get("Motor1");
    // Put initialization blocks here.
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        // this is a loop so if you run this on the app it 
        // will go forver
        telemetry.update();
          Motor1.setPower(5);
          telemetry.addData("Motor1", "power added 5");
          telemetry.update();
      }
    }
  }
}