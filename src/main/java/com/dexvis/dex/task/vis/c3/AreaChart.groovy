package com.dexvis.dex.task.vis.c3

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class AreaChart extends WebTask
{
  public AreaChart()
  {
    super("Visualization: C3", "Area Chart",
      "visualization/c3/AreaChart.html",
      "web/c3/AreaChart.gtmpl")
    setSaveDynamic(true)
  }
}
