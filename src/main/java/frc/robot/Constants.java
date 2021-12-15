// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

// IDENTIFICACIÓN PARA LOS CONTROLADORES DE MOTOR EN EL DRIVERTRAIN

public static final int MOTOR_RIGHT_0_ID = 0;
public static final int MOTOR_RIGHT_1_ID = 1;
public static final int MOTOR_LEFT_2_ID = 2;
public static final int MOTOR_LEFT_3_ID = 3;



// IDENTIFICACIÓN PARA EL JOYSTICK

public static final int GAME_PAD = 0;
public static final int ButtonA = 1;
public static final int ButtonB = 2;
public static final int ButtonX = 3;
public static final int ButtonY = 4;
public static final int ButtonLB = 5;
public static final int ButtonRB = 6;
public static final int ButtonBack = 7;
public static final int ButtonStart = 8;
public static final int ButtonJoyLeft = 9;


//CONSTANTES PARA AJUSTES DE SET POINT




// CONSTANTES DE VELOCIDAD MÁXIMA DE MOTORES DEL DRIVETRAIN

public static final double dampenSpeed = 0.8;
public static final double dampenturn = 0.6;
public static final double DT_ROTATION_SPEED = 0.35;

// CONSTANTES PARA MOTION PROFILING DEL DRIVETRAIN
public static final double kMaxSpeedMetersPerSecond= 1.5;
public static final double kMaxAccelerationMetersPerSecondSquared = 0.75;





}
