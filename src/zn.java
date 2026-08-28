import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record zn(UUID c, String d, String e, boolean f, Optional<wu> g) implements zb<zh> {
   public static final int a = 40;
   public static final ys<ByteBuf, zn> b = ys.a(kd.g, zn::b, yq.l, zn::e, yq.b(40), zn::f, yq.b, zn::g, ww.f.a(yq::a), zn::h, zn::new);

   public zn(UUID c, String d, String e, boolean f, Optional<wu> g) {
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
   public zd<zn> a() {
      return zr.f;
   }

   public void a(zh $$0) {
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

   public Optional<wu> h() {
      return this.g;
   }
}
