package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ServerAlreadyActive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u25/1514/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, September 17, 2014 5:32:44 PM PDT
*/

public final class ServerAlreadyActive extends org.omg.CORBA.UserException
{
  public String serverId = null;

  public ServerAlreadyActive ()
  {
    super(ServerAlreadyActiveHelper.id());
  } // ctor

  public ServerAlreadyActive (String _serverId)
  {
    super(ServerAlreadyActiveHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerAlreadyActive (String $reason, String _serverId)
  {
    super(ServerAlreadyActiveHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerAlreadyActive
