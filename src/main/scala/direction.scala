abstract class direction(val angle:Int) {
  def rotate(angle:Int):direction = {
    val angleNew = angle + (angle % 360)
  }

}
