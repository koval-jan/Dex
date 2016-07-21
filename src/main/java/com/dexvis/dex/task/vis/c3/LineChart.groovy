package com.dexvis.dex.task.vis.c3

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class LineChart extends WebTask
{
  public LineChart()
  {
    super("Visualization: C3", "Line Chart",
      "visualization/c3/LineChart.html",
      "web/c3/LineChart.gtmpl")
    setSaveDynamic(true)
  }
}
