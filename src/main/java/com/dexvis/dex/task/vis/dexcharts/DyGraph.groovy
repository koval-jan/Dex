package com.dexvis.dex.task.vis.dexcharts

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class DygraphLineChart extends WebTask
{
  public DygraphLineChart()
  {
    super("Visualization: Dex Charts", "DyGraph",
      "visualization/dex_charts/DygraphLineChart.html",
      "web/dexcharts/dygraph/LineChart.gtmpl")
    setSaveDynamic(true)
  }
}
