import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gla {
   private static final Logger j = LogUtils.getLogger();
   private static final int k = 1024;
   public String a;
   public String b;
   public wy c;
   public wy d;
   @Nullable
   public akd.b e;
   public long f;
   public int g = ac.b().e();
   public wy h = wy.b(ac.b().c());
   public List<wy> i = Collections.emptyList();
   private gla.a l = gla.a.c;
   @Nullable
   private byte[] m;
   private gla.c n;
   private gla.b o = gla.b.a;

   public gla(String $$0, String $$1, gla.c $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public tz a() {
      tz $$0 = new tz();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      $$0.b("icon", ayu.r, this.m);
      $$0.a(gla.a.d, this.l);
      return $$0;
   }

   public gla.a b() {
      return this.l;
   }

   public void a(gla.a $$0) {
      this.l = $$0;
   }

   public static gla a(tz $$0) {
      gla $$1 = new gla($$0.j("name"), $$0.j("ip"), gla.c.c);
      $$1.a($$0.<byte[]>a("icon", ayu.r).orElse(null));
      $$1.a($$0.<gla.a>a(gla.a.d).orElse(gla.a.c));
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
      return this.n == gla.c.a;
   }

   public boolean e() {
      return this.n == gla.c.b;
   }

   public gla.c f() {
      return this.n;
   }

   public void a(gla $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(gla $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
   }

   public gla.b g() {
      return this.o;
   }

   public void a(gla.b $$0) {
      this.o = $$0;
   }

   @Nullable
   public static byte[] b(@Nullable byte[] $$0) {
      if ($$0 != null) {
         try {
            azs $$1 = azs.a($$0);
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

      public static final MapCodec<gla.a> d = Codec.BOOL.optionalFieldOf("acceptTextures").xmap($$0 -> $$0.<gla.a>map($$0x -> $$0x ? a : b).orElse(c), $$0 -> {
         return switch ($$0) {
            case a -> Optional.of(true);
            case b -> Optional.of(false);
            case c -> Optional.empty();
         };
      });
      private final wy e;

      private a(final String $$0) {
         this.e = wy.c("addServer.resourcePack." + $$0);
      }

      public wy a() {
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
