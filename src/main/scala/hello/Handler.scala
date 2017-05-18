package hello

import com.amazonaws.services.lambda.runtime.{Context, RequestHandler}
import com.fasterxml.jackson.databind.ObjectMapper

class Handler extends RequestHandler[Request, ApiGatewayResponse] {

  def handleRequest(input: Request, context: Context): ApiGatewayResponse = {
    val om = new ObjectMapper
    ApiGatewayResponse(
      200,
      om.writeValueAsString(Body("Go Serverless v1.0! Your function executed successfully!", input))
    )
  }
  
}
