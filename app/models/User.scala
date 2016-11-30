package models

import javax.inject.Inject

import play.api.cache.CacheApi

/**
  * @author ashley.mercer
  */
case class User(id: Long, username: String)

/**
  * @param cacheApi injected reference to Play Cache
  */
class UserDao @Inject()(val cacheApi: CacheApi) {

  def find(id: Long): User = cacheApi.getOrElse[User] (id.toString) { User(id, "Ashley") }
}