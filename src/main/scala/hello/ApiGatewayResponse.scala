package hello

import scala.beans.BeanProperty

case class ApiGatewayResponse(@BeanProperty statusCode: Int, @BeanProperty body: String)

case class Body(@BeanProperty message: String, @BeanProperty input: Request)