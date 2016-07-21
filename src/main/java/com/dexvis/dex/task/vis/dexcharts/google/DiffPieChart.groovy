package com.dexvis.dex.task.vis.dexcharts.google

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class DiffPieChart extends WebTask
{
  public DiffPieChart()
  {
    super("Visualization : Google", "Diff Pie Chart",
      "visualization/google/DiffPieChart.html",
      "web/dexcharts/google/DiffPieChart.gtmpl")
    setSaveDynamic(true)
  }
}
