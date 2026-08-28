import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class glf {
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
   private glf.a l = glf.a.c;
   @Nullable
   private byte[] m;
   private glf.c n;
   private glf.b o = glf.b.a;

   public glf(String $$0, String $$1, glf.c $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public tz a() {
      tz $$0 = new tz();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      $$0.b("icon", ayu.r, this.m);
      $$0.a(glf.a.d, this.l);
      return $$0;
   }

   public glf.a b() {
      return this.l;
   }

   public void a(glf.a $$0) {
      this.l = $$0;
   }

   public static glf a(tz $$0) {
      glf $$1 = new glf($$0.j("name"), $$0.j("ip"), glf.c.c);
      $$1.a($$0.<byte[]>a("icon", ayu.r).orElse(null));
      $$1.a($$0.<glf.a>a(glf.a.d).orElse(glf.a.c));
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
      return this.n == glf.c.a;
   }

   public boolean e() {
      return this.n == glf.c.b;
   }

   public glf.c f() {
      return this.n;
   }

   public void a(glf $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(glf $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
   }

   public glf.b g() {
      return this.o;
   }

   public void a(glf.b $$0) {
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

      public static final MapCodec<glf.a> d = Codec.BOOL.optionalFieldOf("acceptTextures").xmap($$0 -> $$0.<glf.a>map($$0x -> $$0x ? a : b).orElse(c), $$0 -> {
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
