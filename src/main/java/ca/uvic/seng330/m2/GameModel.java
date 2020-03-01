package ca.uvic.seng330.m2;


public class GameModel {
  private static final GameModel INSTANCE = new GameModel();

  private GameModel() {  }

  public static GameModel instance() { return INSTANCE; } }