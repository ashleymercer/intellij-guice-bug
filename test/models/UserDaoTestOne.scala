package models

import org.scalatestplus.play.{OneAppPerSuite, PlaySpec}

/**
  * @author ashley.mercer
  */
class UserDaoTestOne extends PlaySpec with OneAppPerSuite {

  "UserDao" should {
    val dao = app.injector.instanceOf[UserDao]

    "load a user" in {
      val user = dao.find(123)
      System.out.println(s"Got user ${user.username}")
    }
  }
}
