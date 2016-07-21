package com.dexvis.dex.task.vis.dexcharts.dygraphs

import com.dexvis.dex.task.base.WebTask
import org.simpleframework.xml.Root

@Root
class LineChart extends WebTask {
  public LineChart() {
    super("Visualization: Dex Charts", "Dygraphs Line Chart",
      "visualization/dygraph/LineChart.html",
      "web/dexcharts/dygraphs/LineChart.gtmpl")

//    def config = [
//      'height'       : [ 'category' : 'Dimensions', 'name' : 'Height',       'value' : '' ],
//      'width'        : [ 'category' : 'Dimensions', 'name' : 'Width',        'value' : '' ]
//    ];
//
//    List<DexTaskProperty> propList = TaskPropertyFactory.create(this, config);
//    setPropertySheet(propList);

    setSaveDynamic(true)
  }
}
