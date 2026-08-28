import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fzt {
   private static final Logger j = LogUtils.getLogger();
   private static final int k = 1024;
   public String a;
   public String b;
   public wz c;
   public wz d;
   @Nullable
   public ajq.b e;
   public long f;
   public int g = ab.b().e();
   public wz h = wz.b(ab.b().c());
   public List<wz> i = Collections.emptyList();
   private fzt.a l = fzt.a.c;
   @Nullable
   private byte[] m;
   private fzt.c n;
   private fzt.b o = fzt.b.a;

   public fzt(String $$0, String $$1, fzt.c $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public ub a() {
      ub $$0 = new ub();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      if (this.m != null) {
         $$0.a("icon", Base64.getEncoder().encodeToString(this.m));
      }

      if (this.l == fzt.a.a) {
         $$0.a("acceptTextures", true);
      } else if (this.l == fzt.a.b) {
         $$0.a("acceptTextures", false);
      }

      return $$0;
   }

   public fzt.a b() {
      return this.l;
   }

   public void a(fzt.a $$0) {
      this.l = $$0;
   }

   public static fzt a(ub $$0) {
      fzt $$1 = new fzt($$0.l("name"), $$0.l("ip"), fzt.c.c);
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
            $$1.a(fzt.a.a);
         } else {
            $$1.a(fzt.a.b);
         }
      } else {
         $$1.a(fzt.a.c);
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
      return this.n == fzt.c.a;
   }

   public boolean e() {
      return this.n == fzt.c.b;
   }

   public fzt.c f() {
      return this.n;
   }

   public void a(fzt $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(fzt $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
   }

   public fzt.b g() {
      return this.o;
   }

   public void a(fzt.b $$0) {
      this.o = $$0;
   }

   @Nullable
   public static byte[] b(@Nullable byte[] $$0) {
      if ($$0 != null) {
         try {
            ayt $$1 = ayt.a($$0);
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

      private final wz d;

      private a(final String $$0) {
         this.d = wz.c("addServer.resourcePack." + $$0);
      }

      public wz a() {
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
