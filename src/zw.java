import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record zw(UUID c, String d, String e, boolean f, Optional<xc> g) implements zj<zp> {
   public static final int a = 40;
   public static final za<ByteBuf, zw> b = za.a(ka.g, zw::b, yy.p, zw::e, yy.b(40), zw::f, yy.b, zw::g, xe.f.a(yy::a), zw::h, zw::new);

   public zw(UUID c, String d, String e, boolean f, Optional<xc> g) {
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
   public zl<zw> a() {
      return aab.g;
   }

   public void a(zp $$0) {
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

   public Optional<xc> h() {
      return this.g;
   }
}
