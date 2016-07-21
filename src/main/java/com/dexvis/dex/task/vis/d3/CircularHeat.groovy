package com.dexvis.dex.task.vis.d3

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class CircularHeat extends WebTask
{
  public CircularHeat()
  {
    super("Visualization: D3", "Circular Heat",
      "visualization/d3/CircularHeat.html",
      "web/d3/CircularHeat.gtmpl")
    setSaveDynamic(true)
  }
}
