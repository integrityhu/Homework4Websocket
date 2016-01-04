/**
 * 
 */
package hu.infokristaly.homework4u.websocket;

import java.io.IOException;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 * @author pzoli
 * http://docs.oracle.com/javaee/7/tutorial/doc/websocket001.htm
 * http://www.tutorialspoint.com/html5/html5_websocket.htm
 * http://www.html5rocks.com/en/tutorials/file/dndfiles/
 * https://github.com/vincentdieltiens/WebSocketFileTransfer
 * https://www.websocket.org/echo.html
 * 
 */
@ServerEndpoint("/echo")
public class EchoEndpoint {

    @OnMessage
    public void onMessage(Session session, String msg) {
       try {
          session.getBasicRemote().sendText(msg);
       } catch (IOException e) { 
           System.out.println(e.getMessage());
       }
    }
}
