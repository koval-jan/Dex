package com.dexvis.dex.task.tablemanipulation;

import com.dexvis.dex.exception.DexException;
import com.dexvis.dex.wf.DexTask;
import com.dexvis.dex.wf.DexTaskState;
import org.simpleframework.xml.Root;

@Root
public class AddRowNumber extends DexTask
{
  public AddRowNumber()
  {
    super("Table Manipulation", "Add Row Number",
        "table_manipulation/AddRowNumber.html");
  }
  
  public DexTaskState execute(DexTaskState state) throws DexException
  {
    state.getDexData().getHeader().add(0, "RI");
    for (int row = 0; row < state.getDexData().getData().size(); row++)
    {
      state.getDexData().getData().get(row).add(0, "" + (row + 1));
    }
    return state;
  }
}
