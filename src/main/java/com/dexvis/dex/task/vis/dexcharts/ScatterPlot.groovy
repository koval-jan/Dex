package com.dexvis.dex.task.vis.dexcharts

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class ScatterPlot extends WebTask
{
  public ScatterPlot()
  {
    super("Visualization: Dex Charts", "ScatterPlot",
      "visualization/dex_charts/Scatterplot.html",
      "web/dexcharts/ScatterPlot.gtmpl")
    setSaveDynamic(true)
  }
}
