package com.dexvis.dex.task.vis.dexcharts

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class Sql2Table extends WebTask
{
  public Sql2Table()
  {
    super("Visualization: Dex Charts", "Sql -> Table",
     "visualization/dex_charts/Sql2Table.html",
     "web/dexcharts/Sql2Table.gtmpl")
    setSaveDynamic(true)
  }
}
