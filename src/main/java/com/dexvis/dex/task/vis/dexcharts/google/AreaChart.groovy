package com.dexvis.dex.task.vis.dexcharts.google

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class AreaChart extends WebTask
{
  public AreaChart()
  {
    super("Visualization: Google", "Area Chart",
      "visualization/google/AreaChart.html",
      "web/google/AreaChart.gtmpl")
  }
}
