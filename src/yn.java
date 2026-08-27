import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record yn(UUID c, String d, String e, boolean f, Optional<vu> g) implements yb<yh> {
   public static final int a = 40;
   public static final xs<ByteBuf, yn> b = xs.a(jf.g, yn::b, xq.i, yn::e, xq.b(40), yn::f, xq.a, yn::g, vw.d.a(xq::a), yn::h, yn::new);

   public yn(UUID c, String d, String e, boolean f, Optional<vu> g) {
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
   public yd<yn> a() {
      return yr.f;
   }

   public void a(yh $$0) {
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

   public Optional<vu> h() {
      return this.g;
   }
}
