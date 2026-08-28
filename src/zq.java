import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record zq(UUID c, String d, String e, boolean f, Optional<ww> g) implements zd<zj> {
   public static final int a = 40;
   public static final yu<ByteBuf, zq> b = yu.a(jy.g, zq::b, ys.o, zq::e, ys.b(40), zq::f, ys.b, zq::g, wy.f.a(ys::a), zq::h, zq::new);

   public zq(UUID c, String d, String e, boolean f, Optional<ww> g) {
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
   public zf<zq> a() {
      return zv.g;
   }

   public void a(zj $$0) {
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

   public Optional<ww> h() {
      return this.g;
   }
}
