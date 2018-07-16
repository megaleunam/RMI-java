
# The client, 
#!/usr/bin/env python
import sys
from omniORB import CORBA,PortableServer
import CosNaming, ClienteRemoto

# Initialise the ORB
javaParams =  ["ORBInitialHost", "localhost", "ORBInitialPort" "2809"]
orb = CORBA.ORB_init(javaParams, CORBA.ORB_ID)

# Obtain a reference to the root naming context
obj = orb.string_to_object("corbaloc::localhost:2809/NameService")
#obj         = orb.resolve_initial_references("NameService")
rootContext = obj._narrow(CosNaming.NamingContext)

if rootContext is None:
    print ("Failed to narrow the root naming context")
    sys.exit(1)

# Resolve the name "test.my_context/ExampleEcho.Object"
name = [CosNaming.NameComponent("ClienteRemoto", "")]
try:
    obj = rootContext.resolve(name)

except (CosNaming.NamingContext.NotFound):
    print( "Name not found")
    sys.exit(1)

# Narrow the object to an Example::Echo
eo = obj._narrow(ClienteRemoto.ClienteRem)

if eo is None:
    print ("Object reference is not an Example::Echo")
    sys.exit(1)

# Invoke the echoString operation
message = "Hello from Python"
fecha = "03/03/1983"
result  = eo.Saludar(message,message,message,fecha)

print ("I said '%s'. The object said '%s'." % (message,result))