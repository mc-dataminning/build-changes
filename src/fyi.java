import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fyi {
   private static final Logger j = LogUtils.getLogger();
   private static final int k = 1024;
   public String a;
   public String b;
   public xo c;
   public xo d;
   @Nullable
   public akd.b e;
   public long f;
   public int g = aa.b().e();
   public xo h = xo.b(aa.b().c());
   public List<xo> i = Collections.emptyList();
   private fyi.a l = fyi.a.c;
   @Nullable
   private byte[] m;
   private fyi.c n;
   private fyi.b o = fyi.b.a;

   public fyi(String $$0, String $$1, fyi.c $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public ur a() {
      ur $$0 = new ur();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      if (this.m != null) {
         $$0.a("icon", Base64.getEncoder().encodeToString(this.m));
      }

      if (this.l == fyi.a.a) {
         $$0.a("acceptTextures", true);
      } else if (this.l == fyi.a.b) {
         $$0.a("acceptTextures", false);
      }

      return $$0;
   }

   public fyi.a b() {
      return this.l;
   }

   public void a(fyi.a $$0) {
      this.l = $$0;
   }

   public static fyi a(ur $$0) {
      fyi $$1 = new fyi($$0.l("name"), $$0.l("ip"), fyi.c.c);
      if ($$0.b("icon", 8)) {
         try {
            byte[] $$2 = Base64.getDecoder().decode($$0.l("icon"));
            $$1.a(b($$2));
         } catch (IllegalArgumentException var3) {
            j.warn("Malformed base64 server icon", var3);
         }
      }

      if ($$0.b("acceptTextures", 1)) {
         if ($$0.q("acceptTextures")) {
            $$1.a(fyi.a.a);
         } else {
            $$1.a(fyi.a.b);
         }
      } else {
         $$1.a(fyi.a.c);
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
      return this.n == fyi.c.a;
   }

   public boolean e() {
      return this.n == fyi.c.b;
   }

   public fyi.c f() {
      return this.n;
   }

   public void a(fyi $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(fyi $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
   }

   public fyi.b g() {
      return this.o;
   }

   public void a(fyi.b $$0) {
      this.o = $$0;
   }

   @Nullable
   public static byte[] b(@Nullable byte[] $$0) {
      if ($$0 != null) {
         try {
            azd $$1 = azd.a($$0);
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

      private final xo d;

      private a(final String $$0) {
         this.d = xo.c("addServer.resourcePack." + $$0);
      }

      public xo a() {
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
