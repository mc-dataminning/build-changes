import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fyx {
   private static final Logger j = LogUtils.getLogger();
   private static final int k = 1024;
   public String a;
   public String b;
   public wu c;
   public wu d;
   @Nullable
   public ajj.b e;
   public long f;
   public int g = aa.b().e();
   public wu h = wu.b(aa.b().c());
   public List<wu> i = Collections.emptyList();
   private fyx.a l = fyx.a.c;
   @Nullable
   private byte[] m;
   private fyx.c n;
   private fyx.b o = fyx.b.a;

   public fyx(String $$0, String $$1, fyx.c $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public tx a() {
      tx $$0 = new tx();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      if (this.m != null) {
         $$0.a("icon", Base64.getEncoder().encodeToString(this.m));
      }

      if (this.l == fyx.a.a) {
         $$0.a("acceptTextures", true);
      } else if (this.l == fyx.a.b) {
         $$0.a("acceptTextures", false);
      }

      return $$0;
   }

   public fyx.a b() {
      return this.l;
   }

   public void a(fyx.a $$0) {
      this.l = $$0;
   }

   public static fyx a(tx $$0) {
      fyx $$1 = new fyx($$0.l("name"), $$0.l("ip"), fyx.c.c);
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
            $$1.a(fyx.a.a);
         } else {
            $$1.a(fyx.a.b);
         }
      } else {
         $$1.a(fyx.a.c);
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
      return this.n == fyx.c.a;
   }

   public boolean e() {
      return this.n == fyx.c.b;
   }

   public fyx.c f() {
      return this.n;
   }

   public void a(fyx $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(fyx $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
   }

   public fyx.b g() {
      return this.o;
   }

   public void a(fyx.b $$0) {
      this.o = $$0;
   }

   @Nullable
   public static byte[] b(@Nullable byte[] $$0) {
      if ($$0 != null) {
         try {
            ayl $$1 = ayl.a($$0);
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

      private final wu d;

      private a(final String $$0) {
         this.d = wu.c("addServer.resourcePack." + $$0);
      }

      public wu a() {
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
