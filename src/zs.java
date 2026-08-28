import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record zs(UUID c, String d, String e, boolean f, Optional<wy> g) implements zf<zl> {
   public static final int a = 40;
   public static final yw<ByteBuf, zs> b = yw.a(kg.g, zs::b, yu.l, zs::e, yu.b(40), zs::f, yu.b, zs::g, xa.f.a(yu::a), zs::h, zs::new);

   public zs(UUID c, String d, String e, boolean f, Optional<wy> g) {
      if (e.length() > 40) {
         throw new IllegalArgumentException("Hash is too long (max 40, was " + e.length() + ")");
      } else {
         this.c = c;
         this.d = d;
         this.e = e;
         this.f = f;
         this.g = g;
      }
   }

   @Override
   public zh<zs> a() {
      return zx.g;
   }

   public void a(zl $$0) {
      $$0.a(this);
   }

   public UUID b() {
      return this.c;
   }

   public String e() {
      return this.d;
   }

   public String f() {
      return this.e;
   }

   public boolean g() {
      return this.f;
   }

   public Optional<wy> h() {
      return this.g;
   }
}
