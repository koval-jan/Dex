package com.dexvis.dex.wf;

import com.dexvis.dex.exception.DexException;
import com.dexvis.javafx.scene.control.DexTaskItem;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class ParallelJob implements DexJob
{
  private Stage stage = null;
  private List<DexTask> taskList = new ArrayList<DexTask>();

  public ParallelJob(List<DexTaskItem> itemList)
  {
    for (DexTaskItem item : itemList)
    {
      if (item != null)
      {
        if (item.getTask() != null)
        {
          DexTask task = item.getTask().get();
          if (task != null)
          {
            taskList.add(task);
          }
        }
      }
    }
  }

  @Override
  public DexJobState initialize() throws DexException
  {
    DexJobState status = DexJobState.startState();
    DexTaskState state = new DexTaskState();

    for (DexTask task : taskList)
    {
      state = task.initialize(state);
    }

    return status;
  }

  @Override
  public DexJobState execute() throws DexException
  {
    DexJobState status = DexJobState.startState();
    DexTaskState state = new DexTaskState();

    // Need independent task state for each task.
    for (DexTask task : taskList)
    {
      state = task.execute(state);
    }

    return status;
  }

  @Override
  public DexJobState terminate() throws DexException
  {
    DexJobState status = DexJobState.startState();
    DexTaskState state = new DexTaskState();

    for (DexTask task : taskList)
    {
      state = task.terminate(state);
    }

    return status;
  }

  @Override
  public DexJobState suspend() throws DexException
  {
    DexJobState status = DexJobState.startState();
    DexTaskState state = new DexTaskState();

    for (DexTask task : taskList)
    {
      state = task.suspend(state);
    }

    return status;
  }

  @Override
  public DexJobState start() throws DexException
  {
    DexJobState status = DexJobState.startState();
    DexTaskState state = new DexTaskState();

    for (DexTask task : taskList)
    {
      state = task.start(state);
    }

    return status;
  }

  @Override
  public void setStage(Stage stage) throws DexException
  {
    this.stage = stage;
  }

  @Override
  public Stage getStage() throws DexException
  {
    return stage;
  }

  @Override
  public List<DexTask> getTaskList()
  {
    return taskList;
  }
}
