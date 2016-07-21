package com.dexvis.dex;

import com.dexvis.dex.exception.DexException;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.Serializable;

public interface DataFilter extends Serializable, Comparable
{
  public DexData initialize(DexData data) throws DexException;
  
  public DexData process(DexData data) throws DexException;
  
  public String getCategory();
  
  public String getName();
  
  public void setName(String name);
  
  public Node getHelp();
  
  public Node getConfig();
  
  public Image getImage();
  
  public Stage getStage();
  
  public void setStage(Stage stage);
}
