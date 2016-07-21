package com.dexvis.dex.task.vis.nvd3

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class LineChart extends WebTask
{
  public LineChart()
  {
    super("Visualization: NVD3", "LineChart",
      "visualization/nvd3/LineChart.html",
      "web/nvd3/LineChart.gtmpl")
  }
}
