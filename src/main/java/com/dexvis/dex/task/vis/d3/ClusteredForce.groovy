package com.dexvis.dex.task.vis.d3

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class ClusteredForce extends WebTask
{
  public ClusteredForce()
  {
    super("Visualization: D3", "Clustered Force",
      "visualization/d3/ClusteredForce.html",
      "web/d3/ClusteredForce.gtmpl")
    setSaveDynamic(true)
  }
}
