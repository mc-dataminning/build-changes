import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record yl(UUID c, String d, String e, boolean f, Optional<vs> g) implements xz<yf> {
   public static final int a = 40;
   public static final xq<ByteBuf, yl> b = xq.a(je.g, yl::b, xo.i, yl::e, xo.b(40), yl::f, xo.a, yl::g, vu.d.a(xo::a), yl::h, yl::new);

   public yl(UUID c, String d, String e, boolean f, Optional<vs> g) {
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
   public yb<yl> a() {
      return yp.f;
   }

   public void a(yf $$0) {
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

   public Optional<vs> h() {
      return this.g;
   }
}
