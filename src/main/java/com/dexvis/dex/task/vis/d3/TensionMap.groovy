package com.dexvis.dex.task.vis.d3

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class TensionMap extends WebTask
{
  public TensionMap()
  {
    super("Visualization: D3", "Tension Map",
      "visualization/d3/TensionMap.html",
      "web/d3/TensionMap.gtmpl")
    setSaveDynamic(true)
  }
}
