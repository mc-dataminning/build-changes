import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ghn {
   private static final Logger j = LogUtils.getLogger();
   private static final int k = 1024;
   public String a;
   public String b;
   public wp c;
   public wp d;
   @Nullable
   public ajr.b e;
   public long f;
   public int g = ab.b().e();
   public wp h = wp.b(ab.b().c());
   public List<wp> i = Collections.emptyList();
   private ghn.a l = ghn.a.c;
   @Nullable
   private byte[] m;
   private ghn.c n;
   private ghn.b o = ghn.b.a;

   public ghn(String $$0, String $$1, ghn.c $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public tq a() {
      tq $$0 = new tq();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      if (this.m != null) {
         $$0.a("icon", Base64.getEncoder().encodeToString(this.m));
      }

      if (this.l == ghn.a.a) {
         $$0.a("acceptTextures", true);
      } else if (this.l == ghn.a.b) {
         $$0.a("acceptTextures", false);
      }

      return $$0;
   }

   public ghn.a b() {
      return this.l;
   }

   public void a(ghn.a $$0) {
      this.l = $$0;
   }

   public static ghn a(tq $$0) {
      ghn $$1 = new ghn($$0.l("name"), $$0.l("ip"), ghn.c.c);
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
            $$1.a(ghn.a.a);
         } else {
            $$1.a(ghn.a.b);
         }
      } else {
         $$1.a(ghn.a.c);
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
      return this.n == ghn.c.a;
   }

   public boolean e() {
      return this.n == ghn.c.b;
   }

   public ghn.c f() {
      return this.n;
   }

   public void a(ghn $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(ghn $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
   }

   public ghn.b g() {
      return this.o;
   }

   public void a(ghn.b $$0) {
      this.o = $$0;
   }

   @Nullable
   public static byte[] b(@Nullable byte[] $$0) {
      if ($$0 != null) {
         try {
            aze $$1 = aze.a($$0);
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

      private final wp d;

      private a(final String $$0) {
         this.d = wp.c("addServer.resourcePack." + $$0);
      }

      public wp a() {
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
