package com.dexvis.dex.task.vis.nvd3

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class StackedAreaChart extends WebTask
{
  public StackedAreaChart()
  {
    super("Visualization: NVD3", "Stacked Area Chart",
      "visualization/nvd3/StackedAreaChart.html",
      "web/nvd3/StackedAreaChart.gtmpl")
    setSaveDynamic(true)
  }
}
