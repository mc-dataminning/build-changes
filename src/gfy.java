import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gfy {
   private static final Logger j = LogUtils.getLogger();
   private static final int k = 1024;
   public String a;
   public String b;
   public xv c;
   public xv d;
   @Nullable
   public akw.b e;
   public long f;
   public int g = ab.b().e();
   public xv h = xv.b(ab.b().c());
   public List<xv> i = Collections.emptyList();
   private gfy.a l = gfy.a.c;
   @Nullable
   private byte[] m;
   private gfy.c n;
   private gfy.b o = gfy.b.a;

   public gfy(String $$0, String $$1, gfy.c $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public ux a() {
      ux $$0 = new ux();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      if (this.m != null) {
         $$0.a("icon", Base64.getEncoder().encodeToString(this.m));
      }

      if (this.l == gfy.a.a) {
         $$0.a("acceptTextures", true);
      } else if (this.l == gfy.a.b) {
         $$0.a("acceptTextures", false);
      }

      return $$0;
   }

   public gfy.a b() {
      return this.l;
   }

   public void a(gfy.a $$0) {
      this.l = $$0;
   }

   public static gfy a(ux $$0) {
      gfy $$1 = new gfy($$0.l("name"), $$0.l("ip"), gfy.c.c);
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
            $$1.a(gfy.a.a);
         } else {
            $$1.a(gfy.a.b);
         }
      } else {
         $$1.a(gfy.a.c);
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
      return this.n == gfy.c.a;
   }

   public boolean e() {
      return this.n == gfy.c.b;
   }

   public gfy.c f() {
      return this.n;
   }

   public void a(gfy $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(gfy $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
   }

   public gfy.b g() {
      return this.o;
   }

   public void a(gfy.b $$0) {
      this.o = $$0;
   }

   @Nullable
   public static byte[] b(@Nullable byte[] $$0) {
      if ($$0 != null) {
         try {
            baj $$1 = baj.a($$0);
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

      private final xv d;

      private a(final String $$0) {
         this.d = xv.c("addServer.resourcePack." + $$0);
      }

      public xv a() {
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
