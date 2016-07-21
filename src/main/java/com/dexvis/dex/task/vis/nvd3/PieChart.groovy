package com.dexvis.dex.task.vis.nvd3

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class PieChart extends WebTask
{
  public PieChart()
  {
    super("Visualization: NVD3", "Pie Chart",
      "visualization/nvd3/PieChart.html",
      "web/nvd3/PieChart.gtmpl")
  }
}
