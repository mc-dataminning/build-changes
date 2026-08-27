import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record zb(UUID c, String d, String e, boolean f, Optional<wi> g) implements yp<yv> {
   public static final int a = 40;
   public static final yg<ByteBuf, zb> b = yg.a(jh.g, zb::b, ye.k, zb::e, ye.b(40), zb::f, ye.b, zb::g, wk.f.a(ye::a), zb::h, zb::new);

   public zb(UUID c, String d, String e, boolean f, Optional<wi> g) {
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
   public yr<zb> a() {
      return zf.f;
   }

   public void a(yv $$0) {
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

   public Optional<wi> h() {
      return this.g;
   }
}
