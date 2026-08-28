import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gms {
   private static final Logger j = LogUtils.getLogger();
   private static final int k = 1024;
   public String a;
   public String b;
   public xc c;
   public xc d;
   @Nullable
   public akh.b e;
   public long f;
   public int g = ac.b().e();
   public xc h = xc.b(ac.b().c());
   public List<xc> i = Collections.emptyList();
   private gms.a l = gms.a.c;
   @Nullable
   private byte[] m;
   private gms.c n;
   private gms.b o = gms.b.a;

   public gms(String $$0, String $$1, gms.c $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public ua a() {
      ua $$0 = new ua();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      $$0.b("icon", ayy.r, this.m);
      $$0.a(gms.a.d, this.l);
      return $$0;
   }

   public gms.a b() {
      return this.l;
   }

   public void a(gms.a $$0) {
      this.l = $$0;
   }

   public static gms a(ua $$0) {
      gms $$1 = new gms($$0.b("name", ""), $$0.b("ip", ""), gms.c.c);
      $$1.a($$0.<byte[]>a("icon", ayy.r).orElse(null));
      $$1.a($$0.<gms.a>a(gms.a.d).orElse(gms.a.c));
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
      return this.n == gms.c.a;
   }

   public boolean e() {
      return this.n == gms.c.b;
   }

   public gms.c f() {
      return this.n;
   }

   public void a(gms $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(gms $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
   }

   public gms.b g() {
      return this.o;
   }

   public void a(gms.b $$0) {
      this.o = $$0;
   }

   @Nullable
   public static byte[] b(@Nullable byte[] $$0) {
      if ($$0 != null) {
         try {
            azw $$1 = azw.a($$0);
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

      public static final MapCodec<gms.a> d = Codec.BOOL.optionalFieldOf("acceptTextures").xmap($$0 -> $$0.<gms.a>map($$0x -> $$0x ? a : b).orElse(c), $$0 -> {
         return switch ($$0) {
            case a -> Optional.of(true);
            case b -> Optional.of(false);
            case c -> Optional.empty();
         };
      });
      private final xc e;

      private a(final String $$0) {
         this.e = xc.c("addServer.resourcePack." + $$0);
      }

      public xc a() {
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
