package com.dexvis.dex.task.vis.nvd3

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class MultiHorBarChart extends WebTask
{
  public MultiHorBarChart()
  {
    super("Visualization: NVD3", "MultiHorBarChart",
      "visualization/nvd3/MultiHorBarChart.html",
      "web/nvd3/MultiHorBarChart.gtmpl")
  }
}
