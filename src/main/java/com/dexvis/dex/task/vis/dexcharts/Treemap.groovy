package com.dexvis.dex.task.vis.dexcharts

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class Treemap extends WebTask
{
  public Treemap()
  {
    super("Visualization: Dex Charts", "Treemap",
      "visualization/dex_charts/Treemap.html",
      "web/dexcharts/Treemap.gtmpl")
    setSaveDynamic(true)
  }
}
