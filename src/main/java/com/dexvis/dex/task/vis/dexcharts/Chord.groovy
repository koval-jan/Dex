package com.dexvis.dex.task.vis.dexcharts

import com.dexvis.dex.task.base.WebTask
import com.dexvis.util.TaskPropertyFactory
import org.simpleframework.xml.Root

@Root
class Chord extends WebTask {
  public Chord() {
    super("Visualization: Dex Charts", "Chord",
      "visualization/dex_charts/ChordDiagram.html",
      "web/dexcharts/Chord.gtmpl")

    setProperty('Dimensions', 'Height', 'height', 600)
    setProperty('Dimensions', 'Width', 'width', 800)
    setProperty('Dimensions', 'Transform', 'transform', '')
    setProperty('Dimensions', 'Resizable', 'resizable', true)
    setProperty('Dimensions', 'Padding', 'padding', '')
    setProperty('Dimensions', 'Inner Radius', 'innerRadius', '')
    setProperty('Dimensions', 'Outer Radius', 'outerRadius', '')
    

    addProperties(TaskPropertyFactory.createStrokeProperties('Node (Mouseout)', 'nodes.mouseout.stroke'))
    addProperties(TaskPropertyFactory.createFillProperties('Node (Mouseover)', 'nodes.mouseover.fill'))
    addProperties(TaskPropertyFactory.createStrokeProperties('Node (Mouseout)', 'nodes.mouseout.stroke'))
    addProperties(TaskPropertyFactory.createFillProperties('Node (Mouseover)', 'nodes.mouseover.fill'))
    addProperties(TaskPropertyFactory.createLinkProperties('Links (Mouseout)', 'links.mouseout'))
    addProperties(TaskPropertyFactory.createLinkProperties('Links (Mouseover)', 'links.mouseover'))
    addProperties(TaskPropertyFactory.createEditableTextProperties('Title', 'title'))
    addProperties(TaskPropertyFactory.createTextProperties('Label', 'label'))
    addProperties(TaskPropertyFactory.createTickProperties('Ticks', 'tick'))
    
    setSaveDynamic(true)
  }
}
