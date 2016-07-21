package com.dexvis.dex.task.vis.table

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class BlueTable extends WebTask
{
  public BlueTable()
  {
    super("Visualization: Table", "Blue Table",
      "visualization/table/BlueTable.html",
      "web/table/BlueTable.gtmpl")
  }
}
