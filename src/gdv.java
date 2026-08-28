import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gdv {
   private static final Logger j = LogUtils.getLogger();
   private static final int k = 1024;
   public String a;
   public String b;
   public xj c;
   public xj d;
   @Nullable
   public akg.b e;
   public long f;
   public int g = ab.b().e();
   public xj h = xj.b(ab.b().c());
   public List<xj> i = Collections.emptyList();
   private gdv.a l = gdv.a.c;
   @Nullable
   private byte[] m;
   private gdv.c n;
   private gdv.b o = gdv.b.a;

   public gdv(String $$0, String $$1, gdv.c $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public ul a() {
      ul $$0 = new ul();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      if (this.m != null) {
         $$0.a("icon", Base64.getEncoder().encodeToString(this.m));
      }

      if (this.l == gdv.a.a) {
         $$0.a("acceptTextures", true);
      } else if (this.l == gdv.a.b) {
         $$0.a("acceptTextures", false);
      }

      return $$0;
   }

   public gdv.a b() {
      return this.l;
   }

   public void a(gdv.a $$0) {
      this.l = $$0;
   }

   public static gdv a(ul $$0) {
      gdv $$1 = new gdv($$0.l("name"), $$0.l("ip"), gdv.c.c);
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
            $$1.a(gdv.a.a);
         } else {
            $$1.a(gdv.a.b);
         }
      } else {
         $$1.a(gdv.a.c);
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
      return this.n == gdv.c.a;
   }

   public boolean e() {
      return this.n == gdv.c.b;
   }

   public gdv.c f() {
      return this.n;
   }

   public void a(gdv $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(gdv $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
   }

   public gdv.b g() {
      return this.o;
   }

   public void a(gdv.b $$0) {
      this.o = $$0;
   }

   @Nullable
   public static byte[] b(@Nullable byte[] $$0) {
      if ($$0 != null) {
         try {
            azr $$1 = azr.a($$0);
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

      private final xj d;

      private a(final String $$0) {
         this.d = xj.c("addServer.resourcePack." + $$0);
      }

      public xj a() {
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
