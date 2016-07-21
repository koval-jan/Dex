package com.dexvis.dex.task.vis.d3

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class PartitionLayout extends WebTask
{
  public PartitionLayout()
  {
    super("Visualization: D3", "Partition Layout",
      "visualization/d3/PartitionLayout.html",
      "web/d3/PartitionLayout.gtmpl")
    setSaveDynamic(true)
  }
}
