import com.google.common.net.HostAndPort;
import com.mojang.logging.LogUtils;
import java.net.IDN;
import org.slf4j.Logger;

public final class fzv {
   private static final Logger a = LogUtils.getLogger();
   private final HostAndPort b;
   private static final fzv c = new fzv(HostAndPort.fromParts("server.invalid", 25565));

   public fzv(String $$0, int $$1) {
      this(HostAndPort.fromParts($$0, $$1));
   }

   private fzv(HostAndPort $$0) {
      this.b = $$0;
   }

   public String a() {
      try {
         return IDN.toASCII(this.b.getHost());
      } catch (IllegalArgumentException var2) {
         return "";
      }
   }

   public int b() {
      return this.b.getPort();
   }

   public static fzv a(String $$0) {
      if ($$0 == null) {
         return c;
      } else {
         try {
            HostAndPort $$1 = HostAndPort.fromString($$0).withDefaultPort(25565);
            return $$1.getHost().isEmpty() ? c : new fzv($$1);
         } catch (IllegalArgumentException var2) {
            a.info("Failed to parse URL {}", $$0, var2);
            return c;
         }
      }
   }

   public static boolean b(String $$0) {
      try {
         HostAndPort $$1 = HostAndPort.fromString($$0);
         String $$2 = $$1.getHost();
         if (!$$2.isEmpty()) {
            IDN.toASCII($$2);
            return true;
         }
      } catch (IllegalArgumentException var3) {
      }

      return false;
   }

   static int c(String $$0) {
      try {
         return Integer.parseInt($$0.trim());
      } catch (Exception var2) {
         return 25565;
      }
   }

   @Override
   public String toString() {
      return this.b.toString();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof fzv ? this.b.equals(((fzv)$$0).b) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }
}
