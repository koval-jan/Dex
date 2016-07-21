package com.dexvis.dex.task.vis.nvd3

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class DonutChart extends WebTask
{
  public DonutChart()
  {
    super("Visualization: NVD3", "Donut Chart",
      "visualization/nvd3/DonutChart.html",
      "web/nvd3/DonutChart.gtmpl")
  }
}
