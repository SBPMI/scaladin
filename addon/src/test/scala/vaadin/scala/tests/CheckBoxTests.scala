package vaadin.scala.tests

import vaadin.scala._
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CheckBoxTests extends FunSuite {

  test("Default constructor") {
    val checkBox = new CheckBox()
    assert(checkBox.caption === None)
    assert(checkBox.value === Some(false))
    assert(checkBox.immediate === false)
    assert(checkBox.icon === None)
    assert(checkBox.p.getStyleName === "")
    assert(checkBox.enabled === true)
    assert(checkBox.description === None)
  }

  test("value") {
    val checkBox = new CheckBox()

    assert(checkBox.value === Some(false))

    checkBox.value = true
    assert(checkBox.value === Some(true))
  }

  test("booleanValue") {
    val checkBox = new CheckBox()

    assert(checkBox.booleanValue === false)

    checkBox.value = true
    assert(checkBox.booleanValue === true)
  }

  // TODO test focus and blur listeners
}