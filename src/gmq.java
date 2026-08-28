import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gmq {
   private static final Logger j = LogUtils.getLogger();
   private static final int k = 1024;
   public String a;
   public String b;
   public xa c;
   public xa d;
   @Nullable
   public akf.b e;
   public long f;
   public int g = ac.b().e();
   public xa h = xa.b(ac.b().c());
   public List<xa> i = Collections.emptyList();
   private gmq.a l = gmq.a.c;
   @Nullable
   private byte[] m;
   private gmq.c n;
   private gmq.b o = gmq.b.a;

   public gmq(String $$0, String $$1, gmq.c $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public tz a() {
      tz $$0 = new tz();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      $$0.b("icon", ayw.r, this.m);
      $$0.a(gmq.a.d, this.l);
      return $$0;
   }

   public gmq.a b() {
      return this.l;
   }

   public void a(gmq.a $$0) {
      this.l = $$0;
   }

   public static gmq a(tz $$0) {
      gmq $$1 = new gmq($$0.b("name", ""), $$0.b("ip", ""), gmq.c.c);
      $$1.a($$0.<byte[]>a("icon", ayw.r).orElse(null));
      $$1.a($$0.<gmq.a>a(gmq.a.d).orElse(gmq.a.c));
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
      return this.n == gmq.c.a;
   }

   public boolean e() {
      return this.n == gmq.c.b;
   }

   public gmq.c f() {
      return this.n;
   }

   public void a(gmq $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(gmq $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
   }

   public gmq.b g() {
      return this.o;
   }

   public void a(gmq.b $$0) {
      this.o = $$0;
   }

   @Nullable
   public static byte[] b(@Nullable byte[] $$0) {
      if ($$0 != null) {
         try {
            azu $$1 = azu.a($$0);
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

      public static final MapCodec<gmq.a> d = Codec.BOOL.optionalFieldOf("acceptTextures").xmap($$0 -> $$0.<gmq.a>map($$0x -> $$0x ? a : b).orElse(c), $$0 -> {
         return switch ($$0) {
            case a -> Optional.of(true);
            case b -> Optional.of(false);
            case c -> Optional.empty();
         };
      });
      private final xa e;

      private a(final String $$0) {
         this.e = xa.c("addServer.resourcePack." + $$0);
      }

      public xa a() {
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
