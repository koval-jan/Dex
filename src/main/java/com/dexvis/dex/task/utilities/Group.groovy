package com.dexvis.dex.task.utilities

import com.dexvis.dex.exception.DexException
import com.dexvis.dex.wf.DexTask
import com.dexvis.dex.wf.DexTaskState
import javafx.scene.Node
import org.simpleframework.xml.Root
import org.tbee.javafx.scene.layout.MigPane

@Root
class Group extends DexTask
{
  private MigPane configPane = null

  public Group()
  {
    super("Utilities", "Group", "utilities/Group.html")
  }

  public DexTaskState initialize(DexTaskState state) throws DexException
  {
    return execute(state)
  }

  public DexTaskState execute(DexTaskState state) throws DexException
  {
    println "Running: $name"
    return state
  }

  public Node getConfig()
  {
//    if (configPane == null)
//    {
//      configPane = new MigPane("insets 1", "[grow]", "[][]")
//      configPane.setStyle("-fx-background-color: white;")
//
//      configPane.add(NodeFactory.createTitle("Group Configuration"), "grow,span")
//    }

    return configPane
  }

}
