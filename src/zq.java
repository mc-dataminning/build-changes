import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record zq(UUID c, String d, String e, boolean f, Optional<wx> g) implements ze<zk> {
   public static final int a = 40;
   public static final yv<ByteBuf, zq> b = yv.a(jr.g, zq::b, yt.k, zq::e, yt.b(40), zq::f, yt.b, zq::g, wz.f.a(yt::a), zq::h, zq::new);

   public zq(UUID c, String d, String e, boolean f, Optional<wx> g) {
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
   public zg<zq> a() {
      return zu.f;
   }

   public void a(zk $$0) {
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

   public Optional<wx> h() {
      return this.g;
   }
}
