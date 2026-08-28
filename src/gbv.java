import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gbv {
   private static final Logger j = LogUtils.getLogger();
   private static final int k = 1024;
   public String a;
   public String b;
   public xd c;
   public xd d;
   @Nullable
   public aka.b e;
   public long f;
   public int g = ab.b().e();
   public xd h = xd.b(ab.b().c());
   public List<xd> i = Collections.emptyList();
   private gbv.a l = gbv.a.c;
   @Nullable
   private byte[] m;
   private gbv.c n;
   private gbv.b o = gbv.b.a;

   public gbv(String $$0, String $$1, gbv.c $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public uf a() {
      uf $$0 = new uf();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      if (this.m != null) {
         $$0.a("icon", Base64.getEncoder().encodeToString(this.m));
      }

      if (this.l == gbv.a.a) {
         $$0.a("acceptTextures", true);
      } else if (this.l == gbv.a.b) {
         $$0.a("acceptTextures", false);
      }

      return $$0;
   }

   public gbv.a b() {
      return this.l;
   }

   public void a(gbv.a $$0) {
      this.l = $$0;
   }

   public static gbv a(uf $$0) {
      gbv $$1 = new gbv($$0.l("name"), $$0.l("ip"), gbv.c.c);
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
            $$1.a(gbv.a.a);
         } else {
            $$1.a(gbv.a.b);
         }
      } else {
         $$1.a(gbv.a.c);
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
      return this.n == gbv.c.a;
   }

   public boolean e() {
      return this.n == gbv.c.b;
   }

   public gbv.c f() {
      return this.n;
   }

   public void a(gbv $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(gbv $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
   }

   public gbv.b g() {
      return this.o;
   }

   public void a(gbv.b $$0) {
      this.o = $$0;
   }

   @Nullable
   public static byte[] b(@Nullable byte[] $$0) {
      if ($$0 != null) {
         try {
            azi $$1 = azi.a($$0);
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

      private final xd d;

      private a(final String $$0) {
         this.d = xd.c("addServer.resourcePack." + $$0);
      }

      public xd a() {
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
