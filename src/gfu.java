import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gfu {
   private static final Logger j = LogUtils.getLogger();
   private static final int k = 1024;
   public String a;
   public String b;
   public xk c;
   public xk d;
   @Nullable
   public akm.b e;
   public long f;
   public int g = ab.b().e();
   public xk h = xk.b(ab.b().c());
   public List<xk> i = Collections.emptyList();
   private gfu.a l = gfu.a.c;
   @Nullable
   private byte[] m;
   private gfu.c n;
   private gfu.b o = gfu.b.a;

   public gfu(String $$0, String $$1, gfu.c $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public um a() {
      um $$0 = new um();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      if (this.m != null) {
         $$0.a("icon", Base64.getEncoder().encodeToString(this.m));
      }

      if (this.l == gfu.a.a) {
         $$0.a("acceptTextures", true);
      } else if (this.l == gfu.a.b) {
         $$0.a("acceptTextures", false);
      }

      return $$0;
   }

   public gfu.a b() {
      return this.l;
   }

   public void a(gfu.a $$0) {
      this.l = $$0;
   }

   public static gfu a(um $$0) {
      gfu $$1 = new gfu($$0.l("name"), $$0.l("ip"), gfu.c.c);
      if ($$0.b("icon", 8)) {
         try {
            byte[] $$2 = Base64.getDecoder().decode($$0.l("icon"));
            $$1.a(b($$2));
         } catch (IllegalArgumentException var3) {
            j.warn("Malformed base64 server icon", var3);
         }
      }

      if ($$0.b("acceptTextures", 99)) {
         if ($$0.q("acceptTextures")) {
            $$1.a(gfu.a.a);
         } else {
            $$1.a(gfu.a.b);
         }
      } else {
         $$1.a(gfu.a.c);
      }

      return $$1;
   }

   @Nullable
   public byte[] c() {
      return this.m;
   }

   public void a(@Nullable byte[] $$0) {
      this.m = $$0;
   }

   public boolean d() {
      return this.n == gfu.c.a;
   }

   public boolean e() {
      return this.n == gfu.c.b;
   }

   public gfu.c f() {
      return this.n;
   }

   public void a(gfu $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(gfu $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
   }

   public gfu.b g() {
      return this.o;
   }

   public void a(gfu.b $$0) {
      this.o = $$0;
   }

   @Nullable
   public static byte[] b(@Nullable byte[] $$0) {
      if ($$0 != null) {
         try {
            azz $$1 = azz.a($$0);
            if ($$1.a() <= 1024 && $$1.b() <= 1024) {
               return $$0;
            }
         } catch (IOException var2) {
            j.warn("Failed to decode server icon", var2);
         }
      }

      return null;
   }

   public static enum a {
      a("enabled"),
      b("disabled"),
      c("prompt");

      private final xk d;

      private a(final String $$0) {
         this.d = xk.c("addServer.resourcePack." + $$0);
      }

      public xk a() {
         return this.d;
      }
   }

   public static enum b {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum c {
      a,
      b,
      c;
   }
}
