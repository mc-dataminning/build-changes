import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gmd {
   private static final Logger j = LogUtils.getLogger();
   private static final int k = 1024;
   public String a;
   public String b;
   public xg c;
   public xg d;
   @Nullable
   public ako.b e;
   public long f;
   public int g = ac.b().e();
   public xg h = xg.b(ac.b().c());
   public List<xg> i = Collections.emptyList();
   private gmd.a l = gmd.a.c;
   @Nullable
   private byte[] m;
   private gmd.c n;
   private gmd.b o = gmd.b.a;

   public gmd(String $$0, String $$1, gmd.c $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public ua a() {
      ua $$0 = new ua();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      $$0.b("icon", azg.r, this.m);
      $$0.a(gmd.a.d, this.l);
      return $$0;
   }

   public gmd.a b() {
      return this.l;
   }

   public void a(gmd.a $$0) {
      this.l = $$0;
   }

   public static gmd a(ua $$0) {
      gmd $$1 = new gmd($$0.b("name", ""), $$0.b("ip", ""), gmd.c.c);
      $$1.a($$0.<byte[]>a("icon", azg.r).orElse(null));
      $$1.a($$0.<gmd.a>a(gmd.a.d).orElse(gmd.a.c));
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
      return this.n == gmd.c.a;
   }

   public boolean e() {
      return this.n == gmd.c.b;
   }

   public gmd.c f() {
      return this.n;
   }

   public void a(gmd $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(gmd $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
   }

   public gmd.b g() {
      return this.o;
   }

   public void a(gmd.b $$0) {
      this.o = $$0;
   }

   @Nullable
   public static byte[] b(@Nullable byte[] $$0) {
      if ($$0 != null) {
         try {
            baf $$1 = baf.a($$0);
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

      public static final MapCodec<gmd.a> d = Codec.BOOL.optionalFieldOf("acceptTextures").xmap($$0 -> $$0.<gmd.a>map($$0x -> $$0x ? a : b).orElse(c), $$0 -> {
         return switch ($$0) {
            case a -> Optional.of(true);
            case b -> Optional.of(false);
            case c -> Optional.empty();
         };
      });
      private final xg e;

      private a(final String $$0) {
         this.e = xg.c("addServer.resourcePack." + $$0);
      }

      public xg a() {
         return this.e;
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
