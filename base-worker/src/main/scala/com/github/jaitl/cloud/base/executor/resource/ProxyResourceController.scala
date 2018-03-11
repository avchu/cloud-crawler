package com.github.jaitl.cloud.base.executor.resource

import java.util.UUID

import akka.actor.Actor
import akka.actor.ActorLogging
import akka.actor.Props
import com.github.jaitl.cloud.base.executor.resource.ResourceController.RequestResource

private class ProxyResourceController extends Actor with ActorLogging{
  override def receive: Receive = {
    case RequestResource(requestId, taskType) =>

  }
}

private object ProxyResourceController {
  def props: Props = Props(new ProxyResourceController)
  def name: String = s"proxyResourceController"
}
