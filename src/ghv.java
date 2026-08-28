import com.mojang.logging.LogUtils;
import java.util.Hashtable;
import java.util.Optional;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import org.slf4j.Logger;

@FunctionalInterface
public interface ghv {
   Logger a = LogUtils.getLogger();
   ghv b = $$0 -> Optional.empty();

   Optional<ghs> lookupRedirect(ghs var1);

   static ghv createDnsSrvRedirectHandler() {
      DirContext $$2;
      try {
         String $$0 = "com.sun.jndi.dns.DnsContextFactory";
         Class.forName("com.sun.jndi.dns.DnsContextFactory");
         Hashtable<String, String> $$1 = new Hashtable<>();
         $$1.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
         $$1.put("java.naming.provider.url", "dns:");
         $$1.put("com.sun.jndi.dns.timeout.retries", "1");
         $$2 = new InitialDirContext($$1);
      } catch (Throwable var3) {
         a.error("Failed to initialize SRV redirect resolved, some servers might not work", var3);
         return b;
      }

      return $$1x -> {
         if ($$1x.b() == 25565) {
            try {
               Attributes $$2x = $$2.getAttributes("_minecraft._tcp." + $$1x.a(), new String[]{"SRV"});
               Attribute $$3x = $$2x.get("srv");
               if ($$3x != null) {
                  String[] $$4x = $$3x.get().toString().split(" ", 4);
                  return Optional.of(new ghs($$4x[3], ghs.c($$4x[2])));
               }
            } catch (Throwable var5) {
            }
         }

         return Optional.empty();
      };
   }
}
