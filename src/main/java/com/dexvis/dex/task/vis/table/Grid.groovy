package com.dexvis.dex.task.vis.table

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class Grid extends WebTask
{
  public Grid()
  {
    super("Visualization: Table", "JQ Grid",
      "visualization/table/JQGrid.html",
      "web/table/JQGrid.gtmpl")
  }
}
