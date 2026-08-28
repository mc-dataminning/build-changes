import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record zp(UUID c, String d, String e, boolean f, Optional<wv> g) implements zc<zi> {
   public static final int a = 40;
   public static final yt<ByteBuf, zp> b = yt.a(km.g, zp::b, yr.o, zp::e, yr.b(40), zp::f, yr.b, zp::g, wx.f.a(yr::a), zp::h, zp::new);

   public zp(UUID c, String d, String e, boolean f, Optional<wv> g) {
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
   public ze<zp> a() {
      return zu.g;
   }

   public void a(zi $$0) {
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

   public Optional<wv> h() {
      return this.g;
   }
}
