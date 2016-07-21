package com.dexvis.dex.task.vis.d3

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class StackedRadar extends WebTask
{
  public StackedRadar()
  {
    super("Visualization: D3", "Stacked Radar",
      "visualization/d3/StackedRadar.html",
      "web/d3/StackedRadar.gtmpl")
    setSaveDynamic(true)
  }
}
