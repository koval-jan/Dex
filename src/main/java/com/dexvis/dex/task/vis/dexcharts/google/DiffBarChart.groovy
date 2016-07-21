package com.dexvis.dex.task.vis.dexcharts.google

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class DiffBarChart extends WebTask
{
  public DiffBarChart()
  {
    super("Visualization : Google", "Diff Bar Chart",
      "visualization/google/DiffBarChart.html",
      "web/dexcharts/google/DiffBarChart.gtmpl")
    setSaveDynamic(true)
  }
}
