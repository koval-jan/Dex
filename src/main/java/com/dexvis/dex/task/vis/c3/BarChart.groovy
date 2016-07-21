package com.dexvis.dex.task.vis.c3

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class BarChart extends WebTask
{
  public BarChart()
  {
    super("Visualization: C3", "Bar Chart", "visualization/c3/BarChart.html",
    "web/c3/BarChart.gtmpl")
    setSaveDynamic(true)
  }
}
