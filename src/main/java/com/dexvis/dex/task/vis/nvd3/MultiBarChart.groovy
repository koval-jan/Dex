package com.dexvis.dex.task.vis.nvd3

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class MultiBarChart extends WebTask
{
  public MultiBarChart()
  {
    super("Visualization: NVD3", "MultiBarChart",
      "visualization/nvd3/MultiBarChart.html",
      "web/nvd3/MultiBarChart.gtmpl")
  }
}
