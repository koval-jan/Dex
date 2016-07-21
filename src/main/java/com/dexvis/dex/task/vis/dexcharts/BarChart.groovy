package com.dexvis.dex.task.vis.dexcharts

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class BarChart extends WebTask
{
  public BarChart()
  {
    super("Visualization: Dex Charts", "Bar Chart",
      "visualization/dex_charts/BarChart.html",
      "web/dexcharts/BarChart.gtmpl")
    setSaveDynamic(true)
  }
}
