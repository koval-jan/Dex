package com.dexvis.dex.wf;

import com.dexvis.dex.exception.DexException;
import javafx.stage.Stage;

import java.util.List;

public interface DexJob
{
  public DexJobState initialize() throws DexException;

  public DexJobState execute() throws DexException;
  
  public DexJobState terminate() throws DexException;

  public DexJobState suspend() throws DexException;

  public DexJobState start() throws DexException;
  
  public void setStage(Stage stage) throws DexException;
  public Stage getStage() throws DexException;
  
  public List<DexTask> getTaskList();
}
