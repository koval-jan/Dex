package com.dexvis.dex.task.vis.table

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class DataTable extends WebTask
{
  public DataTable()
  {
    super("Visualization: Table", "Data Table",
      "visualization/table/DataTable.html",
      "web/table/DataTable.gtmpl")
  }
}
