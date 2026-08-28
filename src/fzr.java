import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fzr {
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
   private fzr.a l = fzr.a.c;
   @Nullable
   private byte[] m;
   private fzr.c n;
   private fzr.b o = fzr.b.a;

   public fzr(String $$0, String $$1, fzr.c $$2) {
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

      if (this.l == fzr.a.a) {
         $$0.a("acceptTextures", true);
      } else if (this.l == fzr.a.b) {
         $$0.a("acceptTextures", false);
      }

      return $$0;
   }

   public fzr.a b() {
      return this.l;
   }

   public void a(fzr.a $$0) {
      this.l = $$0;
   }

   public static fzr a(ub $$0) {
      fzr $$1 = new fzr($$0.l("name"), $$0.l("ip"), fzr.c.c);
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
            $$1.a(fzr.a.a);
         } else {
            $$1.a(fzr.a.b);
         }
      } else {
         $$1.a(fzr.a.c);
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
      return this.n == fzr.c.a;
   }

   public boolean e() {
      return this.n == fzr.c.b;
   }

   public fzr.c f() {
      return this.n;
   }

   public void a(fzr $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(fzr $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
   }

   public fzr.b g() {
      return this.o;
   }

   public void a(fzr.b $$0) {
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
