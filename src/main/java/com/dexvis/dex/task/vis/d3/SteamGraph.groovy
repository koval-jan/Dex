package com.dexvis.dex.task.vis.d3

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class SteamGraph extends WebTask
{
  public SteamGraph()
  {
    super("Visualization: D3", "SteamGraph",
      "visualization/d3/SteamGraph.html",
      "web/d3/SteamGraph.gtmpl")
    setSaveDynamic(true)
  }
}
