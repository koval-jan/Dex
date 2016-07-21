package com.dexvis.dex.task.vis.d3

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class NodeLinkTree extends WebTask
{
  public NodeLinkTree()
  {
    super("Visualization: D3", "Node Link Tree",
      "visualization/d3/NodeLinkTree.html",
      "web/d3/NodeLinkTree.gtmpl")
    setSaveDynamic(true)
  }
}
