import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fxf {
   private static final Logger j = LogUtils.getLogger();
   private static final int k = 1024;
   public String a;
   public String b;
   public wx c;
   public wx d;
   @Nullable
   public ajl.b e;
   public long f;
   public int g = aa.b().e();
   public wx h = wx.b(aa.b().c());
   public List<wx> i = Collections.emptyList();
   private fxf.a l = fxf.a.c;
   @Nullable
   private byte[] m;
   private fxf.c n;
   private fxf.b o = fxf.b.a;

   public fxf(String $$0, String $$1, fxf.c $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public ud a() {
      ud $$0 = new ud();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      if (this.m != null) {
         $$0.a("icon", Base64.getEncoder().encodeToString(this.m));
      }

      if (this.l == fxf.a.a) {
         $$0.a("acceptTextures", true);
      } else if (this.l == fxf.a.b) {
         $$0.a("acceptTextures", false);
      }

      return $$0;
   }

   public fxf.a b() {
      return this.l;
   }

   public void a(fxf.a $$0) {
      this.l = $$0;
   }

   public static fxf a(ud $$0) {
      fxf $$1 = new fxf($$0.l("name"), $$0.l("ip"), fxf.c.c);
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
            $$1.a(fxf.a.a);
         } else {
            $$1.a(fxf.a.b);
         }
      } else {
         $$1.a(fxf.a.c);
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
      return this.n == fxf.c.a;
   }

   public boolean e() {
      return this.n == fxf.c.b;
   }

   public fxf.c f() {
      return this.n;
   }

   public void a(fxf $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(fxf $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
   }

   public fxf.b g() {
      return this.o;
   }

   public void a(fxf.b $$0) {
      this.o = $$0;
   }

   @Nullable
   public static byte[] b(@Nullable byte[] $$0) {
      if ($$0 != null) {
         try {
            ayh $$1 = ayh.a($$0);
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

      private final wx d;

      private a(String $$0) {
         this.d = wx.c("addServer.resourcePack." + $$0);
      }

      public wx a() {
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
